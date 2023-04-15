package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;

@RestController
public class EmployeeRestController {
	
	@GetMapping("/getMeth")
	public ResponseEntity<String> getMeth(){
		return new ResponseEntity<>("From Get Method",HttpStatus.OK);
	}
	
	@GetMapping("/show")
	public ResponseEntity<String> showDate(@RequestParam String id){
		return new ResponseEntity<>("From show Method " +id,HttpStatus.OK);
		
	}
	
	@PostMapping("/postMeth")
	public ResponseEntity<String> postMeth(@RequestBody Employee emp){
		return new ResponseEntity<String>("Welcome to post "+ emp.toString(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delMethod")
	public ResponseEntity<String> delMeth(){
		return new ResponseEntity<String>("Delete method", HttpStatus.OK);
	}

}
