package cloud.components.OTL;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ManageTimeConsumerSetsITC extends BaseTest{

	public static String Search;
	public static String Name;
	

	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id, 'UIScmil2u::icon')]"));
		
		clickElement(By.linkText("Setup and Maintenance"));
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //Tasks
		
		clickElement(By.linkText("Search"));   
		
		setElementText(By.xpath("//*[contains(@id, 'it1::content')]"), Search);  //search
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:s9:ctb1')]")); //searchbutton
		
		clickElement(By.linkText("Manage Time Consumer Sets"));
		
		clickElement(By.xpath("//*[contains(@id, '_ATp:create::icon')]"));
				
		setElementText(By.xpath("//*[contains(@id, 'AP2:it2::content')]"), Name);
		
		//Project Costing
		
		clickElement(By.xpath("//label[contains(text(),'Project Costing')]")); //Time Consumer
		
		clickElement(By.xpath("//*[contains(@id, 'soc13::content')]")); //Enable Informational Workflow for Bulk Time Card Submission	
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id=\'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:soc13::pop\']/li[3]"));
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id=\'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:si211::content\']")); //Enable Informational Approval Workflow for Workers
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id=\'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:si211::pop\']/li[3]"));
		Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id, 'AP2:soc1::content')]")); //TimeCategory
		
		clickElement(By.xpath("//li[contains(text(),'All Project Entries')]"));
		
		clickElement(By.xpath("//*[contains(@id, 'AP2:soc4::content')]")); //Approval
		Thread.sleep(4000);
		clickElement(By.xpath("//li[contains(text(),'Projects Weekly Starting Monday')]"));
		
		clickElement(By.xpath("//*[@id=\"pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:smc2::content\"]/div/span/label")); //ApprovalRequired  AP2:smc2::content
		
		
		//PayRoll
		clickElement(By.xpath("//label[contains(text(),'Payroll')]")); //Time Consumer
		
		clickElement(By.xpath("//*[contains(@id, 'AP2:soc5::content')]"));  // TimeCategory
		Thread.sleep(4000);
		clickElement(By.xpath("//*[@id=\'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:soc5::pop\']/li[5]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'AP2:soc8::content')]")); //Approval
		
		clickElement(By.xpath("//div[@id='DhtmlZOrderManagerLayerContainer']//li[4]"));
		
		clickElement(By.xpath("//span[contains(text(),'ave and Close')]"));
		
		clickElement(By.xpath("//button[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:cb3']"));
		//browser.findElement(By.xpath("")).sendKeys(Keys.);;
		
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageTimeConsumerSetsITC.class);
		run();
	}
}

}
