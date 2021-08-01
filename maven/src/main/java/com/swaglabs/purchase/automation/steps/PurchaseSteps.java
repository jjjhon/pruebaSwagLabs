package com.swaglabs.purchase.automation.steps;

import java.awt.AWTException;

import com.swaglabs.purchase.automation.models.DataInjection;
import com.swaglabs.purchase.automation.pageobjects.PagePurchase;

import net.thucydides.core.annotations.Step;

public class PurchaseSteps {
	
	PagePurchase pagePurchase = new PagePurchase();
	DataInjection dataInjection = new DataInjection();	
	
	public PurchaseSteps() throws AWTException{
	}
	
	@Step
	public void Purchase() {
		pagePurchase.purchaseOne(dataInjection.getFirstName(),dataInjection.getLastName(),dataInjection.getZip());
		pagePurchase.validations();
		pagePurchase.logoutSesion();
	}
}
