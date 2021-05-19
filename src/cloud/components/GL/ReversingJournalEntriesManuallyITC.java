package cloud.components.GL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ReversingJournalEntriesManuallyITC extends BaseTest{
	
	public static String Journal;
	public static String Accounting_Period;
	public static String Batch_Status;
	
	private static void run(){
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl1"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:queryP:value00::content"), Journal);
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:queryP:value20::content"), Accounting_Period);
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:queryP:value50::content"))).selectByVisibleText(Batch_Status);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:queryP::search"));
	    clickElement(By.linkText(Journal));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:showMoreHeader"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:sdi7::disAcr"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:accrualRevPeriodName::lovIconId"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:accrualRevPeriodName::dropdownPopup::dropDownContent::db']/table/tbody/tr[8]/td"));
	    clickElement(By.linkText("Journal Actions"));
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:cmi2']/td[2]"));
	    clickElement(By.cssSelector("td > a.x1gr > span.xpc"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:commandToolbarButton5']/a/span"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:queryP:value00::content"), Journal);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:queryP::search"));
	    clickElement(By.linkText(Journal));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:showMoreHeader"));
	    clickElement(By.cssSelector("td > a.x1gr > span.xpc"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:commandToolbarButton5']/a/span"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReversingJournalEntriesManuallyITC.class);
			run();
		}
	}

}
