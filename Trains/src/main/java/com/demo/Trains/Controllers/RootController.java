package com.demo.Trains.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.Trains.Entity.Register;
import com.demo.Trains.Entity.RegisterResponse;
import com.demo.Trains.Entity.Train;

@RestController
public class RootController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/trains")
	public ResponseEntity<?> getTrains() {
		
		return ResponseEntity.status(HttpStatus.OK).body(restTemplate.getForObject("http://20.244.56.144/train/trains", Train.class));
	}
	
	@PostMapping("/register")
	public RegisterResponse register(@RequestBody Register register) {
		RestTemplate restTemplate=new RestTemplate();
		
		return restTemplate.postForObject("http://20.244.56.144/train/register", register,  RegisterResponse.class);
		

	}
	
}
