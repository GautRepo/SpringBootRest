package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ReqParmWithPostRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate rt;

	@Override
	public void run(String... args) throws Exception {
		String url ="http://localhost:9090/postMeth";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json");
		
		String body = "{\"eid\":110,\"ename\":\"Gautam\",\"esal\":10.10}";
		
		HttpEntity<String> request= new HttpEntity<String>(body,header);
		
		ResponseEntity<String> res = rt.postForEntity(url, request, String.class);
		System.out.println(res.getStatusCodeValue());
		System.out.println(res.getStatusCode().name());
		System.out.println(res.getBody());
		
		System.exit(0);

	}

}
