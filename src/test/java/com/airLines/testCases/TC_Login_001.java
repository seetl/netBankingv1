package com.airLines.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.airLines.pageObjetcs.LoginPagee;

public class TC_Login_001 extends BaseClass{
	@Test
	public void loginTest() {
		driver.get(baseURL);
		
		logger.info("URL is launched");
		
		LoginPagee lp=new LoginPagee(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clicksubmit();
		logger.info("Successfully Logged in");

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} 
		else 
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}

