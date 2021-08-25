package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Course;

public interface ICourseService {

	public Course saveCourse(Course x);

	public List<Course> findAll();

	public Course findOne(Long id);

	public void deleteCourse(Long id);
}
