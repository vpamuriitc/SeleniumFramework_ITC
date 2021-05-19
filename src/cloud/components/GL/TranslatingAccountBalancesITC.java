package cloud.components.GL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class TranslatingAccountBalancesITC extends BaseTest{
	
	public static String Data_Access_Set;
	public static String Accounting_Period;
	public static String Balancing_Segment;
	public static String Currency;
	
	private static void run(){
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsdiPeriodCloseRegionalArea::icon"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTRaT:0:RAtl4"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:Translation::content"))).selectByVisibleText(Data_Access_Set);//"France Primary Ledger"

	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:soc3::content"))).selectByVisibleText(Accounting_Period);//"02-17"

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:basicReqBody:dynam1:0:attribute81Id::content"), Balancing_Segment);//131
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:settingsButton"));
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:currencySetting::content"))).selectByVisibleText(Currency);//"US DOLLAR"

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:d1::ok"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:submitButton']"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:MAnt2:1:pt1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok"));
	    

	    
	    if(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsr1:0:pt1:r1:0:ph1:showDetailFrame1::restore")).isDisplayed())
	    	clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsr1:0:pt1:r1:0:ph1:showDetailFrame1::restore"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsr1:0:pt1:r1:0:ph1:r4:0:AT1:_ATp:periodNameId::content"), Accounting_Period);
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_period_close:0:_FOTsr1:0:pt1:r1:0:ph1:r4:0:AT1:_ATp:ctb1::icon"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(TranslatingAccountBalancesITC.class);
			run();
		}
	}

}
