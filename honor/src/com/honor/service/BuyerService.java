package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.BuyerDao;
import com.honor.entity.Buyer;

@Service
public class BuyerService {

	@Resource
	protected BuyerDao dao;
	
	public void saveBuyer(Buyer obj) {

		dao.saveBuyer(obj);
	}

	public void updateBuyer(Buyer obj) {

		dao.updateBuyer(obj);
	}

	public void deleteBuyer(Buyer obj) {

		dao.deleteBuyer(obj);
	}

	public Buyer getBuyerById(int id){
		
		return dao.getBuyerById(id);
	}
	
	public List<Buyer> listBuyerBySql(String sql) {

		return dao.listBuyerBySql(sql);
	}

}
