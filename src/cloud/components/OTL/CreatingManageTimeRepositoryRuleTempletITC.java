package cloud.components.OTL;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingManageTimeRepositoryRuleTempletITC extends BaseTest{

	public static String Role;
	public static String FormulaName;
	public static String Name;
	public static String Explanation;
	

	private static void run() throws InterruptedException{
		
		   clickElement(By.xpath("//*[contains(@id, 'UIScmil2u::icon')]")); //user account
		   Thread.sleep(4000);
		   clickElement(By.linkText("Setup and Maintenance")); //set up and maintenance
		   Thread.sleep(4000);
		   clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //task
		   Thread.sleep(4000);
		   clickElement(By.linkText("Search")); //search
		   Thread.sleep(4000);   
		   clickElement(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']")); //
		   Thread.sleep(4000);   
		   setElementText(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']"), Role); //define time and labor
		   Thread.sleep(4000);   
		   clickElement(By.xpath("//*[contains(@id, 'AP1:s9:ctb1')]")); //search
		   Thread.sleep(4000);  
		   clickElement(By.linkText("Define Time and Labor")); 
		   Thread.sleep(4000); 
		   clickElement(By.linkText("Manage Time Repository Rule Templates")); 
		     
		   Thread.sleep(4000);   
		    //clickElement(By.xpath("//*[contains(@id,'AP1:t1:3:cl4')]"));
		   //clickElement(By.linkText("Manage Repeating Time Periods"));
		   Thread.sleep(4000);
		    clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:create::icon')]"));//Add icon
		     
		    clickElement(By.xpath("//*[contains(@id,'0:AP1:AT1:sota3::drop')]")); // TempletType
		     
		    clickElement(By.xpath("//ul[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:sota3::pop']//li[@class='x1r8'][contains(text(),'Time entry rule')]"));// Slect from drop down
		     
		    Thread.sleep(4000);
		    setElementText(By.xpath("//*[contains(@id,'bf5::content')]"), FormulaName);// Formula Name
		    Thread.sleep(4000);
		    clickElement(By.xpath("//*[contains(@id,'0:AP1:AT1:pc3')]"));//Continue
		    Thread.sleep(4000);
		     
		    setElementText(By.xpath("//*[contains(@id,'1:pt1:AP1:it1::content')]"), Name);
		    Thread.sleep(4000);
		    clickElement(By.xpath("//*[contains(@id,'1:pt1:AP1:soc1::drop')]"));// RuleClassification
		     
		    Thread.sleep(4000);
		    clickElement(By.xpath("//li[contains(text(),'Business message')]"));// Business message
		    Thread.sleep(4000);
		    clickElement(By.xpath("//*[contains(@id,'pt1:AP1:soc4::drop')]"));//drop
		    Thread.sleep(4000);
		    clickElement(By.xpath("//ul[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP1:soc4::pop']//li[@class='x1r8'][contains(text(),'Day')]"));// Day
		    Thread.sleep(4000);
		    clickElement(By.xpath("//label[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP1:sbc3::Label0']"));//Select checkbox
		    Thread.sleep(4000);
		    clickElement(By.xpath("//*[contains(@id,'pt_tbb1:1:_afrButtonStopNavItem')]"));//Next
		     
		    clickElement(By.xpath("//*[contains(@id,'ATp:ATt1:0:socrpt::drop')]"));//drop
		    clickElement(By.xpath("//ul[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:AT1:_ATp:ATt1:0:socrpt::pop']//li[@class='x1r8'][contains(text(),'Fixed number')]"));
		     
		    clickElement(By.xpath("//*[contains(@id,'ATp:ATt1:1:socrpt::drop')]"));//drop
		    clickElement(By.xpath("//ul[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:AT1:_ATp:ATt1:1:socrpt::pop']//li[@class='x1r8'][contains(text(),'Message')]"));
		     
		    clickElement(By.xpath("//*[contains(@id,'ATp:ATt1:2:socrpt::drop')]"));//drop
		    clickElement(By.xpath("//ul[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:AT1:_ATp:ATt1:2:socrpt::pop']//li[@class='x1r8'][contains(text(),'Time category')]"));
		
		    clickElement(By.xpath("//button[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:pt_tbb1:1:_afrButtonStopNavItem']")); //next  
	        clickElement(By.xpath("//button[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:3:pt1:AP1:pt_tbb1:1:_afrButtonStopNavItem']")); //next
	        
	        clickElement(By.xpath("//*[contains(@id,'seltkn::content')]")); //messageToken
	        
	        clickElement(By.xpath("//li[contains(text(),'MESSAGE_CODE')]"));
	        
	        setElementText(By.xpath("//*[contains(@id,'it1::content')]"), Explanation); //Explanation
	        
	        clickElement(By.xpath("//button[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:4:pt1:AP1:pt_tbb1:1:_afrButtonStopNavItem']")); //next
	        
	        clickElement(By.xpath("//*[contains(@id,'cmdSave')]")); //saveandclose
		    
		    clickElement(By.xpath("//*[contains(@id,'csvd81')]")); //ok
		    
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingManageTimeRepositoryRuleTempletITC.class);
		run();
	}
}

}
