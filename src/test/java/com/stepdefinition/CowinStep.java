package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cowin.baseclass.BaseClassCowin;
import com.cowin.pom.SingleTonDesignPatten;
import com.cowin.properties.ConfigHelper;
import com.runner.CowinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CowinStep extends BaseClassCowin {
	WebDriver driver = CowinRunner.driver;
	WebElement selectAge, selectDose, fee, vaccine;
	SingleTonDesignPatten stdp = new SingleTonDesignPatten(driver);

	@Given("user Launch The Application Url")
	public void user_Launch_The_Application_Url() throws InterruptedException, IOException {
		String url = ConfigHelper.getInstance().getUrl();
		urlLaunch(url);
	}

	@When("user Select The State")
	public void user_Select_The_State() throws InterruptedException {
		sleep();

		jScriptScroll(0, 1300);
		Thread.sleep(1000);

		WebElement state = stdp.getCowinHome().getState();
		javaScript("click", state);
		WebElement stSelect = stdp.getCowinHome().getStSelect();
		javaScript("click", stSelect);
	}

	@When("user Select The District")
	public void user_Select_The_District() throws InterruptedException {
		sleep();
		WebElement district = stdp.getCowinHome().getDistrict();
		javaScript("click", district);
		WebElement dtSelect = stdp.getCowinHome().getDtSelect();
		javaScript("click", dtSelect);
	}

	@When("user Click The Search")
	public void user_Click_The_Search() throws InterruptedException {
		WebElement search = stdp.getCowinHome().getClickButton();
		javaScript("click", search);
		sleep();
	}

	@When("user Select The Age Group")
	public void user_Select_The_Age_Group() {
		selectAge = stdp.getCowinHome().getSelectAge();
		clickElement(selectAge);
	}

	@When("user Select The No Of Dose")
	public void user_Select_The_No_Of_Dose() {
		selectDose = stdp.getCowinHome().getSelectDose();
		clickElement(selectDose);
	}

	@When("user Select The Cost Of Dose")
	public void user_Select_The_Cost_Of_Dose() {
		fee = stdp.getCowinHome().getFee();
		clickElement(fee);
	}

	@When("user Select The Vaccine")
	public void user_Select_The_Vaccine() {
		vaccine = stdp.getCowinHome().getVaccine();
		clickElement(vaccine);
	}

	@When("user Print The Availabe Center")
	public void user_Print_The_Availabe_Center() {
		List<WebElement> centerName = stdp.getCowinHome().getCenter();
		System.out.println("Available Center");
		System.out.println("----------------");
		for (WebElement center : centerName) {
			System.out.println(center.getText());
		}
	}

	@Then("user Compare Selected Option are Showing")
	public void user_Compare_Selected_Option_are_Showing() throws InterruptedException {
		String showAge = stdp.getCowinHome().getShowAge().getText();
		String showDose = stdp.getCowinHome().getShowDose().getText();
		String showFee = stdp.getCowinHome().getShowFee().getText();
		String showVaccine = stdp.getCowinHome().getShowVaccine().getText();
		sleep();
		System.out.println("---------------------------------");
		if (selectAge.getText().equals(showAge)) {
			System.out.println("Showing age and selected age are same");
		} else {
			System.out.println("Showing age and selected age are not same");
		}
		System.out.println("---------------------------------");
		if (selectDose.getText().contains(showDose)) {
			System.out.println("Showing dose and selected dose are same");
		} else {
			System.out.println("Showing dose and selected dose are not same");
		}
		System.out.println("---------------------------------");
		if (fee.getText().equals(showFee)) {
			System.out.println("Showing fee and selected fee are same");
		} else {
			System.out.println("Showing fee and selected fee are not same");
		}
		System.out.println("---------------------------------");
		if (vaccine.getText().equalsIgnoreCase(showVaccine)) {
			System.out.println("Showing vaccine and selected vaccine are same");
		} else {
			System.out.println("Showing vaccine and selected vaccine are not same");
		}
	}

}
