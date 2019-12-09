package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductController {

	@GetMapping("/index.htm")
	public String index(){
		
		return "product_list";
	}
}
