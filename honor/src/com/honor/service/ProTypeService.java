package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.ProTypeDao;
import com.honor.entity.ProType;

@Service
public class ProTypeService {

	@Resource
	protected ProTypeDao dao;

	public void saveProType(ProType obj) {

		dao.saveProType(obj);
	}

	public void updateProType(ProType obj) {

		dao.updateProType(obj);
	}

	public void deleteProType(ProType obj) {

		dao.deleteProType(obj);
	}

	public ProType getProTypeById(int id) {

		return dao.getProTypeById(id);
	}

	public List<ProType> listProTypeBySql(String sql) {

		return dao.listProTypeBySql(sql);
	}

}
