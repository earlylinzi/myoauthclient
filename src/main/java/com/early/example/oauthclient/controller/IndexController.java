package com.early.example.oauthclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class IndexController {
	
	
		
		@RequestMapping("/index")
		public String toShowUser(){
			
//			ModelAndView mv = new ModelAndView("index");
			
			return "yyyyyyyyyyyyyyyyyyyyyyyyyy";
		}

}
