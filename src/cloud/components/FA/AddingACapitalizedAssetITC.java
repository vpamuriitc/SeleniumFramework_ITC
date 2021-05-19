package cloud.components.FA;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class AddingACapitalizedAssetITC extends BaseTest {
	public static String book;
	public static String Assetname;
	public static String cost;
	public static String asset_number;
	public static String tag_number;

	private static void run() throws Exception{
		
		browser.findElement(By.xpath("//img[@title='Tasks']")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.linkText("Add Asset")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1KBIMG::icon")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value00::lovIconId")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value00::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value10::lovIconId")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value10::dropdownPopup::dropDownContent::db']/table/tbody/tr[4]/td")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SEl")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:descriptionId::content")).clear();
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:descriptionId::content")).sendKeys(Assetname);
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:it1::content")).clear();
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:it1::content")).sendKeys(cost);
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3KBIMG::icon")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value00::lovIconId")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value00::dropdownPopup::dropDownContent::db']/table/tbody/tr[6]/td")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value10::lovIconId")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value10::dropdownPopup::dropDownContent::db']/table/tbody/tr[5]/td")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value20::lovIconId")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value20::dropdownPopup::dropDownContent::db']/table/tbody/tr[3]/td")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value30::lovIconId")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value30::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SEl")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:commandButton1")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:inputText4::content")).clear();
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:inputText4::content")).sendKeys(asset_number);
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:inputText3::content")).clear();
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:inputText3::content")).sendKeys(tag_number);
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:saveButton::popEl")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:inputText5::content")).clear();
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:inputText5::content")).sendKeys("vhop0987");
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:cmi1']/td[2]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:dialog5::ok")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=13t9phwqyz | ]]
	    browser.findElement(By.cssSelector("#1484293136226 > span.xpc > span.x1gs")).click();
	    
	}

	public static void run(int iterations) throws Exception
	{	

		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddingACapitalizedAssetITC.class);
			run();
		}

	}


}
