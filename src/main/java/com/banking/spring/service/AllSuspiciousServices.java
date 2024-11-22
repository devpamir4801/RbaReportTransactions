package com.banking.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.spring.entity.RbaReportFile;

import com.banking.spring.repository.RbaRepository;
import com.banking.spring.repository.TargetdbRepository;



@Service
public class AllSuspiciousServices {

	
		@Autowired
		RbaRepository repo;
		@Autowired
		TargetdbRepository repo1;
		
		

		List<String> temp=new ArrayList<>();
		
		public List<RbaReportFile> findall() {
			return repo.findAll();
		}

		public List<RbaReportFile> moneyin() {
			return repo.findAll();
		}
		/* @Transactional */
		/*public void convertAndSaveEmployees() {
	        List<RbaReportFile> sourceEmployees = repo.findAll();

	        for (RbaReportFile sourceEmployee : sourceEmployees) {
	            try {
	                String salaryString = sourceEmployee.getMoneyIn().replace("$", "").replace(",", "");
	                Double salaryDouble = Double.parseDouble(salaryString);
	                Targetdb targetEmployee = new Targetdb();
					 targetEmployee.setName(sourceEmployee.getBankName()); 
					 targetEmployee.setSalaryDouble(salaryDouble); 
	                repo1.save(targetEmployee);
	            } catch (NumberFormatException e) {
	                // Handle the exception (log it, skip this entry, etc.)
	                System.err.println("Error converting salary for employee ID " + sourceEmployee.getId() + ": " + e.getMessage());
	            }
	        }
	    }*/
	}
