package com.banking.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConvertingFile {
		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMoneyin() {
			return moneyin;
		}
		public void setMoneyin(String moneyin) {
			this.moneyin = moneyin;
		}
		private String name;
		private String moneyin;
		
}
