package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.CollectDao;
import com.honor.entity.Collect;

@Service
public class CollectService {

	@Resource
	protected CollectDao dao;
	
	public void saveCollect(Collect obj) {

		dao.saveCollect(obj);
	}

	public void updateCollect(Collect obj) {

		dao.updateCollect(obj);
	}

	public void deleteCollect(Collect obj) {

		dao.deleteCollect(obj);
	}
	
	public Collect getCollectById(int id){
		
		return dao.getCollectById(id);
	}

	public List<Collect> listCollectBySql(String sql) {

		return dao.listCollectBySql(sql);
	}

}
