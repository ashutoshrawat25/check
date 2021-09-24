package com.alliancerxAdminPortal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARX_CLIENT_BUSINESS_MANAGEMENT")
public class ClientBusinessMgmt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer cLIENT_BUS_MGMT_ID;
	
	public Integer cLIENT_DTL_ID;
	
	
	@Column(name = "ARxWP_ACCOUNT_MGR_NAME")
	public String arxwpAccManager;
	@Column(name = "ARxWP_INVENTORY_MGR_NAME")
	public String arxwpInventoryManager;
	
}
