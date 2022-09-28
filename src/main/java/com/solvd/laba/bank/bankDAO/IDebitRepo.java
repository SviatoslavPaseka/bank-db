package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Debit;

public interface IDebitRepo {
	Debit findById(Integer id);
}
