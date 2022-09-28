package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Current_manager;

public interface ICurrent_managerRepo {
	Current_manager findByAc_no(Integer ac_no);
}
