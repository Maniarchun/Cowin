package com.covin.Cowin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CowinSelect {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Cowin\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cowin.gov.in/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1300)");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", driver.findElement(By.xpath(
					"//div[@class='mat-form-field-infix ng-tns-c58-351']//parent::div[@class='mat-select-trigger ng-tns-c69-352']")));
			js.executeScript("arguments[0].click()",
					driver.findElement(By.xpath("//div[@role='listbox']//parent::span[text()=' Tamil Nadu ']")));
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", driver.findElement(By.xpath(
					"//div[@class='mat-form-field-infix ng-tns-c58-353']//ancestor::div[@id='mat-select-value-7']")));
			js.executeScript("arguments[0].click()",
					driver.findElement(By.xpath("//div[@role='listbox']/mat-option/span[text()=' Chennai ']")));
			js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@class='searchBtn pin-search-btn district-search accessibility-plugin-ac']")));
			Thread.sleep(2000);
			WebElement selectAge = driver.findElement(By.xpath("//label[text()='18+']"));
			selectAge.click();
			WebElement selectDose = driver.findElement(By.xpath("//label[text()='Dose 2']"));
			selectDose.click();
			WebElement fee = driver.findElement(By.xpath("//label[text()='Paid']"));
			fee.click();
			WebElement vaccine = driver.findElement(By.xpath("//label[text()='Covishield']"));
			vaccine.click();
			List<WebElement> centerName = driver.findElements(By.xpath("//div[@class='row']//ancestor::h5[@class='center-name-title accessibility-plugin-ac']"));
			System.out.println("Available Center");
			for (WebElement center : centerName) {
				System.out.println(center.getText());
			}
			String showAge = driver.findElement(By.xpath("//span[text()='18+']")).getText();
			String showDose = driver.findElement(By.xpath("//span[text()='2']")).getText();
			String showFee = driver.findElement(By.xpath("//li//span[text()='Paid']")).getText();
			String showVaccine = driver.findElement(By.xpath("//li//span[text()='COVISHIELD']")).getText();
			if (selectAge.getText().equals(showAge)) {
				System.out.println("Showing age and selected age are same");
			}else {
				System.out.println("Showing age and selected age are not same");
			}
			if (selectDose.getText().contains(showDose)) {
				System.out.println("Showing dose and selected dose are same");
			}else {
				System.out.println("Showing dose and selected dose are not same");
			}
			if (fee.getText().equals(showFee)) {
				System.out.println("Showing fee and selected fee are same");
			}else {
				System.out.println("Showing fee and selected fee are not same");
			}
			if (vaccine.getText().equalsIgnoreCase(showVaccine)) {
				System.out.println("Showing vaccine and selected vaccine are same");
			}else {
				System.out.println("Showing vaccine and selected vaccine are not same");
			}

		}
}
