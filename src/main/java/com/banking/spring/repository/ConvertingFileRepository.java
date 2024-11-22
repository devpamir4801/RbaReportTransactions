package com.banking.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.spring.entity.ConvertingFile;

public interface ConvertingFileRepository extends JpaRepository<ConvertingFile,Long> {

}