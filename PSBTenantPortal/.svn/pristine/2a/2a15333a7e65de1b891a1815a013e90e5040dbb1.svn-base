package com.psbparks.tenantinformationportal.mockdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.psbparks.tenantinformationportal.entity.Company;

/**
 * @author Yeshwanth Konakanchi
 *
 */
public class TenantMockData {

	public Map<String, ArrayList<Company>> tenantInfo = new HashMap<String, ArrayList<Company>>();
	public  ArrayList<Company> tenantInformation=new ArrayList<Company>();
	/**
	 * @param company
	 * This method stores the tenant data in the map
	 */
	public void saveTenantInfo(Company company) {
		ArrayList<Company> tenant = new ArrayList<Company>();
		String name = company.getBuilding().getBuildingName();
		tenantInformation.add(company);
		for(Company c: tenantInformation){
			if(company.getBuilding().getBuildingName().equals(c.getBuilding().getBuildingName())){
				tenant.add(c);
				tenantInfo.put(name, tenant);	
			}
		}
	}

	/**
	 * @return
	 * This method will return the tenant data when it is invoked
	 */
	public Map<String, ArrayList<Company>> getTenantInfo() {

		return tenantInfo;
	}

}
