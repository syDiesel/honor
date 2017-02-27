package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Buyer;

@Component
@SuppressWarnings("unchecked")
public class BuyerDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveBuyer(Buyer obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateBuyer(Buyer obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteBuyer(Buyer obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Buyer getBuyerById(int id){
		
		return hibernateTemplate.get(Buyer.class,id);
	}

	public List<Buyer> listBuyerBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
