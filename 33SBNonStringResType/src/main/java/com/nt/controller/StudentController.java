package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;

@RestController
public class StudentController {

	@GetMapping("/getStd")
	public ResponseEntity<Student> getStd(){
		return new ResponseEntity<>(new Student(10,"Gautam","Pat"),HttpStatus.OK);
	}
	
	@GetMapping("/std")
	public Student getstd() {
		return new Student(10,"Gautam","Pat");
		
	}
	
	@GetMapping("/list")
	public List<Student> liststd(){
		return List.of(new Student(1,"Gaut","Pat"),
						new Student(2,"Pri","Patna"));
	}
	
	@GetMapping("/map")
	public Map<String,Student> mapStd(){
		return Map.of("S1",new Student(1,"Gaut","Pat")
						,"S2",new Student(2,"Pri","Patna"));
	}
	
	
}
