package com.swaglabs.purchase.tests.stepdefinitions;

import com.swaglabs.purchase.automation.steps.HomePageSteps;
import com.swaglabs.purchase.automation.steps.LoginPageSteps;
import com.swaglabs.purchase.automation.steps.PurchaseSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PurchaseStepDefinitions {

	@Steps
	LoginPageSteps loginPageSteps;
	@Steps
	HomePageSteps homePageSteps;
	@Steps
	PurchaseSteps purchaseSteps;
	
	@Given("^That a user wants to make a purchase of a product$")
	public void thatAnUserWantsToRemoveHimSeverancePayInPorvenir() {
		loginPageSteps.openBrowser();
		loginPageSteps.login();
	}

	@When("^he follows all the steps correctly$")
	public void heFollowsAllTheStepsCorrectly() {
		homePageSteps.goToRetireSeverancePay();
		purchaseSteps.Purchase();
	}

	@Then("^he must correctly buy the product through the shopping cart$")
	public void heShouldRemoveCorrectlyHimSeverancePay() {
	}
}
