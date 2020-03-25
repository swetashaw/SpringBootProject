package com.hcl.project.accountmanagement.AccountMain.Mapper;

import org.springframework.stereotype.Component;

import com.hcl.project.accountmanagement.AccountMain.dto.AccountDTO;
import com.hcl.project.accountmanagement.AccountMain.entity.AccountEntity;

@Component
public class Mapper {
	
	/**
	 * @param accEntity
	 * @return
	 */
	public AccountDTO mapAccountDTO(AccountEntity accEntity) {

		AccountDTO accDTO = new AccountDTO();
		if (null != accEntity) {
			accDTO.setAccountNumber(accEntity.getAccountNumber());

			accDTO.setAccountOpenedDate(accEntity.getAccountOpenedDate());
			accDTO.setAccountStatus(accEntity.getAccountStatus());
			accDTO.setAccoutType(accEntity.getAccoutType());
			accDTO.setAvailableBalance(accEntity.getAvailableBalance());
			accDTO.setBranch(accEntity.getBranch());
			accDTO.setCity(accEntity.getCity());
			accDTO.setIfsc(accEntity.getIfsc());
			return accDTO;
		} else {
			return null;
		}
	}
	
	
	/**
	 * @param accEntity
	 * @return
	 */
	public AccountEntity mapAccountEntity(AccountDTO accDto) {

		AccountEntity accEntity = new AccountEntity();
		if (null != accEntity) {
			accEntity.setAccountNumber(accDto.getAccountNumber());

			accEntity.setAccountOpenedDate(accDto.getAccountOpenedDate());
			accEntity.setAccountStatus(accDto.getAccountStatus());
			accEntity.setAccoutType(accDto.getAccoutType());
			accEntity.setAvailableBalance(accDto.getAvailableBalance());
			accEntity.setBranch(accDto.getBranch());
			accEntity.setCity(accDto.getCity());
			accEntity.setIfsc(accDto.getIfsc());
			return accEntity;
		} 
			return accEntity;
	
	}
	

}
