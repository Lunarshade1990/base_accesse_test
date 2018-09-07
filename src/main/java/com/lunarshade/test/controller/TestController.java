package com.lunarshade.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lunarshade.test.entity.Test;
import com.lunarshade.test.service.Impl.TestServiceImpl;

@RestController
@RequestMapping("/lunarshade/test")
public class TestController {
	
	@Autowired
	private TestServiceImpl testServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Test>> findAll() {
		return ResponseEntity.ok(testServiceImpl.getAll());
	}
}
