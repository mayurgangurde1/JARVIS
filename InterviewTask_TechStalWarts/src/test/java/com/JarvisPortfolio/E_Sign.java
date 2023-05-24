package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class E_Sign extends BasePage {

	public E_Sign(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By plan=By.xpath("(//div[@class='MuiBox-root css-8atqhb'])[1]");
	private final By continuee=By.xpath("//button[text()='Continue']");
	private final By pay=By.xpath("//button[text()='Pay ']");
	private final By iAgree=By.xpath("//button[text()='I agree']");
	private final By pan=By.xpath("//input[@aria-invalid='false' and @type='text' and @maxlength='12']");
	private final By dob=By.xpath("//input[@aria-invalid='false' and @placeholder='dd/mm/yyyy']");
	private final By submit=By.xpath("//button[text()='Submit for verification']");
	private final By proceedCLientAgree=By.xpath("//button[text()='Proceed to Client Agreement' and @type='button']");
	private final By confirmThat=By.xpath("(//div[@class='w-3/12 max-w-fit flex mx-2']/input[@type='checkbox'])[1]");
	private final By agreeTHat=By.xpath("(//div[@class='w-3/12 max-w-fit flex mx-2']/input[@type='checkbox'])[2]");
	private final By proceed=By.xpath("//div[text()='Proceed ']");
	private final By signNow=By.xpath("//div[text()='Sign Now ']");
	private final By OTP=By.xpath("//*[@id=\"otp_0_2ysomdjciogli03wey7\"]");
	private final By continueee=By.xpath("(//button[@tabindex='0' and @type='button'])[8]");
	private final By onboarding=By.xpath("//button[text()='Complete onboarding']");



	public E_Sign clickOnOnboarding() {
		clicK(onboarding);
		return this;
	}

	public E_Sign enterOTP() {
		actionSendKeys(driver.findElement(OTP), baseURL);
		return this;
	}

	public E_Sign clickOnSignNow() {
		clicK(signNow);
		return this;
	}
	public E_Sign clickOnProceed() {
		clicK(proceed);
		return this;
	}
	public E_Sign clickOnAgree() {
		sleep();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"digio-ifm-1684921909766\"]")));
		clicK(agreeTHat);
		return this;
	}
	public E_Sign clickOnconfirmation() {
		sleep();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"digio-ifm-1684921909766\"]")));
		clicK(confirmThat);
		return this;
	}
	public E_Sign clickOnProceedToClientAgreemtn() {
		sleep();
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


	public E_Sign clickOnContinuee() {
		clicK(continueee);
		return this;
	}



}
