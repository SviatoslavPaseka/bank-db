package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Credit;

public interface ICreditRepo {
	Credit findById(Integer id);
}
