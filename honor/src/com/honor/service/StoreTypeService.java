package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.StoreTypeDao;
import com.honor.entity.StoreType;

@Service
public class StoreTypeService {

	@Resource
	protected StoreTypeDao dao;

	public void saveStoreType(StoreType obj) {

		dao.saveStoreType(obj);
	}

	public void updateStoreType(StoreType obj) {

		dao.updateStoreType(obj);
	}

	public void deleteStoreType(StoreType obj) {

		dao.deleteStoreType(obj);
	}

	public StoreType getStoreTypeById(int id) {

		return dao.getStoreTypeById(id);
	}

	public List<StoreType> listStoreTypeBySql(String sql) {

		return dao.listStoreTypeBySql(sql);
	}

}
