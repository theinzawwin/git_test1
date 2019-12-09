package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value="/getProduct")
	public ResponseEntity<Object> index(){
		String[] dt_list={"Product 1","Product 2","Product 3","Product 4"};
		return new ResponseEntity<>(dt_list,HttpStatus.OK);
	}
}
