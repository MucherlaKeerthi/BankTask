package com.hcl.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.Account;

@Repository
public class TransactionDaoImpl implements TransactionDao{
	private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }
    @SuppressWarnings("unchecked")
	@Override
	public List<Account> bankList() {
       
        return sessionFactory.getCurrentSession().createQuery("from Account t ,Transaction c  where t.card_number =: c.card_number ")
                .setParameter("c.transaction_date", 2).setParameter("c.amount",3).list();
    }

}
