package com.facebook.steps;

import com.facebook.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new LoginPage().clickOnaccept();
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email ) {
        new LoginPage().enterEmail(email);
    }

    @And("^I enter pasword \"([^\"]*)\"$")
    public void iEnterPasword(String password ) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogin();
    }

    @Then("^I should verify error message \"([^\"]*)\"$")
    public void iShouldVerifyErrorMessage(String msg ) {
        switch (msg) {
            case "The email address or mobile number you entered isn't connected to an account.":
                String actualMessage = new LoginPage().verifyerror1();
                String expectedMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
                Assert.assertEquals(actualMessage, expectedMessage);
                break;
            case "The password that you've entered is incorrect. Forgotten password? ":
                String actualMessage2 = new LoginPage().verifyerror1();
                String expectedMessage2 = "The password that you've entered is incorrect. Forgotten password? ";
                Assert.assertEquals(actualMessage2, expectedMessage2);
                break;
        }
    }
}
