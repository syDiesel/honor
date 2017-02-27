package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.SellerDao;
import com.honor.entity.Seller;

@Service
public class SellerService {

	@Resource
	protected SellerDao dao;

	public void saveSeller(Seller obj) {

		dao.saveSeller(obj);
	}

	public void updateSeller(Seller obj) {

		dao.updateSeller(obj);
	}

	public void deleteSeller(Seller obj) {

		dao.deleteSeller(obj);
	}

	public Seller getSellerById(int id) {

		return dao.getSellerById(id);
	}

	public List<Seller> listSellerBySql(String sql) {

		return dao.listSellerBySql(sql);
	}

}
