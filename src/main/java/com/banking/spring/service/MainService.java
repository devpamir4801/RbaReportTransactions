package com.banking.spring.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.spring.entity.RbaReportFile;

import com.banking.spring.entity.Targetdb;
import com.banking.spring.repository.RbaRepository;
import com.banking.spring.repository.TargetdbRepository;

@Service
public class MainService {

	
	
	@Autowired
	TargetdbRepository targetdbrepo;
	@Autowired
	RbaRepository rbarepos;
	
	public void convertstringintodouble()
	{
		
	List<RbaReportFile> rbareport = rbarepos.findAll();
	
	for(RbaReportFile conver : rbareport)
	{
		String moneyintemp=conver.getMoneyIn().replace("$", "").replace(",", "");
		double doublemoneyin=Double.parseDouble(moneyintemp);
		if(doublemoneyin>1000)
		{
		Targetdb tsd = new Targetdb();
		
		tsd.setMoneyIn(doublemoneyin);
		tsd.setTransactionId(conver.getTransactionId());
		targetdbrepo.save(tsd);
		}
	}
	
	}
		
	
	
		
		
		
	}

