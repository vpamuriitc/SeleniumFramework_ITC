package cloud.components.OTL;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageHCMGroupsITC extends BaseTest{

	public static String Search;
	public static String Name;
	public static String Value;
	

	private static void run() throws InterruptedException
	
	{
		
		clickElement(By.id("pt1:_UIScmil2u::icon"));
		
		clickElement(By.linkText("Setup and Maintenance"));
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //Tasks
		
		clickElement(By.linkText("Search"));   
		
		setElementText(By.xpath("//*[contains(@id, 'it1::content')]"), Search);  //search
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:s9:ctb1')]")); //searchbutton
		
		clickElement(By.linkText("Define Time and Labor"));
		
        clickElement(By.linkText("Manage HCM Groups"));
        
        clickElement(By.xpath("//*[contains(@id, 'AP1:AT1:_ATp:create::icon')]")); //Add
        
        setElementText(By.xpath("//*[contains(@id, 'AP1:it2::content')]"), Name); //name  
        
        clickElement(By.xpath("//*[contains(@id, 'AP1:AT3:_ATp:create::icon')]")); //add
        
        clickElement(By.xpath("//*[contains(@id, 't1:6::di')]"));  //Expand Employment
        
        clickElement(By.xpath("//*[@id=\'pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP1:AT3:t1::db\']/table[2]/tbody/tr[16]/td/div/span[2]")); //Location
        
        clickElement(By.xpath("//*[contains(@id, 'AP1:AT3:soc9::content')]")); //Operator  
        
        clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP1:AT3:soc9::pop']/li[4]")); //EqualTO
        
        setElementText(By.xpath("//*[contains(@id, 'displayValueId::content')]"), Value); //Value 

        clickElement(By.xpath("//*[contains(@id, 'AT3:FAsc1')]")); //saveandclose
        
        clickElement(By.xpath("//span[contains(text(),'ave and Close')]"));
        
        clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP1:cb60"));
        
        

	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageHCMGroupsITC.class);
		run();
	}
}

}
