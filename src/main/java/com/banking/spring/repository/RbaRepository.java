package com.banking.spring.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.banking.spring.entity.RbaReportFile;
@EnableJpaRepositories
public interface RbaRepository extends JpaRepository<RbaReportFile, Long> {
	
	  @Query(value = "select * " + "from rba_report_file" +
	  " INNER JOIN targetdb ON rba_report_file.transaction_id = targetdb.transaction_id"
	  ,nativeQuery = true) public List<Object[]> findmoneyin();
	 
	
}
