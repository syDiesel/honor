package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.ProductDao;
import com.honor.entity.Product;

@Service
public class ProductService {

	@Resource
	protected ProductDao dao;

	public void saveProduct(Product obj) {

		dao.saveProduct(obj);
	}

	public void updateProduct(Product obj) {

		dao.updateProduct(obj);
	}

	public void deleteProduct(Product obj) {

		dao.deleteProduct(obj);
	}

	public Product getProductById(int id) {

		return dao.getProductById(id);
	}

	public List<Product> listProductBySql(String sql) {

		return dao.listProductBySql(sql);
	}

}
