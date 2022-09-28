package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Personal_photo;

public interface IPersonal_photoRepo {
	Personal_photo findById(Integer id);
}
