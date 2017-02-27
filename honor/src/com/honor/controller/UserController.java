package com.honor.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.honor.entity.Admin;
import com.honor.service.AdminService;
import com.honor.util.ResponseUtil;

@Controller
@RequestMapping("web/user")
public class UserController {

	@Resource
	private AdminService adminService;

	// ajax检测该用户是否已经注册
	@RequestMapping("checkUserName")
	public void checkUserName(HttpServletRequest request,
			HttpServletResponse response, String name) throws Exception {

		System.out
		.println("--------------------checkUserName-----------------------"
				+ name);
		request.setCharacterEncoding("UTF-8");
		
		String sql = "from Admin where name = '" + name + "'";

		if (adminService.listAdminBySql(sql).size() > 0) {

			ResponseUtil.write(response, "error");
		} else
			ResponseUtil.write(response, "ok");

	}

	@RequestMapping("login.html")
	public String login(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("===============login==============");
		List<Admin> list = this.adminService.listAdminBySql("from Admin");
		req.setAttribute("list", list);
		return "index";
	}

}
