package cloud.components.GL;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAndPostingAStandardJournalITC extends BaseTest{
	
	public static String Journal_batch;
	public static String Journal_batch_desc;
	public static String Journal;
	public static String Journal_desc;
	public static String Category;
	public static String Account1;
	//public static String Alias;
	public static String debit_amount;
	public static String Account2;
	public static String credit_amount;
	
	private static void run() throws InterruptedException{
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		Thread.sleep(9000);
		clickElement(By.xpath("//*[contains(@id,'pt1:nv_moreLk')]"));
		Thread.sleep(9000);
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_general_accounting_journals')]"));// Journals
		//pt1:nv_itemNode_general_accounting_journals
		Thread.sleep(9000);
		clickElement(By.xpath("//*[contains(@id,'JournalEntryPage_itemNode_FndTasksList::icon')]"));
		
		Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:_FOTRaT:0:RAtl2')]"));
		setElementText(By.xpath("//*[contains(@id,'pt1:ap1:showLessBatchName::content')]"), Journal_batch);
		//new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessBatchDescription::content"))).selectByVisibleText("Corrections for balances in error");
	   // setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessBatchDescription::content"), Journal_batch_desc);
	    setElementText(By.xpath("//*[contains(@id,'pt1:ap1:showLessBatchDescription::content')]"), Journal_batch_desc);
	    setElementText(By.xpath("//*[contains(@id,'pt1:ap1:showLessJournalName::content')]"), Journal);
	   // setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessJournalName::content"), Journal);
	    setElementText(By.xpath("//*[contains(@id,'ap1:showLessJournalDescription::content')]"), Journal_desc);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:showLessJournalDescription::content"), Journal_desc);
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'ap1:userJeCategoryNameId1::lovIconId')]"));//click on category drop down
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::lovIconId")); //click on category drop down
		clickElement(By.xpath("//*[contains(@id,'ap1:userJeCategoryNameId1::dropdownPopup::popupsearch')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::dropdownPopup::popupsearch"));
		setElementText(By.xpath("//*[contains(@id,'userJeCategoryNameId1::_afrLovInternalQueryId:value00::content')]"), Category);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::_afrLovInternalQueryId:value00::content"), Category);
		
		clickElement(By.xpath("//*[contains(@id,'userJeCategoryNameId1::_afrLovInternalQueryId::search')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::_afrLovInternalQueryId::search"));
		
		clickElement(By.xpath("//*[contains(@id,'ap1:userJeCategoryNameId1_afrLovInternalTableId::db')]"));
		//clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1_afrLovInternalTableId::db\"]/table/tbody/tr[1]"));
		clickElement(By.xpath("//*[contains(@id,'ap1:userJeCategoryNameId1::lovDialogId::ok')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::lovDialogId::ok"));
		Thread.sleep(3000);
		//Thread.sleep(3000);
		setElementText(By.xpath("//*[contains(@id,'jeLineAppTable:_ATp:t3:0:accountCS::content')]"), Account1);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS::content"), Account1);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::lovIconId"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::dropdownPopup::popupsearch"));
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:account_kffSearchSha::_afrLovInternalQueryId:value00::content"), Alias);
		setElementText(By.xpath("//*[contains(@id,'ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content')]"), debit_amount);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content"), debit_amount);
		clickElement(By.xpath("//*[contains(@id,'ap1:jeLineAppTable:_ATp:t3::db')]"));
		//clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3::db\"]/table/tbody/tr[2]"));
		setElementText(By.xpath("//*[contains(@id,'jeLineAppTable:_ATp:t3:1:accountCS::content')]"), Account2);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS::content"), Account2);
		setElementText(By.xpath("//*[contains(@id,'ap1:jeLineAppTable:_ATp:t3:1:EnteredCr::content')]"), credit_amount);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredCr::content"), credit_amount);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:account_kffSearchDialog::close"));
		clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:1:pt1:ap1:saveBatch')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:saveBatch"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:ap1:completeButton')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:completeButton"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:ap1:postBatch')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:postBatch"));
		clickElement(By.xpath("//*[contains(@id,'ap1:userResponsePopupDialogButtonOk')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:pt1:ap1:userResponsePopupDialogButtonOk"));
		
	    clickElement(By.cssSelector("td > a.x1gr > span.xpc"));
	    clickElement(By.linkText("Complete"));
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:ap1:postBatch')]"));
	    //clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:postBatch']/table/tbody/tr/td/a/span"));
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:userResponsePopupDialogButtonOk"));
	    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAndPostingAStandardJournalITC.class);
			run();
		}
	}

}
