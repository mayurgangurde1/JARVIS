package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class InvestmentHorizon extends BasePage {

	public InvestmentHorizon(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By riskYears=By.xpath("//button[text()='3 Yr']");
	private final By riskStratergy=By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]");
	private final By submit=By.xpath("//button[text()='Submit my strategy']");
	private final By onboarding=By.xpath("//button[text()='Complete onboarding']");
	private final By minBalance=By.xpath("//button[text()='₹50,00,000']");
	private final By clickContinue=By.xpath("//button[text()='Continue']");
	private final By clickOnConfirm=By.xpath("(//button[text()='Confirm'])[1]");

	
	
	public InvestmentHorizon clickOnConfirm() {
		clicK(clickOnConfirm);
		return this;
	}

	public InvestmentHorizon clickOnContinue() {
		clicK(clickContinue);
		return this;
	}
	public InvestmentHorizon clickOnMinBalance() {
		clicK(minBalance);
		return this;
	}
	public InvestmentHorizon clickOnCompleteOnboarding() {
		clicK(onboarding);
		return this;
	}
	public InvestmentHorizon clickOnriskYears() {
		clicK(riskYears);
		return this;
	}

	public InvestmentHorizon clickOnriskStratergy() {
		clicK(riskStratergy);
		return this;
	}

	public InvestmentHorizon clickOnsubmit() {
		clicK(submit);
		return this;
	}

}
