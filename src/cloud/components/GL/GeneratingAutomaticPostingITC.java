package cloud.components.GL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class GeneratingAutomaticPostingITC extends BaseTest{
	
	public static String Autopost_Criteria;
	public static String Schedule_Frequency;
	public static String Start_Date;
	
	private static void run(){
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl5"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:r1:basicReqBody:paramDynForm_Attribute1_ATTRIBUTE1::content"))).selectByVisibleText(Autopost_Criteria);//"All Journals Japan SL"
	    clickElement(By.cssSelector("span.xpc"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:r1:advRequestBody:scheduleTab11::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:r1:advRequestBody:selectOneRadio1:_1"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:r1:advRequestBody:schRqRn:1:selectOneChoice1::content"))).selectByVisibleText(Schedule_Frequency);//"Once"
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:r1:advRequestBody:schRqRn:1:startdate::content"), Start_Date);//"3/1/2017 9:00 AM"
	    
	    clickElement(By.cssSelector("span.x1gs"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:r1:advRequestBtns:confirmationPopup:confirmSubmitDialog::ok"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(GeneratingAutomaticPostingITC.class);
			run();
		}
	}

}
