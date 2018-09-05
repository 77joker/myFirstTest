package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class springBootController {
	@RequestMapping("/hello")
    public String hello() {
		return "first one11122";
	}
}
