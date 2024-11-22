package com.banking.spring.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.banking.spring.entity.RbaReportFile;
import com.banking.spring.repository.RbaRepository;
import com.banking.spring.service.IExcelDataService;


@Service
public class ExcelDataServiceImpl implements IExcelDataService {

	@Value("${app.upload.file:${user.home}}")
	public String EXCEL_FILE_PATH;

	@Autowired
	RbaRepository repo;

	Workbook workbook;

	public List<RbaReportFile> getExcelDataAsList() {

		List<String> list = new ArrayList<String>();

		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();

		// Create the Workbook
		try {
			workbook = WorkbookFactory.create(new File(EXCEL_FILE_PATH));
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}

		// Retrieving the number of sheets in the Workbook
		System.out.println("-------Workbook has '" + workbook.getNumberOfSheets() + "' Sheets-----");

		// Getting the Sheet at index zero
		Sheet sheet = workbook.getSheetAt(0);

		// Getting number of columns in the Sheet
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		System.out.println("-------Sheet has '"+noOfColumns+"' columns------");

		// Using for-each loop to iterate over the rows and columns
		for (Row row : sheet) {
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				list.add(cellValue);
			}
		}

		// filling excel data and creating list as List<Invoice>
		List<RbaReportFile> invList = createList(list, noOfColumns);

		// Closing the workbook
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return invList;
	}

	private List<RbaReportFile> createList(List<String> excelData, int noOfColumns) {

		ArrayList<RbaReportFile> invList = new ArrayList<RbaReportFile>();

		int i = noOfColumns;
		do {
			RbaReportFile inv = new RbaReportFile();

			/*
			 * inv.setTransactionDate(excelData.get(i));
			 * inv.setAmount(Double.valueOf(excelData.get(i + 1)));
			 * inv.setNumber(excelData.get(i + 2)); inv.setReceivedDate(excelData.get(i +
			 * 3));
			 */
			inv.setTransactionDate(excelData.get(i));
			inv.setBankName(excelData.get(i + 1));
			inv.setBankAddress(excelData.get(i + 2));
			inv.setBankPhoneNo(Double.valueOf(excelData.get(i + 3)));
			inv.setAccountHolderName(excelData.get(i + 4));
			inv.setAccountHolderAddress(excelData.get(i + 5));
			inv.setAccountHolderPhoneNo(excelData.get(i + 6));
			inv.setAccountHolderSsn(excelData.get(i + 7));
			inv.setTypeofAccount(excelData.get(i + 8));
			inv.setRoutingNo(Double.valueOf(excelData.get(i + 9)));
			inv.setAccountNo(excelData.get(i + 10));
			inv.setOpenningBalance(excelData.get(i + 11));
			inv.setClosingBalance(excelData.get(i + 12));
			inv.setInterestRate(Double.valueOf(excelData.get(i + 13)));
			inv.setLastStatementDate(excelData.get(i + 14));
			inv.setDiscription(excelData.get(i + 15));
			inv.setRefChequeno(Double.valueOf(excelData.get(i + 16)));
			inv.setMoneyIn(excelData.get(i + 17));
			inv.setMoneyOut(excelData.get(i + 18));
			inv.setTransactionAmount(excelData.get(i + 19));
			inv.setTransactionType(excelData.get(i + 20));
			inv.setTransactionId(Double.valueOf(excelData.get(i + 21)));
			inv.setTransactionParticular(excelData.get(i + 22));
			inv.setSourceCountry(excelData.get(i + 23));
			inv.setDestinationCountry(excelData.get(i + 24));
			

			invList.add(inv);
			i = i + (noOfColumns);

		} while (i < excelData.size());
		return invList;
	}

	@Override
	public int saveExcelData(List<RbaReportFile> invoices) {
		invoices = repo.saveAll(invoices);
		return invoices.size();
	}
}

