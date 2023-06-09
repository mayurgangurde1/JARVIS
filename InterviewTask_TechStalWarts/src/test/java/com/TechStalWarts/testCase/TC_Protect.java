package com.TechStalWarts.testCase;

import java.lang.reflect.Method;
import java.util.Map;

import org.testng.annotations.Test;

import com.JarvisPortfolio.E_Sign;
import com.JarvisPortfolio.Personalisedportfolio;
import com.JarvisPortfolio.SyncPortFolio;
import com.TechStalWarts.constants.FrameWorkConstants;
import com.TechStalWarts.pageObjects.BaseClass1;
import com.TechStalWarts.pageObjects.LoginPage;
import com.TechStalWarts.testData.DataProviderUtils;

public class TC_Protect extends BaseClass1 {




	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_pro_001(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField()
		.setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		sleep();
	}



	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_pro_002(Map<String , String> data,Method method) {//		riskass.clickOnInvestNowTwo(). 
riskass. clickOnStart().ProOneAns().ProTwoAns().ProThreeAns().ProFourAns()
		.ProFiveAns().ProSixAns().ProSevenAns().ProEightAns().ProNineAns().ProTenAns();
		riskass.clickOnSubmit().confirmSubmit();scrollDown();sleep();sleep();
		riskass.clickOnCheckBox().clickOnConfirmRiskAss();sleep();
	}


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_pro_003(Map<String , String> data,Method method) {
		sleep();
		
		new SyncPortFolio(driver).clickOnCompleteOnboarding(). clickOnUploadExcel().
		browsFile().enterPortFolioName().enterClientID().selectBrokerName()
		.clickOnFinalSubmit();sleep();sleep();
		new SyncPortFolio(driver). clickOnGotoPortFolio();sleep();sleep();
		sleep();sleep();
	
	}


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData" )
	public void tc_pro_004(Map<String , String> data,Method method) {
//		sleep();
//		new E_Sign(driver).clickOnContinuee().clickOnPlan().clickOnContinue().clickOnPay().clickOnIagree();
//		new Personalisedportfolio(driver).clickonUPIProtect().enterUPIIDProtect(FrameWorkConstants.getUPIID()).clickOnverify();
//		scrollDown();
//		new Personalisedportfolio(driver).clickOnpayWithPaymentModeProtce().switchFrames();
//		scrollDown();
//		new Personalisedportfolio(driver). clickOnPayUsingUPI() .enterUPIID(FrameWorkConstants.getUPIIDRazorPay()).clickOnPayNow();
//		sleep();sleep(); sleep();
//		new SyncPortFolio(driver).clickOnContinue();
		
		sleep();
		new E_Sign(driver). enterPAN(data.get("PAN")).enterDOB(data.get("DOB")).clickOnSubmit();
		sleep();sleep();
		new E_Sign(driver).clickOnProceedToClientAgreemtn();
		sleep();sleep();
		new E_Sign(driver).clickOnconfirmation().clickOnAgree().clickOnProceed().clickOnSignNow();

	}





}
