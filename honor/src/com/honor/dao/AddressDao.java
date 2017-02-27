package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Address;

@Component
@SuppressWarnings("unchecked")
public class AddressDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveAddress(Address obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateAddress(Address obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteAddress(Address obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Address getAddressById(int id){
		
		return hibernateTemplate.get(Address.class,id);
	}

	public List<Address> listAddressBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
