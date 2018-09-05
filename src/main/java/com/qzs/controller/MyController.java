package com.qzs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qzs.dto.User;
import com.qzs.service.MyService;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request){
		
		List<User> list = myService.select();
		
		request.setAttribute("list", list);
		System.out.println("--------------------sdfafsadfasdf================");
		System.out.println("23423423423");
		System.out.println("dfgsdfgsdf");
		return "list";
	}
	
	
	

}
