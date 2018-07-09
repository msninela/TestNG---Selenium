package com.company.seleniumframework.functional_area;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import javax.naming.InterruptedNamingException;

public class LaunchBrowser {

private WebDriver driver;

	//String browserType = suite.getParameter("browserType");
	//String appURL = suite.getParameter("appURL");

//Getting the websriver using parameters from the xml file
	@Parameters({ "browserType", "appURL" })
	@BeforeMethod
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error dakjakaakjkdxsv" + e.getStackTrace());
		}
	}

	//creating a method to set the IE driver
	private static WebDriver initInternetExplorerDriver(String appURL) throws InterruptedException {
		System.out.println("Launching InternetExplorer browser..");
		System.setProperty("webdriver.ie.driver","C:\\Users\\ninmal01\\Documents\\CSG\\Leraning Selenium\\GitHub\\getting-started-with-selenium\\IEDriverServer");
		WebDriver driver = new InternetExplorerDriver();

		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	//creating a method to set the Chrome driver
	private static WebDriver initChromeDriver(String appURL) throws InterruptedException {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ninmal01\\Documents\\CSG\\Leraning Selenium\\GitHub\\getting-started-with-selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		return driver;
	}

	/*using the driver from the initializeTestBaseSetup and the IE/Chrome driver returned
	from initInternetExplorerDriver & initChromeDriver, to set according to the case statement */

	private void setDriver(String browserType, String appURL) throws InterruptedException{

		if (browserType == "InternetExplorer") {
			driver = initInternetExplorerDriver(appURL);
		}
			else {
			driver = initChromeDriver(appURL);
			}

		}

	public WebDriver getDriver() {
		return driver;
	}

/*
	@AfterMethod
	@AfterClass

	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing the browser");
			driver.quit();
		}
	}
*/
}
