package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cowin.baseclass.BaseClassCowin;
import com.cowin.properties.ConfigHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ELCOT\\eclipse-workspace\\Cowin\\src\\test\\java\\com\\feature\\Cowin.feature", 
					glue = "com.stepdefinition", 
					monochrome = true, 
					plugin = {"pretty",
							"html:Report/cowin.html", 
							"junit:Report/cowin.xml", 
							"json:Report/cowin.json" })
public class CowinRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browser = ConfigHelper.getInstance().getBrowser();
		driver = BaseClassCowin.browserLaunch(browser);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
