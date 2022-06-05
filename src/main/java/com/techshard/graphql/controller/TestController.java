package com.techshard.graphql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/gello")
	String hello() {
		return "Test Hello Controller  !!!";

	}
}
