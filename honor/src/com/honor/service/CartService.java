package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.CartDao;
import com.honor.entity.Cart;

@Service
public class CartService {

	@Resource
	protected CartDao dao;
	
	public void saveCart(Cart obj) {

		dao.saveCart(obj);
	}

	public void updateCart(Cart obj) {

		dao.updateCart(obj);
	}

	public void deleteCart(Cart obj) {

		dao.deleteCart(obj);
	}

	public Cart getCartById(int id){
		
		return dao.getCartById(id);
	}
	
	public List<Cart> listCartBySql(String sql) {

		return dao.listCartBySql(sql);
	}

}
