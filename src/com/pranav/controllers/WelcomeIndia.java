package com.pranav.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeIndia {
@RequestMapping("/bi")
	public String helloIndia(Model model) {
		return "index";
	}
}
