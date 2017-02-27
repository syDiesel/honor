package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.ProType;

@Component
@SuppressWarnings("unchecked")
public class ProTypeDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveProType(ProType obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateProType(ProType obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteProType(ProType obj) {

		hibernateTemplate.delete(obj);
	}
	
	public ProType getProTypeById(int id){
		
		return hibernateTemplate.get(ProType.class,id);
	}

	public List<ProType> listProTypeBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
