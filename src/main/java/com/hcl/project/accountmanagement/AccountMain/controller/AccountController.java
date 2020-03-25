package com.hcl.project.accountmanagement.AccountMain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.project.accountmanagement.AccountMain.Exception.RecordNotFoundException;
import com.hcl.project.accountmanagement.AccountMain.Mapper.Mapper;
import com.hcl.project.accountmanagement.AccountMain.dto.AccountDTO;
import com.hcl.project.accountmanagement.AccountMain.entity.AccountEntity;
import com.hcl.project.accountmanagement.AccountMain.service.AccountService;

/**
 * @author sweta Controller for account Managemnet
 */
@RestController

/* Controller Class for account Management */
public class AccountController {

	@Autowired
	AccountService accService;
	
	@Autowired
	Mapper mapper;

	/**
	 * @return list of all accounts
	 */
	@GetMapping("/account")
	public List<AccountEntity> getAllAccounts() {
		List<AccountEntity> list = accService.getAllAccounts();
		// System.out.println(list.get(0).getAccountnumber());
		return list;
	}
	
	

	/**
	 * @param id
	 * @return Account by id passed as param
	 * @throws RecordNotFoundException
	 */
	@GetMapping("/account/{id}")
	public AccountDTO getAccountId(@PathVariable("id") Long id) throws RecordNotFoundException {
		return accService.getAccountById(id);

	}

	
	/**
	 * @param id
	 * @return
	 * @throws RecordNotFoundException
	 */
	@DeleteMapping("/account/{id}")
	public String delete(@PathVariable Long id) throws RecordNotFoundException {
		accService.deleteAccountById(id);
		return "value deleted";
	}
	
	
	/**
	 * @param acc
	 * @return
	 */
	@PutMapping("/account")	
    public ResponseEntity<AccountDTO> UpdateAccount(@RequestBody AccountDTO acc)
                                                  {
		AccountDTO updated = accService.updateAccount(acc);
        return new ResponseEntity<AccountDTO>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }
	
	/**
	 * @param acc
	 * @return
	 */
	@PostMapping("/account")	
    public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO acc)
                                                 {
		AccountDTO updated = accService.createAccount(acc);
        return new ResponseEntity<AccountDTO>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

}
