package com.banking.spring.service;

import java.util.List;

import com.banking.spring.entity.RbaReportFile;


public interface IExcelDataService {
List<RbaReportFile> getExcelDataAsList();
	
	int saveExcelData(List<RbaReportFile> rbareportFile);

}
