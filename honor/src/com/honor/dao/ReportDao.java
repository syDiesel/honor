package com.honor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.honor.entity.Report;

@Component
@SuppressWarnings("unchecked")
public class ReportDao {

	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public void saveReport(Report obj){
		
		hibernateTemplate.save(obj);
	}
	
	public void updateReport(Report obj) {

		hibernateTemplate.update(obj);
	}

	public void deleteReport(Report obj) {

		hibernateTemplate.delete(obj);
	}
	
	public Report getReportById(int id){
		
		return hibernateTemplate.get(Report.class,id);
	}

	public List<Report> listReportBySql(String sql) {

		return this.hibernateTemplate.find(sql);
	}
}
