package com.sample.springboot.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.sample.springboot.dto.Counter;
import com.sample.springboot.service.CountService;

@Service
@Scope("prototype")
@Qualifier("countPrototypeService")
public class CountPrototypeServiceImpl implements CountService {
	int count = 0;

	@Override
	public Counter getCount() {
		Counter counter = new Counter();
		counter.setCount(count++);
		return counter;
	}

}
