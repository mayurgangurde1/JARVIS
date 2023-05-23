package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class E_Sign extends BasePage {

	public E_Sign(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By plan=By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div");
	private final By continuee=By.xpath("//button[text()='Continue']");
	private final By pay=By.xpath("//button[text()='Pay ']");
	private final By iAgree=By.xpath("//button[text()='I agree']");
	private final By pan=By.xpath("//input[@aria-invalid='false' and @type='text' and @maxlength='12']");
	private final By dob=By.xpath("//input[@aria-invalid='false' and @placeholder='dd/mm/yyyy']");
	private final By submit=By.xpath("//button[text()='Submit for verification']");
	private final By proceedCLientAgree=By.xpath("//button[text()='Proceed to Client Agreement' and @type='button']");
	private final By confirmThat=By.xpath("//div[text()='I confirm that ']");
	private final By agreeTHat=By.xpath("//div[text()='I agree the ']");
	private final By proceed=By.xpath("//div[text()='Proceed ']");
	
	
	
	
	public E_Sign clickOnProceed() {
		clicK(proceed);
		return this;
	}
	public E_Sign clickOnAgree() {
		clicK(agreeTHat);
		return this;
	}
	public E_Sign clickOnconfirmation() {
		clicK(confirmThat);
		return this;
	}
	public E_Sign clickOnProceedToClientAgreemtn() {
		clicK(proceedCLientAgree);
		return this;
	}

	public E_Sign clickOnSubmit() {
		clicK(submit);
		return this;
	}

	public E_Sign enterDOB(String value) {
		sendKeys(dob, value);
		return this;
	}
	public E_Sign enterPAN(String value) {
		sendKeys(pan, value);
		return this;
	}

	public E_Sign clickOnIagree() {
		clicK(iAgree);
		return this;
	}
	public E_Sign clickOnPay() {
		clicK(pay);
		return this;
	}
	public E_Sign clickOnContinue() {
		clicK(continuee);
		return this;
	}


	public E_Sign clickOnPlan() {
		clicK(plan);
		return this;
	}



}
