package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.OrdersDao;
import com.honor.entity.Orders;

@Service
public class OrdersService {

	@Resource
	protected OrdersDao dao;
	
	public void saveOrders(Orders obj) {

		dao.saveOrders(obj);
	}

	public void updateOrders(Orders obj) {

		dao.updateOrders(obj);
	}

	public void deleteOrders(Orders obj) {

		dao.deleteOrders(obj);
	}

	public Orders getOrdersById(int id){
		
		return dao.getOrdersById(id);
	}
	
	public List<Orders> listOrdersBySql(String sql) {

		return dao.listOrdersBySql(sql);
	}

}
