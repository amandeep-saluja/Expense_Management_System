package com.aman.ems.dto.transform;

import java.util.ArrayList;
import java.util.List;

import com.aman.ems.entity.BankEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Bank;

/**
 * This class is used to convert Bank Entity Object to Bank Object and Bank
 * Object to Bank Entity Object.
 * 
 * @author Infinty
 *
 */

public class BankTransformer {

	/**
	 * This static method is used to convert BankEntity to Bank Object.
	 * 
	 * @param bankEntity
	 * @return Bank Object
	 * @throws EmsException
	 */

	public static Bank bankEntityToBank(BankEntity bankEntity) throws EmsException {
		Bank bank = new Bank();
		bank.setAccountId(bankEntity.getAccountId());
		bank.setAddress(AddressTransformer.addressEntityToAddress(bankEntity.getAddress()));
		bank.setBalance(bankEntity.getBalance());
		bank.setBankId(bankEntity.getBankId());
		bank.setBankName(bankEntity.getBankName());
		return bank;
	}

	/**
	 * This static method is used to convert Bank to BankEntity Object.
	 * 
	 * @param bank
	 * @return BankEntity Object
	 * @throws EmsException
	 */

	public static BankEntity bankEntityToBank(Bank bank) throws EmsException {
		BankEntity bankEntity = new BankEntity();
		bankEntity.setAccountId(bank.getAccountId());
		bankEntity.setAddress(AddressTransformer.addressToAddressEntity(bank.getAddress()));
		bankEntity.setBalance(bank.getBalance());
		bankEntity.setBankId(bank.getBankId());
		return bankEntity;
	}

	/**
	 * This static method is used to convert List of Bank to List of BankEntity
	 * Object.
	 * 
	 * @param listOfBank
	 * @return list of BankEntity
	 * @throws EmsException
	 */

	public static List<BankEntity> listOfBankToListOfBankEntity(List<Bank> listOfBank) throws EmsException {
		List<BankEntity> listOfBankEntity = new ArrayList<>();
		BankEntity bankEntity = null;
		for (Bank bank : listOfBank) {
			bankEntity = BankTransformer.bankEntityToBank(bank);
			listOfBankEntity.add(bankEntity);
		}
		return listOfBankEntity;
	}

	/**
	 * This static method is used to convert List of BankEntity to List of Bank
	 * Object.
	 * 
	 * @param listOfBankEntity
	 * @return list of Bank
	 * @throws EmsException
	 */

	public static List<Bank> listOfBankEntityToListOfBank(List<BankEntity> listOfBankEntity) throws EmsException {
		List<Bank> listOfBank = new ArrayList<>();
		Bank bank = null;
		for (BankEntity bankEntity : listOfBankEntity) {
			bank = BankTransformer.bankEntityToBank(bankEntity);
			listOfBank.add(bank);
		}
		return listOfBank;
	}

}
