package com.swaglabs.purchase.automation.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class RobotUtils {
	/*
	Robot robot = new Robot();
	public RobotUtils() throws AWTException{}
	
	
	public void clickR(WebDriver driver, By by) {
		Point point = driver.findElement(by).getLocation();
		robot.mouseMove(point.getX()+15, point.getY()+120);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}*/
	
	public static void  clickJS(WebDriver driver, By by) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElement(by));
	}
	
	
}
