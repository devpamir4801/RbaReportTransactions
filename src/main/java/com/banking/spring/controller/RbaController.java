package com.banking.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.banking.spring.entity.RbaReportFile;
import com.banking.spring.entity.RbaReportFileDTO;
import com.banking.spring.service.AllSuspiciousServices;
import com.banking.spring.service.FilePtacticingServic;
import com.banking.spring.service.IExcelDataService;
import com.banking.spring.service.IFileUploaderService;
import com.banking.spring.service.MainService;
import com.banking.spring.service.RbaReportFileDTOService;

@Controller
public class RbaController {

	@Autowired
	IFileUploaderService fileService;

	@Autowired
	IExcelDataService excelservice;
	@Autowired
	AllSuspiciousServices Alls;
	@Autowired
	FilePtacticingServic FilePtacticingS;
	@Autowired
	MainService mervice;
	@Autowired
	RbaReportFileDTOService rbareportfileDTOS;

	@GetMapping("/")
	public String index() {
		return "uploadPage";
	}

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		fileService.uploadFile(file);

		redirectAttributes.addFlashAttribute("message",
				"You have successfully uploaded '" + file.getOriginalFilename() + "' !");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/";
	}

	@GetMapping("/saveData")
	public String saveExcelData(Model model) {

		List<RbaReportFile> excelDataAsList = excelservice.getExcelDataAsList();
		int noOfRecords = excelservice.saveExcelData(excelDataAsList);
		model.addAttribute("noOfRecords", noOfRecords);
		return "success";
	}

	@GetMapping("AllSuspicious")
	public String getAllSuspiciousData(Model model) {
		List<RbaReportFile> ls1 = Alls.findall();
		model.addAttribute("ls", ls1);

		return "alldata";
	}

	/*
	 * @RequestMapping("AllSuspicious_Transactions") public String
	 * getAllsuspiciousTransacions(Model model) { List<RbaReportFileDTO> list5 =
	 * mervice.alerttransactionss(); model.addAttribute("ls", list5); return
	 * "alldata"; }
	 */

	@GetMapping("AllSuspicious1")
	public String getAllSuspiciousData2(Model model) {
		List<RbaReportFile> lis = Alls.moneyin();
		model.addAttribute("lis", lis);
		return "alldata1";
	}
	@GetMapping("AllSuspicious2")
	public String getAllSuspiciousData3(Model model) {
		List<RbaReportFileDTO> lis = rbareportfileDTOS.getalerttransactionindetails(); 
		model.addAttribute("lis", lis);
		return "alldata1";
	}
	@GetMapping("AllSuspicious_Transactions")
	public String getAllsuspiciousTransacions() {
		rbareportfileDTOS.saveRbaReportFileData();
		return "alldata1";
	}

	/*
	 * @GetMapping("/convert-salary") public String convertSalaryStringToDouble() {
	 * Alls.convertAndSaveEmployees(); return "alldata3";
	 * 
	 * }
	 */
	@GetMapping("/convert-salary1")
	public String ConvertStringintoDouble() {
		mervice.convertstringintodouble();
		return "alldata1";

	}
	
}
