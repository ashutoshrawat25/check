package com.alliancerxAdminPortal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARX_CONTRACT_PHARMACY_DETAILS")
public class ContractPharmacyDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer PHARMACY_DTL_ID;
	public Integer CLIENT_DTL_ID;
	@Column(name = "PHARMACY_LOCATION_NUMBER")
	public Integer pharmacyLocationNumber;
	@Column(name = "PHARMACY_LOCATION_NAME")
	public String pharmacyLocationName;
	@Column(name = "PHARAMACY_LOCATION_NPI")
	public String pharmacyLocationNpi;
	@Column(name = "PHARMACY_LOCATION_START_DATE")
	public Date pharmacyLocationStartDate;
	@Column(name = "PHARMACY_LOCATION_END_DATE")
	public Date pharmacyLocationTerminationDate;
	@Column(name = "PHARMACY_LOCATION_DEA")
	public String pharmacyLocationDea;
	
}
