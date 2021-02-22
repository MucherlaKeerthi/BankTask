package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.TransactionDao;
import com.hcl.model.Account;

@Service
public class TransactionServiceImpl implements TransactionService{
	TransactionDao transactionDao;
	 @Autowired(required=true)
	    public void setTransactionDao( TransactionDao transactionDao) {
	        this.transactionDao=transactionDao;
	    }
	
	@Transactional
    public  List<Account> bankList() {
        return transactionDao.bankList();
    }

}
