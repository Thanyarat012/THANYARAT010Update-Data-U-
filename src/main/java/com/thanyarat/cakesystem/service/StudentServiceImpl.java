package com.thanyarat.cakesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanyarat.cakesystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository ;
	

	@Autowired
	public StudentServiceImpl(StudentRepository theStudentRepository) {
		studentRepository = theStudentRepository;
	}
	
	public List<Students> findAll(){
		return studentRepository.findAll();
	}
}