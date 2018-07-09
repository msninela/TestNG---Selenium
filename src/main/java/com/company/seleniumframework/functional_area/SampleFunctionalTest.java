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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;




/**
 * This is a sample test that can get you started.
 * <br><br>
 * This test shows how you can use the concept of "method chaining" to create successful, and independent tests, as well as the validations method that can get you started.
 * @author ddavison
 *
 */

/**@Config(
    url = "http://ddavison.github.io/tests/getting-started-with-selenium.htm", // base url that the test launches against
    browser = Browser.CHROME, // the browser to use.
    hub = "" // you can specify a hub hostname / ip here.
)
**/
// RIGHT CLICK SampleFunctionTest and run the test suite, or run each method individually.

public class SampleFunctionalTest extends LaunchBrowser{

    private WebDriver driver;

    private RegisterPlayer registerP;

    @BeforeTest
    public void setup(){



        registerP = new RegisterPlayer(driver);
        //LaunchBrowser obj1 = new LaunchBrowser();
        //obj1.getDriver();
    }

    @org.testng.annotations.Test(priority = 1)
    public void verifyregisterPlayer() throws InterruptedException {

        System.out.println("inside..");
        Thread.sleep(5000);
        registerP.registerPlayer();

        System.out.println("outsite..");


    }

}
