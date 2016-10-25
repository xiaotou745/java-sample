package com.sample.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/items")
public class ItemController {
	
	@RequestMapping("/list")
	@ResponseBody
	public String list(){
		return " get item list";
	}
	
	@RequestMapping("hello")
	public String hello(){
		
	}
}
