package com.hcl.project.accountmanagement.AccountMain.dto;

import java.util.Date;

import javax.persistence.Column;

public class AccountDTO {
	
	
	 private Long accountNumber;
		
		
		private String ifsc;
		
		
		private String accoutType;
		
		
		private Float availableBalance;
		
		
		private String accountStatus;
		
		
		private String branch;
		
		
		private Date accountOpenedDate;
		
	
		private String city;
		
		public AccountDTO() {
			
		}
		public AccountDTO(Long accountNumber,Date accountOpenedDate,String accountStatus,
				String accoutType,Float availableBalance,String branch,String city,String ifsc)
		{
			this.accountNumber=accountNumber;
			this.accountOpenedDate=accountOpenedDate;
			this.accountStatus=accountStatus;
			this.accoutType=accoutType;
			this.availableBalance=availableBalance;
			this.branch=branch;
			this.city=city;
			this.ifsc=ifsc;
		}

		public Long getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(Long accountNumber) {
			this.accountNumber = accountNumber;
		}


		public String getIfsc() {
			return ifsc;
		}


		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}


		public String getAccoutType() {
			return accoutType;
		}


		public void setAccoutType(String accoutType) {
			this.accoutType = accoutType;
		}


		public Float getAvailableBalance() {
			return availableBalance;
		}


		public void setAvailableBalance(Float availableBalance) {
			this.availableBalance = availableBalance;
		}


		public String getAccountStatus() {
			return accountStatus;
		}


		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}


		public String getBranch() {
			return branch;
		}


		public void setBranch(String branch) {
			this.branch = branch;
		}


		public Date getAccountOpenedDate() {
			return accountOpenedDate;
		}


		public void setAccountOpenedDate(Date accountOpenedDate) {
			this.accountOpenedDate = accountOpenedDate;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}
		
		
}
