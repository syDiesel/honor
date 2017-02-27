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

	public void saveAdmin(Admin obj) {

		dao.saveAdmin(obj);
	}

	public void updateAdmin(Admin obj) {

		dao.updateAdmin(obj);
	}

	public void deleteAdmin(Admin obj) {

		dao.deleteAdmin(obj);
	}

	public Admin getAdminById(int id) {

		return dao.getAdminById(id);
	}

	public List<Admin> listAdminBySql(String sql) {

		return dao.listAdminBySql(sql);
	}

}
