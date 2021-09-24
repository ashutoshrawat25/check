package com.alliancerxAdminPortal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARX_CONTRACT_WHOLESALER_INFO")
public class ContractedWholesalerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer CNTRCT_WHOLESALER_INFO_ID;
	public Integer CLIENT_DTL_ID;
	
	@Column(name = "WHOLESALER_NAME")
	public String primaryWholesalerName;
	@Column(name = "WHOLESALER_ACCOUNT_NBR")
	public String primaryWholesalerAccountNumber;
	@Column(name = "WHOLESALER_ID")
	public String primaryWholesalerId;
	@Column(name = "SEC_WHOLESALER_NAME")
	public String secondaryWholesalerName;
	@Column(name = "SEC_WHOLESALER_ACCOUNT_NUMBER")
	public String secondaryWholesalerAccountNumber;
	@Column(name = "SEC_WHOLESALER_ID")
	public String secondaryWholesalerId;
	
	
}
