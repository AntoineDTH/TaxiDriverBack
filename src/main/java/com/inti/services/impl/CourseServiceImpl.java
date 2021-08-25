package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Course;
import com.inti.repositories.ICourseRepository;
import com.inti.services.interfaces.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	ICourseRepository CourseRepository;

	@Override
	public Course saveCourse(Course Course) {
		return CourseRepository.save(Course);
	}

	@Override
	public List<Course> findAll() {
		return CourseRepository.findAll();
	}

	@Override
	public Course findOne(Long id) {
		return CourseRepository.findById(id).get();
	}

	@Override
	public void deleteCourse(Long id) {
		CourseRepository.deleteById(id);
	}

}
