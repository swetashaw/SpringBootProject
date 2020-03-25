package com.hcl.project.accountmanagement.AccountMain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sweta
 * Entity for account table
 *
 */
@Entity
@Table(name="accountNew")
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="acc_no")
    private Long accountNumber;
	
	@Column(name="IFSC")
	private String ifsc;
	
	@Column(name="acc_type")
	private String accoutType;
	
	@Column(name="avai_bal")
	private Float availableBalance;
	
	@Column(name="acc_status")
	private String accountStatus;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="acc_open_date")
	private Date accountOpenedDate;
	
	@Column(name="city")
	private String city;

	
	public AccountEntity() {
		
	}
	
	public AccountEntity(Long accountNumber,Date accountOpenedDate,String accountStatus,
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
	//getters and setters
	
	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
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

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	
	
	
	
	

}
