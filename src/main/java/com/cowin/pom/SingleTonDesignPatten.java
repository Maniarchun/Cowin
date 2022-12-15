package com.cowin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPatten {
	public static WebDriver driver;

	public SingleTonDesignPatten(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public CowinHomePom getCowinHome() {
		CowinHomePom ch = new CowinHomePom(driver);
		return ch;
	}

}
