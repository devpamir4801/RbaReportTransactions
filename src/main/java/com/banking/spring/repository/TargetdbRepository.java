package com.banking.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.banking.spring.entity.Targetdb;
@EnableJpaRepositories
public interface TargetdbRepository extends JpaRepository<Targetdb, Long> {
}
