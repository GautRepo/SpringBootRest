package com.nt.test;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTTest {

	public static void main(String[] args) {
		String key = "NIT";

		// Token Generation with details
		String token = Jwts.builder().setId("AB1256") // client Id
				.setSubject("AJAY") // clientName
				.setIssuer("Mind-HYD") // provider Name
				.setIssuedAt(new Date(System.currentTimeMillis())) // token gen Date
				.setExpiration(new Date(System.currentTimeMillis() // exp date
						+ TimeUnit.MINUTES.toMillis(10)))
				.signWith(SignatureAlgorithm.HS256, // alog
						Base64.getEncoder().encode(key.getBytes())) // secret key
				.compact(); // convert to JWT STRING

		System.out.println(token);

		// -------------------
		Claims c = Jwts.parser() // read token data
				.setSigningKey(Base64.getEncoder().encode(key.getBytes())) // secret key
				.parseClaimsJws(token) // token
				.getBody(); // claims data

		// print / validate ...
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getIssuer());
	}

}
