package com.alliancerxAdminPortal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARX_CONTRACT_RATE_PYMT_DETAILS")
public class ContractedRatePayment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer CNTRCT_RATE_PYMT_ID;
	public Integer CLIENT_DTL_ID;
	
	@Column(name = "ADMIN_FEE")
	public String administrationFee;
	
	@Column(name = "DISPENSE_FEE")
	public String despensingFee;
	@Column(name = "EFT")
	public String eft;
	@Column(name = "VENDOR_ID")
	public String vendorIdAccNo;
	
	
}
