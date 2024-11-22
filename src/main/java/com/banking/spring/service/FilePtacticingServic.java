package com.banking.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.spring.entity.ConvertingFile;
import com.banking.spring.entity.TargetSoureceDatabase;
import com.banking.spring.repository.ConvertingFileRepository;
import com.banking.spring.repository.TargetSoureceDatabaseRepository;

@Service
public class FilePtacticingServic {
	
	@Autowired
	TargetSoureceDatabaseRepository targetsourecedatabaserepo;
	@Autowired
	ConvertingFileRepository convertingfilerepos;
	
	public void convertstringintodouble()
	{
		
	List<ConvertingFile> convertingf = convertingfilerepos.findAll();
	
	for(ConvertingFile conver : convertingf)
	{
		String moneyintemp=conver.getMoneyin().replace("$", "").replace(",", "");
		double doublemoneyin=Double.parseDouble(moneyintemp);
		TargetSoureceDatabase tsd = new TargetSoureceDatabase();
		
		tsd.setMoneyIN(doublemoneyin);
		tsd.setName(conver.getName());
		targetsourecedatabaserepo.save(tsd);
		
	}
	
	}
	
	
	
}
