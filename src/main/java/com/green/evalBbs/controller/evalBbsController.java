package com.green.evalBbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evalBbsController {

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
}
