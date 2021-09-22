package com.comcastContact;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "SmokeTest")
public void createContactTest() {
	System.out.println("execute createContactTest");
}
@Test(groups = "Regression Test")
public void createContactWithOrgTest() {
	System.out.println("execute createContactWithOrgTest");
}  
@Test(groups = "Regression Test")
public void deleteContactTest() {
	System.out.println("execute deleteContactTest");
}  

}
