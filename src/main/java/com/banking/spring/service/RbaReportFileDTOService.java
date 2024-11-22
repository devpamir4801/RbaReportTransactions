package com.banking.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.spring.entity.RbaReportFileDTO;
import com.banking.spring.repository.RbaReportFileDTORepository;

@Service
public class RbaReportFileDTOService {
	
	
	@Autowired
	RbaReportFileDTORepository rbareportfileDR;
	
	 public void saveRbaReportFileData() {
		 rbareportfileDR.saveJoinedData();
}
	 	public List<RbaReportFileDTO> getalerttransactionindetails()
	 	{
	 		return rbareportfileDR.findAll();
	 	}
}
