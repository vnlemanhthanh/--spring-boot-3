package com.vnlemanhthanh.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginCotroller {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		//return "plain-login";
		return "fancy-login";
	}
}
