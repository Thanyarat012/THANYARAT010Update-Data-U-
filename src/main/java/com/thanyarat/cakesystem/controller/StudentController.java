package com.thanyarat.cakesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PutMapping("/{id}")
	public ResponseEntity<Students> updateStudent(@PathVariable Integer id, @RequestBody Students updatedStudent) {
	    Students student = StudentService.updateStudent(id, updatedStudent);
	    if (student != null) {
	        return ResponseEntity.ok(student);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

}