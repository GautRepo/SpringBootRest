package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ConsumerRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate rt;

	@Override
	public void run(String... args) throws Exception {
		//RestTemplate rt = new RestTemplate();
		String url= "http://localhost:9090/getMeth";
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		System.out.println(response.getStatusCodeValue());
		System.out.println(response.getStatusCode().name());
		System.out.println(response.getBody());
		System.exit(0);
	}

	
}
