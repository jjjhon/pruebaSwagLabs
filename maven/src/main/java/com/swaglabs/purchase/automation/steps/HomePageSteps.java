package com.swaglabs.purchase.automation.steps;

import java.awt.AWTException;

import com.swaglabs.purchase.automation.pageobjects.HomePage;

import net.thucydides.core.annotations.Step;

public class HomePageSteps {
	
	
	public HomePageSteps() throws AWTException{}
	
	HomePage homePage = new HomePage();
	@Step
	public void goToRetireSeverancePay() {
		homePage.goToSeverancePay();
	}
	
}
