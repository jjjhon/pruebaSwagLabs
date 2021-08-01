package com.swaglabs.purchase.automation.pageobjects;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Timestamp;

import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.swaglabs.purchase.automation.utils.RobotUtils;
import com.swaglabs.purchase.automation.utils.Times;

import net.serenitybdd.core.pages.PageObject;

public class PagePurchase extends PageObject{
	Robot robot = new Robot();
	RobotUtils robotUtils = new RobotUtils(); 
	public PagePurchase() throws AWTException{}
	Times times = new Times();
	HomePage homePage = new HomePage();
	public By shoppingCartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	public By checkoutButton = By.xpath("//*[@id=\"checkout\"]");
	public By firstNameInput = By.id("first-name");
	public By lastNameInput = By.id("last-name");
	public By zipInput = By.id("postal-code");
	public By continueButton = By.id("continue");
	public By finishButton = By.id("finish");
	public By informationValidation = By.xpath("//*[@id=\"checkout_complete_container\"]/div");
	public By menuButton = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	public By logoutButton = By.xpath("//*[@id=\"logout_sidebar_link\"]");
	
	
	public void purchaseOne(String firstName, String lastName, String zip) {
		getDriver().findElement(shoppingCartButton).click();
		times.waitFor(5000);
		waitForCondition().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkoutButton));
		times.waitFor(5000);
		getDriver().findElement(checkoutButton).click();
		waitForCondition().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(firstNameInput));
		times.waitFor(5000);
		getDriver().findElement(firstNameInput).sendKeys(firstName);
		times.waitFor(5000);
		getDriver().findElement(lastNameInput).sendKeys(lastName);
		times.waitFor(5000);
		getDriver().findElement(zipInput).sendKeys(zip);
		times.waitFor(5000);
		getDriver().findElement(continueButton).click();
		times.waitFor(5000);
		waitForCondition().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(finishButton));
		times.waitFor(5000);
		getDriver().findElement(finishButton).click();
		times.waitFor(5000);

	}
	
	public void logoutSesion() {
		
		getDriver().findElement(menuButton).click();
		times.waitFor(5000);
		getDriver().findElement(logoutButton).click();
		times.waitFor(5000);
	}
	
	
	
	public void clicEnElemento(By elemento) {
	boolean validarElemento = false;
	while (validarElemento == false) {
	try {
	getDriver().findElement(elemento).click();
	validarElemento = true;
	} catch (Exception e) {
	}
	}
	}	
	
	public void validations() {
		assert(isElementVisible(informationValidation));
	}
}
