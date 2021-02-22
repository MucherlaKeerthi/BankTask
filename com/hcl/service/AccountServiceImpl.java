package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AccountDao;



@Service
public class AccountServiceImpl implements AccountService {
	
	private AccountDao accountDao;

	@Autowired(required = true)
	public void setUserDao(AccountDao accountbankDao) {
		this.accountDao = accountbankDao;
	}
    
	public boolean bank(String name) {
		System.out.println("Checking ");
		return accountDao.bank(name);

	}

}
