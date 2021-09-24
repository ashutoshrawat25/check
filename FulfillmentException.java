package com.alliancerxAdminPortal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARX_FULFILLMENT_EXCEPTION")
public class FulfillmentException {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer FULFILLMENT_ID;
	public Integer CLIENT_DTL_ID;
	@Column(name = "ARxWP_FULFILLMENT_COORDINATOR")
	public String arxwpFulfillmentCoordinator;
	
}
