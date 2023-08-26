package edu.vnlemanhthanh.springboot.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/hello")
	public String sayHello(Model theModel) {

		theModel.addAttribute("theData", new java.util.Date());

		return "helloworld";
	}
}
