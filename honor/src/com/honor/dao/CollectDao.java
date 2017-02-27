package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Collect;

@Component
@SuppressWarnings("unchecked")
public class CollectDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveCollect(Collect obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateCollect(Collect obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteCollect(Collect obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Collect getCollectById(int id){
		
		return hibernateTemplate.get(Collect.class,id);
	}

	public List<Collect> listCollectBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
