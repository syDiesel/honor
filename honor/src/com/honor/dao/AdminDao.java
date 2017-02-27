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
	
	public void saveAdmin(Admin obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateAdmin(Admin obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteAdmin(Admin obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Admin getAdminById(int id){
		
		return hibernateTemplate.get(Admin.class,id);
	}

	public List<Admin> listAdminBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
