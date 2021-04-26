package com.darksky.stepdefinitions;

import com.darksky.base.BasePage;
import com.darksky.base.ConfigReader;
import com.darksky.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {
    @Given("User goes to home page")
    public void goToHomePage(){
        BasePage.initializeDriver();
    }
    @When("User enters current location")
    public void enterLocation(){
        HomePage.enterLocation(ConfigReader.getProperty("Location"));
    }
    @And("User presses enter")
    public void enterSearch(){
        HomePage.enterSearch();
    }
    @And("User learned lowest temperature")
    public void takeLowestTemp() {
        HomePage.takeLowestTemp();
    }
    @And("User learned highest temperature")
    public void takeHighestTemp() {
        HomePage.takeHighestTemp();
    }
    @Then("Verify the current lowest and highest temps current")
    public void verifyCurrentTemps(){
        Assert.assertTrue(HomePage.verifyCurrentTemperature());
        HomePage.quit();
    }
}
