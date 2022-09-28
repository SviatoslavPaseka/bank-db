package com.solvd.laba.bank.bankDAO;

import com.solvd.laba.bank.models.Credit_in_card;

public interface ICredit_in_cardRepo {
	Credit_in_card findByCard_id(Integer card_id);
}
