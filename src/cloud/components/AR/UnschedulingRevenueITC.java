package cloud.components.AR;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class UnschedulingRevenueITC extends BaseTest{

	public static String Transaction_Date;
	public static String Comments;



	private static void run() throws InterruptedException{

		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_receivables_receivables_revenue')]"));
	    
		clickElement(By.xpath("//*[contains(@id,'0:_FOTsdiRevenueAdjustmentsTaskList::icon')]"));
	    
		clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_receivables_receivables_revenue:0:_FOTRaT:0:RAtl1')]"));
	    
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:0:ap1:q1:value50::content')]"));
	    
	    setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:0:ap1:q1:value50::content')]"),Transaction_Date);
	   
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:0:ap1:q1::search')]"));
	    //Thread.sleep(5000);	    
	    clickElement(By.cssSelector("td.p_AFFocused.xzn")); 
	    Thread.sleep(5000);
	    clickElement(By.xpath("//*[contains(@id,'0:ap1:transactionLinesAppTable:_ATp:commandButton4')]"));
	 
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_revenue:0:MAnt2:1:pt1:pt_r1:1:ap1:soc1::content"))).selectByVisibleText("Other");
	    clickElement(By.cssSelector("option[title=\"Other\"]"));
	    
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:1:ap1:inputText1::content')]"));
	    
	    setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:1:ap1:inputText1::content')]"),Comments);
	   
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:1:ap1:commandButton1')]"));
	    
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:1:ap1:popupYesButton')]"));
	    
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:pt_r1:2:ap1:panelSaveandClose')]"));
	    
	    clickElement(By.cssSelector("span.x1l5"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(UnschedulingRevenueITC.class);
			run();
		}
	}

}




