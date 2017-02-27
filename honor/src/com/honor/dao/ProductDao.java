package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Product;

@Component
@SuppressWarnings("unchecked")
public class ProductDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveProduct(Product obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateProduct(Product obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteProduct(Product obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Product getProductById(int id){
		
		return hibernateTemplate.get(Product.class,id);
	}

	public List<Product> listProductBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
