package com.TechStalWarts.testCase;

import java.lang.reflect.Method;
import java.util.Map;

import org.testng.annotations.Test;

import com.JarvisPortfolio.CKYC;
import com.JarvisPortfolio.InvestmentHorizon;
import com.JarvisPortfolio.Personalisedportfolio;
import com.JarvisPortfolio.RiskAssessment;
import com.TechStalWarts.constants.FrameWorkConstants;
import com.TechStalWarts.pageObjects.BaseClass1;
import com.TechStalWarts.pageObjects.LoginPage;
import com.TechStalWarts.testData.DataProviderUtils;

public class TCportFolioGeneration extends BaseClass1{

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void doLogin(Map<String , String> data,Method method) {
		new LoginPage(driver).goToLoginWithUserNamePass().clearTExtField()
		.setuserName(data.get("username")).setPass(data.get("password")).doLogin();
	}


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void riskAssessment(Map<String , String> data) {
		riskass.clickOnInvestNow().clickOnStart().
		qstnOne().qstnTwo().qstnThree().qstnFour().qstnFive().qstnSix().qstnSeven().qstnEgt().qstnNine().qstnTen();
		scrollDown();
		riskass.clickOnSubmit().confirmSubmit();
		scrollDown();
		riskass.clickOnCheckBox().clickOnConfirmRiskAss();
	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void investmentHorizon(Map<String , String> data) {
		new InvestmentHorizon(driver).clickOnCompleteOnboarding();
		scrollDown();
		new InvestmentHorizon(driver).clickOnriskYears().clickOnriskStratergy().clickOnsubmit().clickOnMinBalance().clickOnContinue().clickOnConfirm();
		new InvestmentHorizon(driver).clickOnUnlockNow();
	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void personalisePortfolio(Map<String , String> data) {
		new InvestmentHorizon(driver).clickOnCompleteOnboarding();
		scrollDown();
		new InvestmentHorizon(driver).clickOnUnlockNow();
		new Personalisedportfolio(driver).clickOnPay().clickOnAgree().clickonUPI().typeUPIID(FrameWorkConstants.getUPIID()).clickOnverify();
		scrollDown();
		new Personalisedportfolio(driver).clickOnPayWithPaymentMode().switchFrames();
		scrollDown();
		new Personalisedportfolio(driver). clickOnPayUsingUPI().enterUPIID(FrameWorkConstants.getUPIIDRazorPay()).clickOnPayNow().clickOnProceedToCKYC();

	}
	

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void ckyc(Map<String , String> data) {
		new InvestmentHorizon(driver).clickOnCompleteOnboarding();
		new Personalisedportfolio(driver).clickOnProceedToCKYC();
		new CKYC(driver).enterPANnum(data.get("PAN")).enterDOB(data.get("DOB")).clickOnSubmitVer();
		
		
		
	}





}
