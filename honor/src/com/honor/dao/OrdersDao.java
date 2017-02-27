package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Orders;

@Component
@SuppressWarnings("unchecked")
public class OrdersDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveOrders(Orders obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateOrders(Orders obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteOrders(Orders obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Orders getOrdersById(int id){
		
		return hibernateTemplate.get(Orders.class,id);
	}

	public List<Orders> listOrdersBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
