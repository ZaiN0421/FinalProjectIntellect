package com.FinalProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	
	@RequestMapping(value = "/WORKING", method = RequestMethod.GET)
	public String getText() {
        return "Hey Guys";
    }

}
