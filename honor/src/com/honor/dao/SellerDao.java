package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Seller;

@Component
@SuppressWarnings("unchecked")
public class SellerDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveSeller(Seller obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateSeller(Seller obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteSeller(Seller obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Seller getSellerById(int id){
		
		return hibernateTemplate.get(Seller.class,id);
	}

	public List<Seller> listSellerBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
