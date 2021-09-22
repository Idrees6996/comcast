package com.comcastOrg;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "Smoke Test")
	public void createOrgTest() {
		System.out.println("execute createContactTest");
	}
	@Test(groups = "Regression Test")
	public void createOrgWithContactTest() {
		System.out.println("execute createContactWithOrgTest");
	}  
	@Test(groups = "Regression Test")
	public void deleteOrgTest() {
		System.out.println("execute deleteContactTest");
	}  

	}
