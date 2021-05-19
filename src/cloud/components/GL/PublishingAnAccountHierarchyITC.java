package cloud.components.GL;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class PublishingAnAccountHierarchyITC extends BaseTest{
	
	public static String Task;
	public static String Value_Set;
	
	private static void run(){
		if(browser.findElement(By.xpath("//div[@class='shortcuts-popup-wrapper ng-scope']")).isDisplayed())
			browser.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")).click();
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s1:it1::content']"), Task);
	    clickElement(By.xpath("//img[@title='Search']"));
	    clickElement(By.linkText(Task));
	    setElementText(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:qryId1:value00::content"), Value_Set);//"China Account"
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:qryId1::search"));
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ATTt1:0::di"));
	    clickElement(By.xpath("//div[@id='pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ATTt1::db']/table[2]/tbody/tr/td[2]/div/table/tbody/tr/td[1]/div"));
	    if(browser.findElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ctb1")).isEnabled())
	    	clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:_ATTp:ctb1"));
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:ATT1:d1::ok"));
	    clickElement(By.id("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:0:AP1:APscl"));
	    clickElement(By.id("pt1:r1:0:r0:0:AP1:APb"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PublishingAnAccountHierarchyITC.class);
			run();
		}
	}

}
