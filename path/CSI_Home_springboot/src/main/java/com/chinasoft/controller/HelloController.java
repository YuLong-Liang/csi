package com.chinasoft.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/index")
	public String Intent(Map map) {
		return "index";
	}
	
	@RequestMapping(value = {"/indexPage"})
    public String indexData(){
        return "hrm/notice/notice";
    }
}
