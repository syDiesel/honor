package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.AddressDao;
import com.honor.entity.Address;

@Service
public class AddressService {

	@Resource
	protected AddressDao dao;
	
	public void saveAddress(Address obj) {

		dao.saveAddress(obj);
	}

	public void updateAddress(Address obj) {

		dao.updateAddress(obj);
	}

	public void deleteAddress(Address obj) {

		dao.deleteAddress(obj);
	}

	public Address getAddressById(int id){
		
		return dao.getAddressById(id);
	}
	
	public List<Address> listAddressBySql(String sql) {

		return dao.listAddressBySql(sql);
	}

}
