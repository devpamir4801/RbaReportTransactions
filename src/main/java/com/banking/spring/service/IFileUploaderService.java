package com.banking.spring.service;

import org.springframework.web.multipart.MultipartFile;

public interface IFileUploaderService {
	
	public void uploadFile(MultipartFile file);

}
