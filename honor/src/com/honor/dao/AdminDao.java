package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Admin;

@Component
@SuppressWarnings("unchecked")
public class AdminDao{

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

	public boolean checkExist(Object[] obj) {
		// TODO Auto-generated method stub
		String sql = "";
		if(obj.length == 2){
			sql = "from Admin where name = '"+obj[0]+"' and password = '"+obj[1]+"'";
			return listAdminBySql(sql) != null ? true:false;
		}
		
		return false;
	}

}
