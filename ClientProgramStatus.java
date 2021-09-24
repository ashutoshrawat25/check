package com.alliancerxAdminPortal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARX_CLIENT_PROGRAM_STATUS")
public class ClientProgramStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer CLIENT_PRG_STATUS_ID;
	public Integer CLIENT_DTL_ID;
	
	@Column(name = "PRG_ON_HOLD")
	public String programHold;
	@Column(name = "ORD_ON_HOLD")
	public String orderingHold;
}
