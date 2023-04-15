package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RunnerForDel implements CommandLineRunner {
	
	@Autowired
	private RestTemplate rt;

	@Override
	public void run(String... args) throws Exception {
		String url = "http://localhost:9090/delMethod";
		ResponseEntity<String> re= rt.exchange(url, HttpMethod.DELETE,null,String.class);
		System.out.println(re.getStatusCodeValue());
		
		System.out.println(re.getStatusCode().name());
		System.out.println(re.getBody());
		System.exit(0);
	}

}
