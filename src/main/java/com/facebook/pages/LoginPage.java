package com.facebook.pages;

import com.facebook.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utils {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(xpath = "//button[@name='login']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='_9ay7']")
    WebElement error1;

    @FindBy(xpath = "//div[@class='_9xo5']/button[2]")
    WebElement acceptCookie;

    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }
    public String verifyerror1(){
       return getTextFromElement(error1);
    }
    public void clickOnaccept(){
        clickOnElement(acceptCookie);
    }
}
