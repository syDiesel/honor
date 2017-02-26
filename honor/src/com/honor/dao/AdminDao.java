package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Admin;

@Component
@SuppressWarnings("unchecked")
public class AdminDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveAdmin(Admin admin){
		
		hibernateTemplate.save(admin);
	}
	
	public void updateAdmin(Admin admin) {

		hibernateTemplate.update(admin);
	}

	public void deleteAdmin(Admin admin) {

		hibernateTemplate.delete(admin);
	}
	
	public Admin getAdminById(int id){
		
		return hibernateTemplate.get(Admin.class,id);
	}

	public List<Admin> listAdminBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
