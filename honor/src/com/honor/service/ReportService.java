package com.honor.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.honor.dao.ReportDao;
import com.honor.entity.Report;

@Service
public class ReportService {

	@Resource
	protected ReportDao dao;

	public void saveReport(Report obj) {

		dao.saveReport(obj);
	}

	public void updateReport(Report obj) {

		dao.updateReport(obj);
	}

	public void deleteReport(Report obj) {

		dao.deleteReport(obj);
	}

	public Report getReportById(int id) {

		return dao.getReportById(id);
	}

	public List<Report> listReportBySql(String sql) {

		return dao.listReportBySql(sql);
	}

}
