package com.swaglabs.purchase.tests.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/purchase.feature",
glue = "com.swaglabs.purchase.tests.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class PurchaseRunner {

}
