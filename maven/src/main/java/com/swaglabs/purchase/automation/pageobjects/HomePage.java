package com.swaglabs.purchase.automation.pageobjects;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.swaglabs.purchase.automation.utils.RobotUtils;
import com.swaglabs.purchase.automation.utils.Times;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject{
	
	Times times = new Times();
	RobotUtils robotUtils = new RobotUtils();
	
	public By selectButton = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
	public By nameOption = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");
	public By priceOption = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]");
	public By addCartButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	public By addCartButton2 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	public By removeCard2 = By.id("remove-sauce-labs-bike-light");
	
	public void escribirEnTexto(By elemento, String texto) {
		boolean validarElemento = false;
		while (validarElemento == false) {
		try {
		getDriver().findElement(elemento).sendKeys(texto);
		validarElemento = true;
		} catch (Exception e) {
		}
		}
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
		public String obtenerTextoDeElemento(By elemento) {
		boolean validarElemento = false;
		String textElemento = "";
		while (validarElemento == false) {
		try {
		textElemento = getDriver().findElement(elemento).getText();
		validarElemento = true;
		} catch (Exception e) {
		}
		}
		return textElemento;
		}
		public void validarTextoEnPantalla(By elemento, String texto) {
		boolean validarTexto = false;
		if(obtenerTextoDeElemento(elemento).contains(texto)) {
		validarTexto = true;
		}
		assertEquals(true, validarTexto);
		}
		
	public void goToSeverancePay() {
		
		clicEnElemento(selectButton);
		times.waitFor(5000);
		clicEnElemento(nameOption);
		times.waitFor(5000);
		clicEnElemento(selectButton);

		clicEnElemento(priceOption);
		times.waitFor(5000);
		clicEnElemento(addCartButton);
		times.waitFor(5000);
		clicEnElemento(addCartButton2);
		times.waitFor(5000);
		clicEnElemento(removeCard2);
		}
}
