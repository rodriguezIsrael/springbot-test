package com.sample.springboot.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.dto.Counter;

@RestController
@RequestMapping("/prototype-controller")
@Scope("prototype")
public class SamplePrototypeController {
	int count = 0;

	@GetMapping
	public ResponseEntity<Counter> getCounter() {
		Counter counter = new Counter();
		counter.setCount(count++);
		System.out.println("prototype");
		return new ResponseEntity<>(counter, HttpStatus.OK);
	}

}
