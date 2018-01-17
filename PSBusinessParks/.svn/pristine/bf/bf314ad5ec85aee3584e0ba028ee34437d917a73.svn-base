package com.psbparks.tenantinformationportal.mockdata;

import java.util.HashMap;
import java.util.Map;

import com.psbparks.tenantinformationportal.entity.Company;

/**
 * @author Yeshwanth Konakanchi
 *
 */
public class TenantMockData {

	public Map<String, Company> tenantInfo = new HashMap<String, Company>();

	/**
	 * @param company
	 * This method stores the tenant data in the map
	 */
	public void saveTenantInfo(Company company) {

		String name = company.getCompanyName();
		tenantInfo.put(name, company);

	}

	/**
	 * @return
	 * This method will return the tenant data when it is invoked
	 */
	public Map<String, Company> getTenantInfo() {

		return tenantInfo;
	}

}
