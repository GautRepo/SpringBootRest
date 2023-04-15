package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ReqPramRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate rt;

	@Override
	public void run(String... args) throws Exception {
		String url= "http://localhost:9090/show?id=10";
		ResponseEntity<String> res =rt.getForEntity(url, String.class);
		
		System.out.println(res.getStatusCodeValue());
		System.out.println(res.getStatusCode().name());
		System.out.println(res.getBody());
		System.exit(0);
		
	}

}
