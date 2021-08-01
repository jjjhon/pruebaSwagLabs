package com.swaglabs.purchase.automation.pageobjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject{
	
	public By usernameInput = By.id("user-name");
	public By passwordInput = By.id("password");
	public By loginButton = By.id("login-button");
	
	public void setUsername(String string) {
		getDriver().findElement(usernameInput).sendKeys(string);
	}
	
	public void setPassword(String string) {
		getDriver().findElement(passwordInput).sendKeys(string);
	}
	
	public void clickLoginButton() {
		getDriver().findElement(loginButton).click();
		getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
}
