package com.honor.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.honor.entity.Admin;
import com.honor.service.AdminService;

@Controller
public class AdminController {

	@Resource
	private AdminService adminService;
	
	
	@RequestMapping("test.html")
	public String listAllUsers(HttpServletRequest req,HttpServletResponse resp){
		
		System.out.println("===============test.html==============");
		List<Admin> list =this.adminService.listAdminBySql("from Admin");
		req.setAttribute("listUserInfo", list);
		return "index";
	} 
	
}
