package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TechStalWarts.constants.FrameWorkConstants;
import com.TechStalWarts.pageObjects.BasePage;

public class SyncPortFolio extends BasePage{

	public SyncPortFolio(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private final By upload=By.xpath("(//button[text()='Upload Excel'])[2]");
	private final By brows=By.xpath("//input[@type='file']");
	private final By submit=By.xpath("//button[text()='Submit']");
	private final By completeOnboarding=By.xpath("//button[text()='Complete onboarding']");
	private final By name=By.xpath("(//input[@type='text'])[2]");
	private final By broker=By.xpath("(//input[@type='text'])[3]");
	private final By clientID=By.xpath("(//input[@type='text'])[4]");
	private final By fileSubmit=By.xpath("//button[text()='Submit']");
	private final By goTO=By.xpath("//button[text()='Go to Portfolio']");
	private final By continuee=By.xpath("//button[text()='Continue']");



	public SyncPortFolio clickOnContinue() {
		clicK(continuee);
		return this;
	}
	public SyncPortFolio clickOnGotoPortFolio() {
		sleep();
		clicK(goTO);
		return this;
	}
	public SyncPortFolio selectBrokerName() {
		selectFromDropDown(broker);
		return this;
	}
	public SyncPortFolio clickOnFinalSubmit() {
		clicK(fileSubmit);
		return this;
	}
	public SyncPortFolio enterClientID() {
		sendDocs(clientID, FrameWorkConstants.getClientID());
		return this;
	}
	public SyncPortFolio enterPortFolioName() {
		sendKeys(name, FrameWorkConstants.getPortfolioName());
		return this;
	}
	public SyncPortFolio clickOnCompleteOnboarding() {
		clickWithCondition(completeOnboarding);
		return this;
	}
	public SyncPortFolio clickOnSubmit() {
		clickWithCondition(submit);
		return this;
	}
	public SyncPortFolio clickOnUploadExcel() {
		clicK(upload);
		return this;
	}

	public SyncPortFolio browsFile() {
		driver.findElement(brows).sendKeys(FrameWorkConstants.getFilePath());
		return this;
	}



}
