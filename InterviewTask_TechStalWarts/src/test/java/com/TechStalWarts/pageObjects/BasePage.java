package com.TechStalWarts.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class BasePage extends BaseClass {

	public  WebDriver driver;
	public BasePage( WebDriver driver) {
		this.driver=driver;
	}

	protected void sendDocs(By by, String value) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);;
	}


	protected void sendKeys(By by,String value ) {
		WebElement element=driver.findElement(by);
		element.sendKeys(value);
	}

	protected void clear(By by) {
		driver.findElement(by).clear();
	}

	protected void clicK(By by) {
		//	driver.findElement(by).click();		
		try {
			WebElement l=driver.findElement(by);
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();", l);
			sleepOneSec();}
		catch(Exception e){
			sleep();
			driver.findElement(by).click();
			System.out.println(e.getMessage());
			
		}
	}


	protected void assertCondition4(By by , String tName) {
		WebElement ele=driver.findElement(by);
		if(ele.getText().contains("Records Selected")) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}

	protected void assertCondition3(WebElement element , String tName) {
		if(element.isDisplayed()) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}



	protected void assertCondition3(String url ,String tName) {
		if(!driver.getCurrentUrl().equals(url)) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}

	protected void assertCondition(String msg , String tName) {
		if(driver.getTitle().equals(msg)) {
			Assert.assertTrue(true);
			System.out.println(tName+"  is Passed");
			captureScreenShot(driver, tName);
		}
		else {
			System.out.println(tName+"  is Failed");
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}


	protected void assertCondition2(String url ,String tName) {	 	
		if(driver.getCurrentUrl().equals(url)) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}

	protected void assertCondion4(String msg,By by, String methodName) {
		String msg1=driver.findElement(by).getText();
		if(msg.equalsIgnoreCase(msg1)) {
			Assert.assertTrue(true);
			System.out.println(methodName+ " is Pass and error message is: "+ msg1);
			captureScreenShot(driver, methodName);
		}
		else {
			System.out.println(methodName+ " is Fail");
			captureScreenShot(driver, methodName);
			Assert.assertTrue(false);
		}
	}

	public void clickWithCondition(By by) {
		WebDriverWait 	wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		WebElement l=driver.findElement(by);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", l);
		sleepOneSec();

	}


	public void selectFromDropDown( By by) {
		WebElement ele= driver.findElement(by);
		ele.click();
		ele.sendKeys(Keys.DOWN,Keys.ENTER);
		//	selectFromDropDown(FrameWorkConstants.getBrokerName(), broker);

	}


	public void actionSendKeys(WebElement ele, String value) {
		Actions action=new Actions(driver);
		action.sendKeys(ele	, value);
	}
}


