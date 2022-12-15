package com.cowin.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CowinHomePom {
	public static WebDriver driver;
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c58-351']//parent::div[@class='mat-select-trigger ng-tns-c69-352']")
	private WebElement state;
	
	
	@FindBy(xpath = "//div[@role='listbox']//parent::span[text()=' Tamil Nadu ']")
	private WebElement stSelect;

	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c58-353']//ancestor::div[@id='mat-select-value-7']")
	private WebElement district;

	@FindBy(xpath = "//div[@role='listbox']/mat-option/span[text()=' Chennai ']")
	private WebElement dtSelect;
	
	@FindBy(xpath = "//button[@class='searchBtn pin-search-btn district-search accessibility-plugin-ac']")
	private WebElement clickButton;
	
	@FindBy(xpath = "//label[text()='18+']")
	private WebElement selectAge;
	
	@FindBy(xpath = "//label[text()='Dose 2']")
	private WebElement selectDose;
	
	@FindBy(xpath = "//label[text()='Paid']")
	private WebElement fee;
	
	@FindBy(xpath = "//label[text()='Covishield']")
	private WebElement vaccine;
	
	@FindBy(xpath = "//div[@class='row']//ancestor::h5[@class='center-name-title accessibility-plugin-ac']")
	private List<WebElement> center;
	
	@FindBy(xpath = "//span[text()='18+']")
	private WebElement showAge;
	
	@FindBy(xpath = "//span[text()='2']")
	private WebElement showDose;	
	
	@FindBy(xpath = "//li//span[text()='Paid']")
	private WebElement showFee;	

	@FindBy(xpath = "//li//span[text()='COVISHIELD']")
	private WebElement showVaccine;	
	
	public CowinHomePom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getStSelect() {
		return stSelect;
	}

	public WebElement getDistrict() {
		return district;
	}

	public WebElement getDtSelect() {
		return dtSelect;
	}

	public WebElement getClickButton() {
		return clickButton;
	}

	public WebElement getSelectAge() {
		return selectAge;
	}

	public WebElement getSelectDose() {
		return selectDose;
	}

	public WebElement getFee() {
		return fee;
	}

	public WebElement getVaccine() {
		return vaccine;
	}

	public List<WebElement> getCenter() {
		return center;
	}

	public WebElement getShowAge() {
		return showAge;
	}

	public WebElement getShowDose() {
		return showDose;
	}

	public WebElement getShowFee() {
		return showFee;
	}

	public WebElement getShowVaccine() {
		return showVaccine;
	}

}
