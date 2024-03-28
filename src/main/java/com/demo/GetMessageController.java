package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetMessageController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, world!";
	}

	@PostMapping("/echo")
	public String echo(@RequestBody String message) {
		return "You said: " + message;
	}
}
