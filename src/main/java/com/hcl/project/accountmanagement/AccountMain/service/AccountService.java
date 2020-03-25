package com.hcl.project.accountmanagement.AccountMain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.project.accountmanagement.AccountMain.Exception.RecordNotFoundException;
import com.hcl.project.accountmanagement.AccountMain.Mapper.Mapper;
import com.hcl.project.accountmanagement.AccountMain.dto.AccountDTO;
import com.hcl.project.accountmanagement.AccountMain.entity.AccountEntity;
import com.hcl.project.accountmanagement.AccountMain.repository.AccountRepository;
/**
 * @author Sweta
 *
 */
@Service
public class AccountService {

	//Importing account Repository
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	Mapper mapper;	

	
	/**
	 * @return
	 */
	public List<AccountEntity> getAllAccounts() {
		List<AccountEntity> accList = accountRepository.findAll();

		if (accList.size() > 0) {
			return accList;
		} else {
			return new ArrayList<AccountEntity>();
		}
	}

	

	//Get account by ID
	/**
	 * @param id
	 * @return
	 * @throws RecordNotFoundException
	 */
	public AccountDTO getAccountById(Long id) throws RecordNotFoundException {
		return mapper.mapAccountDTO(accountRepository.findOne(id));

	}

	//Delete account by ID
	/**
	 * @param id
	 * @throws RecordNotFoundException
	 */
	public void deleteAccountById(Long id) throws RecordNotFoundException {
		AccountEntity acc = accountRepository.findOne(id);
		if (null != acc) {
			accountRepository.delete(id);
		} else {
			throw new RecordNotFoundException("No account record exist for given id");
		}
	}

	
	
	
	 public AccountDTO updateAccount(AccountDTO accDTO)  
	    {
	       // Optional<AccountEntity> account = Optional.of(accountRepository.findOne(accDTO.getAccountNumber()));
	        AccountEntity newEntity=accountRepository.findOne(accDTO.getAccountNumber());
	        if(newEntity!=null) 
	        {
	        	//AccountEntity newEntity = account.get();
				
	        	newEntity.setAccountOpenedDate(accDTO.getAccountOpenedDate());
	        	newEntity.setAccountStatus(accDTO.getAccountStatus());
	        	newEntity.setAccoutType(accDTO.getAccoutType());
	        	newEntity.setAvailableBalance(accDTO.getAvailableBalance());
	        	newEntity.setBranch(accDTO.getBranch());
	        	newEntity.setCity(accDTO.getCity());
	        	newEntity.setIfsc(accDTO.getIfsc());
	            newEntity = accountRepository.save(newEntity);
	             
	            return mapper.mapAccountDTO(newEntity);
	        } 
	        else {
	        	    	return null;
	        }
	    } 
	 
	 public AccountDTO createAccount(AccountDTO accDTO)  
	    {
		 AccountEntity entitySaved=accountRepository.save(mapper.mapAccountEntity(accDTO));
		 return mapper.mapAccountDTO(entitySaved);
	    }
}
