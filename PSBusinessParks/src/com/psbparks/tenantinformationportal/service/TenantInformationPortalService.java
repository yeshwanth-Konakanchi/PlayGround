package com.psbparks.tenantinformationportal.service;

import java.util.ArrayList;
import java.util.Map;

import com.psbparks.tenantinformationportal.dao.TenantInformationPortalDao;
import com.psbparks.tenantinformationportal.entity.Company;

/**
 * @author Yeshwanth Konakanchi
 *This is a service class where we write our business logic to send the tenant information data 
 *from controller class to DAO and from DAO to service
 */
public class TenantInformationPortalService {

	TenantInformationPortalDao tenantInformation = new TenantInformationPortalDao();

	
	/**
	 * @param company
	 * This method will send the tenant data from controller to DAO class
	 */
	public void createTenantInformation(Company company) {

		tenantInformation.createTenantInfo(company);

	}
	
	/**
	 * @param addressLineOne
	 * @return
	 * This method will get the tenant information from DAO and sends it to the controller class to display the data
	 * based on the address line one entered by the user in the controller class.
	 */
	public ArrayList<Company> displayTenantInfo(String addressLineOne) {

		Map<String, Company> tenantInfo = tenantInformation.getTenantInformation();
		 ArrayList<Company> tenantInfoList=new ArrayList<Company>();
		for (Map.Entry<String, Company> entry : tenantInfo.entrySet()) {

			Company company = entry.getValue();
			if (addressLineOne.equals(company.getAddress().getAddressLine1())) {

				tenantInfoList.add(company);
				
			}
		}
		return tenantInfoList;

	}

}
