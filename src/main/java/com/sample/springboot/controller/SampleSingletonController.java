package com.sample.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.dto.Counter;

@RestController
@RequestMapping("/singleton-controller")
public class SampleSingletonController {
	int count = 0;

	@GetMapping
	public ResponseEntity<Counter> getCounter() {
		Counter counter = new Counter();
		counter.setCount(count++);
		System.out.println("singleton");
		return new ResponseEntity<>(counter, HttpStatus.OK);
	}
}
