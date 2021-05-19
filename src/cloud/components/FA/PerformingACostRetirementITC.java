package cloud.components.FA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PerformingACostRetirementITC extends BaseTest{

	public static String CostRetired	;
	public static String ProceedsofSale;


	private static void run(){


		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_fixed_assets_additions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl11"));	    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:q1::search"));

		clickElement(By.cssSelector("td.xu5"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:findAssetVCQueryResultId:_ATp:cb2"));	    

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:inputText8::content"), "Expired Warranty");

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:costRetired::content"), CostRetired);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:proceedsOfSale::content"), ProceedsofSale);


		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:selectOneChoice3::content"))).selectByVisibleText("Sale");

		clickElement(By.cssSelector("option[title=\"Sale\"]"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:selectOneChoice2::content"))).selectByVisibleText("MID-MONTH");

		clickElement(By.cssSelector("option[title=\"MID-MONTH\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:ctb1::popEl"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:inputText1::content"), "Test ITC CORP");

//		clickElement(By.cssSelector("td.x1fk"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:commandButton7']/a/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:cb1"));	    


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PerformingACostRetirementITC.class);
			run();
		}
	}

}
