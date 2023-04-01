package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/get")
	public ResponseEntity<String> getMeth(){
		return new ResponseEntity<String>("FromGet",HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> postMeth(){
		return new ResponseEntity<>("FromPost",HttpStatus.OK);
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> putMeth(){
		return new ResponseEntity<>("FromPut",HttpStatus.OK);
	}
	
	@DeleteMapping("/del")
	public ResponseEntity<String> delMeth(){
		return new ResponseEntity<>("FromDelete",HttpStatus.OK);
	}
	
	

}
