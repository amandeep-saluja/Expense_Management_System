package com.aman.ems.dto.transform;

import com.aman.ems.entity.OccupationEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Occupation;

/**
 * This class is used to convert Occupation Entity to Occupation and Occupation
 * to Occupation Entity.
 * 
 * @author Amandeep Singh Saluja
 *
 */

public class OccupationTransformer {

	/**
	 * This static method is used to convert Occupation Entity To Occupation Object.
	 * 
	 * @param occupationEntity
	 * @return Occupation
	 * @throws EmsException
	 */

	public static Occupation occupationEntityToOccupation(OccupationEntity occupationEntity) throws EmsException {
		Occupation occupation = new Occupation();
		if(occupationEntity!=null) {
			occupation.setAddress(AddressTransformer.addressEntityToAddress(occupationEntity.getAddress()));
			occupation.setCompany(occupationEntity.getCompany());
			occupation.setJobId(occupationEntity.getJobId());
			occupation.setJobType(occupationEntity.getJobType());
			occupation.setRole(occupationEntity.getRole());
			occupation.setSalary(occupationEntity.getSalary());
		}
		return occupation;
	}

	/**
	 * This static method is used to convert Occupation Object To Occupation Entity
	 * Object.
	 * 
	 * @param occupation
	 * @return OccupationEntity
	 * @throws EmsException
	 */

	public static OccupationEntity occuaptionToOccupationEntity(Occupation occupation) throws EmsException {
		OccupationEntity occupationEntity = new OccupationEntity();
		if(occupation!=null) {
			occupationEntity.setAddress(AddressTransformer.addressToAddressEntity(occupation.getAddress()));
			occupationEntity.setCompany(occupation.getCompany());
			occupationEntity.setJobId(occupation.getJobId());
			occupationEntity.setJobType(occupation.getJobType());
			occupationEntity.setRole(occupation.getRole());
			occupationEntity.setSalary(occupation.getSalary());
		}
		return occupationEntity;
	}

}
