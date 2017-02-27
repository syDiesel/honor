package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Cart;

@Component
@SuppressWarnings("unchecked")
public class CartDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveCart(Cart obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateCart(Cart obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteCart(Cart obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Cart getCartById(int id){
		
		return hibernateTemplate.get(Cart.class,id);
	}

	public List<Cart> listCartBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
