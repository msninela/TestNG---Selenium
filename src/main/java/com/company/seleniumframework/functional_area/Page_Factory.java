package com.company.seleniumframework.functional_area;

import io.ddavison.conductor.Locomotive;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Factory {

    protected WebDriver driver;


    public  Page_Factory(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}
