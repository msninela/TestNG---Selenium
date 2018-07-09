package com.company.seleniumframework.functional_area;

import io.ddavison.conductor.Locomotive;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;

public class RegisterPlayer extends Page_Factory {

    public RegisterPlayer(WebDriver driver){
        super(driver);
    }

    private final String Registerplayerpath = "driver.findElement(By.xpath(\"/html/body/header/div/nav/div[11]/a/div\")).click();";
    @FindBy(xpath = Registerplayerpath)
    private WebElement Registerplayer;

    public boolean isInitialized() {

        return Registerplayer.isDisplayed();

    }

    public void registerPlayer(){

        this.Registerplayer.click();

    }

}
