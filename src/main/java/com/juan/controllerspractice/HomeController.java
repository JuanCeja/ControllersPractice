package com.juan.controllerspractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/world")
	public String helloWorld() {
		return "class level annotations are cool too";
	}
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		return "Your searched for: " + searchQuery;
	}
}
