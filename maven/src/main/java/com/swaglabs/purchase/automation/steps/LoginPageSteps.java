package com.swaglabs.purchase.automation.steps;

import java.util.concurrent.TimeUnit;

import com.swaglabs.purchase.automation.models.DataInjection;
import com.swaglabs.purchase.automation.pageobjects.LoginPage;
import com.swaglabs.purchase.automation.utils.Times;

import net.thucydides.core.annotations.Step;

public class LoginPageSteps {
	
	LoginPage loginPage = new LoginPage();
	DataInjection dataInjection = new DataInjection();
	Times times = new Times();
	
	@Step
	public void openBrowser() {
		loginPage.open();
	}
	
	@Step
	public void login(){
		
		loginPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		loginPage.setUsername(dataInjection.getUsername());
		loginPage.setPassword(dataInjection.getPassword());
		times.waitFor(1000);
		loginPage.clickLoginButton();

	}
}
