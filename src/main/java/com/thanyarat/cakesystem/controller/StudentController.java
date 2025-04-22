package com.thanyarat.cakesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thanyarat.cakesystem.service.StudentService;
import com.thanyarat.cakesystem.service.Students;

@Controller
@RequestMapping
public class StudentController {

	private final StudentService StudemtService;
	
	
	@Autowired
	public StudentController(StudentService theStudentService ) {
		this.StudemtService = StudemtService
		StudemtService = theStudentService;
	}
	
	@GetMapping("/")
	public List<Students> getAllStudents() {
		return StudemtService.findAll();
	}
}