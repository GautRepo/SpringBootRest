package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String> show(){
		String body ="First App";
		ResponseEntity<String> resp = new ResponseEntity<>(body, HttpStatus.OK);
		return resp;
	}
}
