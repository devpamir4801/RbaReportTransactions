package com.banking.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.banking.spring.entity.RbaReportFileDTO;

import jakarta.transaction.Transactional;

public interface RbaReportFileDTORepository extends JpaRepository<RbaReportFileDTO,Long> {
	@Modifying
    @Transactional
	@Query(value = "INSERT INTO rba_report_filedto (account_holder_address, account_holder_name, account_holder_phone_no, account_holder_ssn,account_no,"
			+ "bank_address,bank_name,bank_phone_no,closing_balance,destination_country,discription,interest_rate,last_statement_date,money_in,"
			+ "money_out,openning_balance,ref_chequeno,routing_no,source_country,transaction_amount,transaction_date,transaction_id,transaction_particular,"
			+ "transaction_type,typeof_account,id)" +
			"SELECT rba_report_file.account_holder_address,rba_report_file.account_holder_name,rba_report_file.account_holder_phone_no,rba_report_file.account_holder_ssn,rba_report_file.account_no,"
			+ "rba_report_file.bank_address,rba_report_file.bank_name,rba_report_file.bank_phone_no,rba_report_file.closing_balance,rba_report_file.destination_country,"
			+ "rba_report_file.discription,rba_report_file.interest_rate,rba_report_file.last_statement_date,rba_report_file.money_in,rba_report_file.money_out,"
			+ "rba_report_file.openning_balance,rba_report_file.ref_chequeno,rba_report_file.routing_no,rba_report_file.source_country,rba_report_file.transaction_amount,rba_report_file.transaction_date,"
			+ "rba_report_file.transaction_id,rba_report_file.transaction_particular,rba_report_file.transaction_type,rba_report_file.typeof_account,rba_report_file.id " + "FROM rba_report_file" +
			  " INNER JOIN targetdb ON rba_report_file.transaction_id = targetdb.transaction_id", 
    nativeQuery = true)
void saveJoinedData();

}
