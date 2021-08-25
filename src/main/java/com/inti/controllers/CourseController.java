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

import com.inti.entities.Course;
import com.inti.services.interfaces.ICourseService;

@CrossOrigin
@RestController
@RequestMapping(value = "/TaxiDriver")
public class CourseController {

	@Autowired
	ICourseService CourseService;

	@PostMapping("/users")
	public Course saveCourse(@RequestBody Course Course) {
		return CourseService.saveCourse(Course);
	}

	@GetMapping("/users")
	public List<Course> findAll() {
		return CourseService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public Course findOne(@PathVariable("idUser") Long id) {
		return CourseService.findOne(id);
	}

	@DeleteMapping("/users/{idUser}")
	public void deleteCourse(@PathVariable("idUser") Long id) {
		CourseService.deleteCourse(id);
	}
}
