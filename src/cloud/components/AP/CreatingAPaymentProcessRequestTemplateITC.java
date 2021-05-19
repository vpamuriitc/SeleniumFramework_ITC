package cloud.components.AP;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingAPaymentProcessRequestTemplateITC extends BaseTest{
	
	public static String Name;
	public static String Description;
	public static String Pay_Through_Days;
	public static String Disbursement_Bank_Account;
	
	
	
	
	public static void run() throws Exception{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_payables_payables_payments::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl3"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:ATtb1::eoi"));  //>> btn
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:cil1::icon"));  //create button
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:inputText1::content"), Name);  //name field
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:inputText3::content"), Description); //Description
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:inputText5::content"), Pay_Through_Days); //Pay Through Days
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:showDetailItem3::disAcr")); //click on Payment and Processing Options
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::lovIconId")); //Click drop down button
		Thread.sleep(2000);
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::content"), Disbursement_Bank_Account);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:selectBooleanCheckbox1\"]/td[2]/span/span/label"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:selectBooleanCheckbox1::content"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:APsv2")); //Save button
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::dropdownPopup::popupsearch"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::_afrLovInternalQueryId:value00::content")); //Bank Account
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::_afrLovInternalQueryId::search"));
//		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId_afrLovInternalTableId::db\"]/table/tbody/tr")); //selecting row
//		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:bankAccountNameId::lovDialogId::ok"));
//		Thread.sleep(2000);
	
		//setElementText(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:selectBooleanCheckbox1\"]/td[2]/span/span/label"), True);
		
		
		
		
		
//	    clickElement(By.id("pt1:nv_itemNode_payables_payables_payments"));
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl3"));
//	
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT1:_ATp:cil1::icon"));
//	 
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:inputText1::content"));
//	 
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:inputText1::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:inputText1::content"), Name);
//	
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:inputText3::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:inputText3::content"), Description);
//	
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:inputText5::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:inputText5::content"), Pay_Through_Days);
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:showDetailItem3::disAcr"));
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:bankAccountNameId::content"));
//	
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:bankAccountNameId::content"));
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:bankAccountNameId::content"), Disbursement_Bank_Account);
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:selectBooleanCheckbox1::content"));
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:2:ap1:APsv"));
//	  
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
		
	}

public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingAPaymentProcessRequestTemplateITC.class);
		run();
	}
}
}
