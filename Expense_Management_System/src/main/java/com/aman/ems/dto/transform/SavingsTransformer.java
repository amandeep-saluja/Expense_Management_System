package com.aman.ems.dto.transform;

import java.util.ArrayList;
import java.util.List;

import com.aman.ems.entity.SavingsEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Savings;

/**
 * This class is used to convert Savings Entity Object to Savings Object and
 * Savings Object to Savings Entity Object.
 * 
 * @author Amandeep Singh Saluja
 *
 */

public class SavingsTransformer {

	/**
	 * This static method is used to convert Savings Entity To Savings Object.
	 * 
	 * @param SavingsEntity
	 * @return Savings Object
	 * @throws EmsException
	 */

	public static Savings savingsEntityToSavings(SavingsEntity savingsEntity) throws EmsException {
		Savings savings = new Savings();
		if(savingsEntity!=null) {
			savings.setBalance(savingsEntity.getBalance());
			savings.setCategory(CategoryTransformer.listOfCategoryEntityToListOfCategory(savingsEntity.getCategory()));
			savings.setDate(savingsEntity.getDate());
			savings.setNeed(savingsEntity.getNeed());
			savings.setSavingID(savingsEntity.getSavingID());
			savings.setSavingName(savingsEntity.getSavingName());
			savings.setTransaction(TransactionTransformer.transactionEntityToTransaction(savingsEntity.getTransaction()));
		}
		return savings;
	}

	/**
	 * This static method is used to convert Savings To Savings Entity Object.
	 * 
	 * @param Savings
	 * @return SavingsEntity
	 * @throws EmsException
	 */

	public static SavingsEntity savingsToSavingsEntity(Savings savings) throws EmsException {
		SavingsEntity savingsEntity = new SavingsEntity();
		if(savings!=null) {
			savingsEntity.setBalance(savings.getBalance());
			savingsEntity.setCategory(CategoryTransformer.listOfCategoryToListOfCategoryEntity(savings.getCategory()));
			savingsEntity.setDate(savings.getDate());
			savingsEntity.setNeed(savings.getNeed());
			savingsEntity.setSavingID(savings.getSavingID());
			savingsEntity.setSavingName(savings.getSavingName());
			savingsEntity.setTransaction(TransactionTransformer.transactionToTransactionEntity(savings.getTransaction()));
		}
		return savingsEntity;
	}

	/**
	 * This static method is used to convert List of Savings Entity to List of
	 * Savings Object.
	 * 
	 * @param listOfSavings
	 * @return List<Savings>
	 * @throws EmsException
	 */

	public static List<Savings> listOfSavingsEntityToListOfSavings(List<SavingsEntity> listOfSavingsEntities)
			throws EmsException {
		List<Savings> listOfSavings = new ArrayList<Savings>();
		if(listOfSavingsEntities!=null) {
			Savings savings = null;
			for (SavingsEntity savingsEntity : listOfSavingsEntities) {
				savings = savingsEntityToSavings(savingsEntity);
				listOfSavings.add(savings);
			}
		}
		return listOfSavings;
	}

	/**
	 * This static method is used to convert List of Savings to List of Savings
	 * Entity Object.
	 * 
	 * @param listOfSavingss
	 * @return List<SavingsEntity>
	 * @throws EmsException
	 */

	public static List<SavingsEntity> listOfSavingsToListOfSavingsEntity(List<Savings> listOfSavingss)
			throws EmsException {
		List<SavingsEntity> listOfSavingsEntities = new ArrayList<SavingsEntity>();
		if(listOfSavingss!=null) {
			SavingsEntity savingsEntity = null;
			for (Savings savings : listOfSavingss) {
				savingsEntity = savingsToSavingsEntity(savings);
				listOfSavingsEntities.add(savingsEntity);
			}
		}
		return listOfSavingsEntities;
	}

}
