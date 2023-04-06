package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Vendor;

@RestController
public class VenderRestController {
	
	@PostMapping("/ven")
	public ResponseEntity<Vendor> postVen(@RequestBody Vendor vendor){
		
		return new ResponseEntity<Vendor>(vendor,HttpStatus.OK);
	}

}
