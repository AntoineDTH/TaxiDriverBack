package com.inti.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Annonce;
import com.inti.entities.Commentaire;
import com.inti.entities.Course;
import com.inti.entities.Evaluation;
import com.inti.entities.Reclamation;
import com.inti.entities.Reservation;
import com.inti.entities.Trajet;
import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.IAnnonceService;
import com.inti.services.interfaces.ICommentaireService;
import com.inti.services.interfaces.ICourseService;
import com.inti.services.interfaces.IEvaluationService;
import com.inti.services.interfaces.IReclamationService;
import com.inti.services.interfaces.IReservationService;
import com.inti.services.interfaces.IUtilisateurService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionUsers")
public class UtilisateurController {

	@Autowired
	IUtilisateurService service;
	@Autowired
	ICourseService serviceCourse;
	@Autowired
	IReservationService serviceResa;
	@Autowired
	ICommentaireService serviceCom;
	@Autowired
	IEvaluationService serviceEval;
	@Autowired
	IReclamationService serviceReclam;
	@Autowired
	IAnnonceService serviceAnnonce;
	@Autowired
	PasswordEncoder passwordEncoder;

	
	//CRUD
	@PostMapping("/users")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		Utilisateur user = new Utilisateur();
		user.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
		user.setUsername(utilisateur.getUsername());
		user.setNom(utilisateur.getNom());
		user.setPrenom(utilisateur.getPrenom());
		user.setRoles(utilisateur.getRoles());
		return service.saveUtilisateur(user);
	}

	@GetMapping("/users")
	public List<Utilisateur> findAll() {
		return service.findAll();
	}

	@GetMapping("/users/{idUser}")
	public Utilisateur findOne(@PathVariable("idUser") Long id) {
		return service.findOne(id);
	}

	@DeleteMapping("/users/{idUser}")
	public void deleteUtilisateur(@PathVariable("idUser") Long id) {
		service.deleteUtilisateur(id);
	}

	
	//Services métiers
	@PostMapping("/course")
	public Course creerCourse(@RequestParam("arrivee") String arrivee, @RequestParam("depart") String depart, @RequestParam("idchauffeur") String idChauffeur) {

		Random rand = new Random();
				
		Trajet trajet = new Trajet();
		trajet.setArrivee(arrivee);
		trajet.setDepart(depart);
		trajet.setDistance(rand.ints(20, 50).findFirst().getAsInt());
		
		Utilisateur chauffeur = service.findOne(Long.parseLong(idChauffeur));

		Course course = new Course();
		course.setAccepted(false);
		course.setTrajet(trajet);
		course.setChauffeur(chauffeur);

		return serviceCourse.saveCourse(course);
	}

	@PostMapping("/reservation")
	public Reservation creerReservation(@RequestParam("idcourse") String idCourse, @RequestParam("idclients") String client) {

		Reservation resa = new Reservation();
		
		Course course = serviceCourse.findOne(Long.parseLong(idCourse));
		List<Utilisateur> clients = new ArrayList<Utilisateur>();
		Utilisateur clIn = service.findOne(Long.parseLong(client));
		clients.add(clIn);
		
		resa.setCourse(course);
		resa.setClients(clients);

		return serviceResa.saveReservation(resa);
	}

	@PostMapping("/evaluation")
	public Evaluation creerEval(@RequestParam("commentaire") String com,@RequestParam("client") String idclient,@RequestParam("chauffeur") String idchauffeur,@RequestParam("note") String sNote) {
		
		Utilisateur chauffeur = service.findOne(Long.parseLong(idchauffeur));
		Utilisateur client =service.findOne(Long.parseLong(idclient));
		
		Evaluation eval = new Evaluation(chauffeur, Double.parseDouble(sNote));
		eval.setCommentaire(com);
		eval.setClient(client);
				
		return serviceEval.saveEvaluation(eval);
	}
	
	@PostMapping("/commentaire")
	public Commentaire creerCom(@RequestParam("commentaire") String com,@RequestParam("client") String idClient,@RequestParam("annonce") String idAnnonce) {
		
		Annonce annonce = serviceAnnonce.findOne(Long.parseLong(idAnnonce));
		Utilisateur client = service.findOne(Long.parseLong(idClient));
		
		Commentaire commentaire = new Commentaire(annonce);
		commentaire.setClient(client);
		commentaire.setCommentaire(com);
		
		return serviceCom.saveCommentaire(commentaire);
	}
	
	@PostMapping("/reclamation")
	public Reclamation creerReclam(@RequestParam("commentaire") String com,@RequestParam("client") String idClient,@RequestParam("course") String idCourse) {
		
		Utilisateur client = service.findOne(Long.parseLong(idClient));
		Course course = serviceCourse.findOne(Long.parseLong(idCourse));
		
		Reclamation reclam = new Reclamation(false,course);
		reclam.setClient(client);
		reclam.setCommentaire(com);
		
		return serviceReclam.saveReclamation(reclam);
	}
	
	@GetMapping("/course/{id}")
	public Course validerCourse(@PathVariable("id") Long id) {
		
		Course course = serviceCourse.findOne(id);
		course.setAccepted(true);
		
		return serviceCourse.saveCourse(course);
	}
	
	@GetMapping("/reclamation/{id}")
	public Reclamation traiterReclam(@PathVariable("id") Long id) {
		
		Reclamation reclamIn = serviceReclam.findOne(id);
		reclamIn.setDealtWith(true);
			
		return serviceReclam.saveReclamation(reclamIn);
	}
	
	@GetMapping("/tri_chauffeur")
	public List<Utilisateur> triChauffeur(){
		return service.triChauffeur();
	}
	
	@GetMapping("/calcul/{id}")
	public Double simulCout(@PathVariable("id") Long id) {
		
		Course course = serviceCourse.findOne(id);
		
		return 6.9*course.getTrajet().getDistance();
	}
}
