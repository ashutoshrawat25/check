package com.alliancerxAdminPortal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARX_CLIENT_DETAILS")
public class ClientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer CLIENT_DTL_ID;
	public Integer HRCHY_SK;
	
	@Column(name = "CE_340B-ID")
	public String id340B;
	@Column(name = "CE_NAME")
	public String ceNAme;
	@Column(name = "DESIGNATION_TYPE")
	public String designationType;
	@Column(name = "AUTHORIZING_OFFICIAL")
	public String authorizingOfficial;
	@Column(name = "PRIMARY_CONTACT")
	public String primaryContact;
	@Column(name = "PARTICIPATING_START_DATE")
	public Date particapatingStartDate;
	@Column(name = "TERMINATION_DATE")
	public Date terminationDate;
	@Column(name = "STREET_ADDRESS")
	public String streetAddress;
	@Column(name = "CE_340B_ID_FOR_ALL_CHILD_SITE")
	public String id340bForChildSite;
	@Column(name = "RELATE_ENTITY_INFO")
	public String relateEntityInfo;
	
}
