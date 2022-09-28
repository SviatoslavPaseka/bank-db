package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Account_service;

public interface IAccount_serviceRepo {
	Account_service findById(Integer id);
}
