package com.irctc.baseclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.irctc.pageLayer.Homepage;
import com.irctc.pageLayer.bokingTrinList;
import com.irctc.utils.Utility;

public class BaseClass {
//Base
	//ok
	public static WebDriver driver;
	Homepage Ir;
	bokingTrinList bk;
	SoftAssert assrt;
	int testID;

	@BeforeClass
	public void initializeBrowser() throws IOException {

		System.setProperty(Utility.getDataFromPropertyFile("chrome_key"),
				Utility.getDataFromPropertyFile("chrome_value"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Utility.getDataFromPropertyFile("url"));

	}

	@BeforeMethod
	public void beforemethod() throws IOException, InterruptedException {

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			Utility.captureScreenshot(driver, testID);

		}
		if (ITestResult.SKIP == result.getStatus()) {

			Utility.captureScreenshot(driver, testID);

		}
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
