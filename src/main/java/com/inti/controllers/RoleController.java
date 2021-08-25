package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Role;
import com.inti.services.interfaces.IRoleService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionRoles")
public class RoleController {
	
	@Autowired
	IRoleService service;
	
	@PostMapping("/roles")
	public Role saveRole(@RequestBody Role role) {
		return service.saveRole(role);
	}
	
	@GetMapping("/roles")
	public List<Role> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/roles/{idRole}", method = RequestMethod.GET)
	public Role findOne(@PathVariable("idRole") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/roles/{idRole}")
	public void deleteRole(@PathVariable("idRole") Long id) {
		service.deleteRole(id);
	}
	
}
