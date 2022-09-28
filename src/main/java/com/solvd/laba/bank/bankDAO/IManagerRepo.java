package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Manager;

public interface IManagerRepo {
	Manager findById(Integer id);
}
