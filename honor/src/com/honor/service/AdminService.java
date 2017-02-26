package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.AdminDao;
import com.honor.entity.Admin;

@Service
public class AdminService {

	@Resource
	protected AdminDao dao;
	
	public void saveUserInfo(Admin obj) {

		dao.saveAdmin(obj);
	}

	public void updateUserInfo(Admin obj) {

		dao.updateAdmin(obj);
	}

	public void deleteUserInfo(Admin obj) {

		dao.deleteAdmin(obj);
	}

	public List<Admin> listAdminBySql(String sql) {

		return dao.listAdminBySql(sql);
	}

}
