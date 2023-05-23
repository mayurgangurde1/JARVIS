package com.JarvisPortfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TechStalWarts.pageObjects.BasePage;

public class OneStock extends BasePage {

	public OneStock(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By pay=By.xpath("(//button[@tabindex='0' and @type='button'])[4]");
	private final By iAgree=By.xpath("(//button[@tabindex='0' and @type='button'])[6]");
	
	
	
	public OneStock clickOnPay() {
		clicK(pay);
		return this;
	}
	public OneStock clickOnAgree() {
		clicK(iAgree);
		return this;
	}
	
	
	
	

}
