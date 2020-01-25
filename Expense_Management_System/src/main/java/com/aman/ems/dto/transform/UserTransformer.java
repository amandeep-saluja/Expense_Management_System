package com.aman.ems.dto.transform;

import com.aman.ems.entity.UserEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.User;

/**
 * This class is used to convert UserEntity to User and User to UserEntity.
 * 
 * @author Amandeep Singh Saluja
 *
 */

public class UserTransformer {

	/**
	 * This static method is used to convert User Entity To User Object.
	 * 
	 * @param userEntity Object
	 * @return User Object
	 * @throws EmsException
	 */

	public static User UserEntityToUser(UserEntity userEntity) throws EmsException {
		User user = new User();
		if(userEntity!=null) {
			user.setAddress(AddressTransformer.addressEntityToAddress(userEntity.getAddress()));
			user.setDateOfBirth(userEntity.getDateOfBirth());
			user.setEmailId(userEntity.getEmailId());
			user.setFirstName(userEntity.getFirstName());
			user.setGender(userEntity.getGender());
			user.setLastName(userEntity.getLastName());
			user.setListOfBank(BankTransformer.listOfBankEntityToListOfBank(userEntity.getListOfBank()));
			user.setListOfExpense(ExpenseTransformer.listOfExpenseEntityToListOfExpense(userEntity.getListOfExpense()));
			user.setListOfSavings(SavingsTransformer.listOfSavingsEntityToListOfSavings(userEntity.getListOfSavings()));
			user.setOccupation(OccupationTransformer.occupationEntityToOccupation(userEntity.getOccupation()));
			user.setPassword(userEntity.getPassword());
			user.setPhoneNumber(userEntity.getPhoneNumber());
			user.setUserId(userEntity.getUserId());
			user.setUserName(userEntity.getUserName());			
		}
		return user;
	}

	/**
	 * This static method is used to convert User to User Entity Object.
	 * 
	 * @param user
	 * @return UserEntity Object
	 * @throws EmsException
	 */

	public static UserEntity userToUserEntity(User user) throws EmsException {
		UserEntity userEntity = new UserEntity();
		if(user!=null) {
			userEntity.setAddress(AddressTransformer.addressToAddressEntity(user.getAddress()));
			userEntity.setDateOfBirth(user.getDateOfBirth());
			userEntity.setEmailId(user.getEmailId());
			userEntity.setFirstName(user.getFirstName());
			userEntity.setGender(user.getGender());
			userEntity.setLastName(user.getLastName());
			userEntity.setListOfBank(BankTransformer.listOfBankToListOfBankEntity(user.getListOfBank()));
			userEntity.setListOfExpense(ExpenseTransformer.listOfExpenseToListOfExpenseEntity(user.getListOfExpense()));
			userEntity.setListOfSavings(SavingsTransformer.listOfSavingsToListOfSavingsEntity(user.getListOfSavings()));
			userEntity.setOccupation(OccupationTransformer.occuaptionToOccupationEntity(user.getOccupation()));
			userEntity.setPassword(user.getPassword());
			userEntity.setPhoneNumber(user.getPhoneNumber());
			userEntity.setPocketMoney(user.getPocketMoney());
			userEntity.setUserId(user.getUserId());
			userEntity.setUserName(user.getUserName());
		}
		return userEntity;
	}
}
