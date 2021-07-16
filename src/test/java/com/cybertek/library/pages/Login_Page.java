package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    public Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="inputEmail")
    public WebElement usernameInput;

    @FindBy(id="inputPassword")
    public WebElement userPasswordInput;

    @FindBy(xpath="//button[.='Sign in']")
    public WebElement signInButton;
}
