package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Debit_in_card;

public interface IDebit_in_cardRepo {
	Debit_in_card findByCard_id(Integer card_id);
}
