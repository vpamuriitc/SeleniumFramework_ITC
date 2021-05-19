package cloud.components.AR;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatinganAdjustmentITC extends BaseTest{
	
	public static String Transaction_Class;
	public static String Transaction_Number;
	public static String Receivables_Activity;
	public static String Adjustment_Type;
	public static String Adjustment_Amount;
	public static String Adjustment_Reason;
	
	private static void run(){
		
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		
		clickElement(By.xpath("//*[contains(@id,'_UISnvr:0:nvcl1')]"));
	 	
		clickElement(By.xpath("//*[contains(@id,'0:nv_itemNode_receivables_billing')]"));//Bills Icon
	 	
		clickElement(By.xpath("//*[contains(@id,'0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon')]"));	    
		
		clickElement(By.xpath("//*[contains(@id,'_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl3')]"));// Manage Transaction
		
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value20::content"))).selectByVisibleText(Transaction_Class);
		setElementText(By.xpath("//*[contains(@id,'1:pt1:MTF1:0:ap1:q1:value40::content')]"),Transaction_Number);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:MTF1:0:ap1:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'MTF1:0:ap1:AT2:_ATp:table2:0:cl1')]"));// Click Number link
		clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:mb1::oc\"]/table"));
		clickElement(By.xpath("//*[contains(@id,'MTF1:1:pt1:Trans1:0:ap110:cmi2')]")); // Manage Adjustments
		clickElement(By.xpath("//*[contains(@id,'1:pt1:Trans1:1:ap1:AT1:_ATp:create::icon')]"));
		setElementText(By.xpath("//*[contains(@id,'1:pt1:Trans1:1:ap1:AT1:actvty::content')]"),Receivables_Activity);
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:selectOneChoice1::content"))).selectByVisibleText(Adjustment_Type);
		setElementText(By.xpath("//*[contains(@id,'1:pt1:Trans1:1:ap1:AT1:amountId::content')]"),Adjustment_Amount);
		
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:selectOneChoice2::content"))).selectByVisibleText(Adjustment_Reason);
		clickElement(By.xpath("//*[contains(@id,'MTF1:1:pt1:Trans1:1:ap1:AT1:saveBtn1')]"));
		
		
			}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatinganAdjustmentITC.class);
			run();
		}
	}

}
