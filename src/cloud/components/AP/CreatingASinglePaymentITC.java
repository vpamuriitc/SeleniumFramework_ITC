package cloud.components.AP;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingASinglePaymentITC extends BaseTest{
	
	//public static String Supplier_or_Party;
	public static String Party_Name;
	public static String Bank_Account;
	public static String Name;
	public static String Invoice_Number;
	//public static String Invoice_Number;
	//public static String DisbursementBankAccount;
	
//	public static String PaymentProcessProfile;
	
	public static String Invoice;
	public static String Payment_Number;
	
	private static void run() throws Exception  {
		

		clickElement(By.id("pt1:_UISmmLink::icon")); 
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_payables_payables_payments::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl4"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::lovIconId"));
		              
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::lovIconId"), Supplier_or_Party);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::_afrLovInternalQueryId:value00::content"), Party_Name);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::_afrLovInternalQueryId::search"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId_afrLovInternalTableId::db\"]/table/tbody/tr")); //selecting a row
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:cb8")); //click cancel btn
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentTypeFlagUi::content")); //Select type
		//setElementText(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:bankAccountNameId::lovIconId\"]"),DisbursementBankAccount);
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:bankAccountNameId::lovIconId"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:bankAccountNameId::dropdownPopup::popupsearch"));
		setElementText(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:bankAccountNameId::_afrLovInternalQueryId:value00::content\"]"),Bank_Account); 
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:bankAccountNameId::_afrLovInternalQueryId::search"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:bankAccountNameId_afrLovInternalTableId::db\"]/table/tbody/tr"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:bankAccountNameId::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentProfileUICompId::lovIconId"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentProfileUICompId::dropdownPopup::popupsearch"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentProfileUICompId::_afrLovInternalQueryId:value00::content"), Name);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentProfileUICompId::_afrLovInternalQueryId::search"));
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentProfileUICompId_afrLovInternalTableId::db\"]/table/tbody/tr"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentProfileUICompId::lovDialogId::ok"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:AT1:_ATp:commandToolbarButton1::icon"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:coVOId:value00::content"), Invoice_Number);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:coVOId::search"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:combinedVOCriteriaQueryResultId:_ATp:t1::db\"]/table/tbody/tr"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:dialog1::ok"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:cb5")); //save and close
		clickElement(By.id("_FOd1::msgDlg::cancel")); //ok btn
		//clickElement(By.xpath("//*[@id=\"_FOd1::msgDlg::cancel\"]"));
		
		
	
		
		
		

//		clickElement(By.id("pt1:nv_itemNode_payables_payables_payments"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:_FOTRaT:0:RAtl4"));

	//	setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:payeeNameId::content"), Supplier);


		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:bankAccountNameId::content"), DisbursementBankAccount);

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:bankAccountNameId::_afrautosuggestpopup"));

		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:1:MAnt2:1:AP1:paymentProfileUICompId::content"), PaymentProcessProfile);
		
//		clickElement(By.cssSelector("li.p_AFSelected.AFAutoSuggestItem"));
//		
//
//		browser.manage().timeouts().pageLoadTimeout(20000,TimeUnit.SECONDS);
//		
//		Thread.sleep(20000);
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:showDetailItem2::disAcr"));
//		 
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:selectBooleanCheckbox1::content"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:AT1:_ATp:commandToolbarButton1::icon"));
//
//		Thread.sleep(20000);
//
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:coVOId:value00::content"), Invoice);
//		
//		Thread.sleep(10000);
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:coVOId::search"));
//		
//		Thread.sleep(30000);
//		
//		clickElement(By.cssSelector("td.xe7"));
//		
//		Thread.sleep(30000);
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:cb1"));
//		
//		Thread.sleep(20000);
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:dialog1::ok"));
//				
//		Thread.sleep(30000);
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_payments:0:MAnt2:1:AP1:cb5"));
//		  
//		Thread.sleep(100000);
//		
//		captureOutput(By.id("_FOd1::msgDlg::_cnt"), Payment_Number);
//		
//		clickElement(By.id("_FOd1::msgDlg::cancel"));
//		               
//		Thread.sleep(30000);
		 
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingASinglePaymentITC.class);
			run();
		}
	}

}
