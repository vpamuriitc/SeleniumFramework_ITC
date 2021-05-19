package cloud.components.FA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ViewingDepreciationAccountingEntriesITC extends BaseTest{
	public static String  Asset_Number;
	public static String Search;
	
	private static void run() throws InterruptedException{
		
		
		Thread.sleep(2000);
		                    
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));
		
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_fixed_assets_inquiry"));
				
		//clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::ti"));
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl21"));
		setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:q1:value20::content"), Asset_Number);
				
		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:q1:value40::content"))).selectByVisibleText("Capitalized");
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:q1::search"));
		//..............................asset no. 111862, category - FURNITURE-OFFICE
		
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:showDetailHeader2::_afrDscl"));
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:showDetailHeader2::_afrDscl"));
		//Thread.sleep(2000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP4:r1:0:r2:0:sdi1::disAcr"));    //Financial 
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:sdi3::ti"));    //Descriptive
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:sdi4::ti"));    //Source Line
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:sdi5::ti"));    //Assignment
		Thread.sleep(2000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:sdi6::ti"));    //Cost History
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:sdi7::ti"));    //Depreciation
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:AP4:r1:0:r2:0:sdi8::ti"));    //Transaction
		Thread.sleep(2000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:AP4:cb1"));                       //Done
		
		
		
		
		
		
		
//		Thread.sleep(4000);
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));
//		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl20"));
//		
//		Thread.sleep(4000);
//		
//	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:q1:value30::content"))).selectByVisibleText("Capitalized");
//	    
//	    clickElement(By.cssSelector("option[title=\"Capitalized\"]"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:q1::search"));
//	    
//	    
//	    Thread.sleep(4000);
//	    
//	    clickElement(By.cssSelector("td.xzn"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:sdi7::disAcr"));
//	    
//	    Thread.sleep(2000);
//	    
//	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:AT7:_ATp:ctb1']/a/span"));
//	    
//	    Thread.sleep(4000);
//	    
//	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:AT7:r3:0:AT1:_ATp:commandToolbarButton1']/a/span"));
//	    
//	    Thread.sleep(4000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:AT7:r3:0:dialog2::ok"));
//	    
//	    Thread.sleep(4000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:r1:0:r2:0:AT7:d2::ok"));
//	    
//	    Thread.sleep(4000);
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:AP4:cb1"));
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ViewingDepreciationAccountingEntriesITC.class);
			run();
		}
	}

}
