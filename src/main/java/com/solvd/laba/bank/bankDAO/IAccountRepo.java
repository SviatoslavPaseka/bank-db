package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Account;

public interface IAccountRepo {
	Account findById(Integer id);
}
