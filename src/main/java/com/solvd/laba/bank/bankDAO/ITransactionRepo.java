package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Transaction;

public interface ITransactionRepo {
	Transaction findById(Integer id);
}
