package com.cg.account.dao;

import com.cg.account.bean.Account;
import com.cg.account.exception.AccountException;

public interface AccountDao {
	String createAccount(Account acc) throws AccountException;
	double showBalance(String mobileNo) throws AccountException;
	Account deposit(String mobileNo) throws AccountException;
	Account withdraw(String mobileNo) throws AccountException;
	Account printTransactionDetails(String mobileNo) throws AccountException;

}
