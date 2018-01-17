package com.psbparks.tenantinformationportal.dao;

import java.util.ArrayList;
import java.util.Map;

import com.psbparks.tenantinformationportal.entity.Company;
import com.psbparks.tenantinformationportal.mockdata.TenantMockData;


/**
 * @author Yeshwanth Konakanchi
 *This is DAO class where we get the tenant info from service class 
 *and send it to the TenantMockData class for storing and retrieving
 */
public class TenantInformationPortalDao {

	TenantMockData tenantMockdata = new TenantMockData();

	/**
	 * @param company
	 * This method will get the tenant data from service class and 
	 * send it to the TenantMockData class for storing
	 */
	public void createTenantInfo(Company company) {

		tenantMockdata.saveTenantInfo(company);

	}

	/**
	 * @return
	 * This method will get the tenant data from the map in the TenantMockData class 
	 * and send it to the service class
	 */
	public Map<String, ArrayList<Company>> getTenantInformation() {

		Map<String, ArrayList<Company>> tenantInfo = tenantMockdata.getTenantInfo();
		return tenantInfo;
	}

}
