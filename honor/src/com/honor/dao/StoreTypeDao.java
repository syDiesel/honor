package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.StoreType;

@Component
@SuppressWarnings("unchecked")
public class StoreTypeDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveStoreType(StoreType obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateStoreType(StoreType obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteStoreType(StoreType obj) {

		hibernateTemplate.delete(obj);
	}
	
	public StoreType getStoreTypeById(int id){
		
		return hibernateTemplate.get(StoreType.class,id);
	}

	public List<StoreType> listStoreTypeBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
