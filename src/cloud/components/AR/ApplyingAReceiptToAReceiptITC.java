package cloud.components.AR;

import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ApplyingAReceiptToAReceiptITC extends BaseTest{
	

	public static String Receipt_Number_1;
	public static String Receipt_Number_2;
	public static String Applied_Amount;

	private static void run() throws InterruptedException{

		
			
		clickElement(By.xpath("//*[contains(@id,'_UISnvr:0:nvcl1')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_receivables_receivables_balances::icon')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon')]"));
		
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'_FOTRaT:0:RAtl5')]"));
		
		setElementText(By.xpath("//*[contains(@id,'_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RMF:0:ap1:q1:value10::content')]"),Receipt_Number_1);
		
		new Select(browser.findElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:RMF:0:ap1:q1:value70::content')]"))).selectByVisibleText("Confirmed");
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:RMF:0:ap1:q1::search')]"));
		
		clickElement(By.linkText(Receipt_Number_1));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:ATm')]"));
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:m1')]"));
	   
	    clickElement(By.xpath("//*[contains(@id,'RMF:1:pt1:REF:0:ap1:AT1:q2:operator4::content')]"));
	 
	    //new Select(browser.findElement(By.xpath("//*[contains(@id,'RMF:1:pt1:REF:0:ap1:AT1:q2:operator4::content')]"))).selectByVisibleText("Equals");
	    	
		setElementText(By.xpath("//*[contains(@id,':MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2:value40::content')]"),Receipt_Number_2);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:q2::search')]"));
		
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:AT8:_ATp:t4::db')]"));
		
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:cb11done')]"));
		
		setElementText(By.xpath("//*[contains(@id,'MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:AT1:_ATp:table3:0:AmtApplied::content')]"),Applied_Amount);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton1')]"));
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:RMF:1:pt1:REF:0:ap1:commandButton122')]"));
		

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApplyingAReceiptToAReceiptITC.class);
			run();
		}
	}

}
