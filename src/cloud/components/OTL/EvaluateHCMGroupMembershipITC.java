package cloud.components.OTL;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class EvaluateHCMGroupMembershipITC extends BaseTest{

	public static String Search;
	public static String Group;
	public static String Name;
	public static String Date;
	

	private static void run() throws InterruptedException{
		
				clickElement(By.id("pt1:_UIScmil2u::icon"));
		
				clickElement(By.linkText("Setup and Maintenance"));
		
				clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //Tasks
		
				clickElement(By.linkText("Search"));   
		
				setElementText(By.xpath("//*[contains(@id, 'it1::content')]"), Search);  //search
		
				clickElement(By.xpath("//*[contains(@id, 'AP1:s9:ctb1')]")); //searchbutton
			
				clickElement(By.linkText("Define Time and Labor"));
		
		        clickElement(By.linkText("Evaluate HCM Group Membership"));
		        
		        setElementText(By.xpath("//*[contains(@id, 'aTTRIBUTE1Id::content')]"), Group); //Group
		        
		        setElementText(By.xpath("//*[contains(@id, 'aTTRIBUTE8Id::content')]"), Name); //PersonName

		        setElementText(By.xpath("//*[contains(@id, 'id1::content')]"), Date); //Date 
		        
		        clickElement(By.xpath("//*[contains(@id, 'soc1::content')]"));
		        
		        clickElement(By.xpath("//li[contains(text(),'No')]"));
		        
		        clickElement(By.xpath("//*[contains(@id, 'submitButton')]")); //submitButton
		        
		        clickElement(By.xpath("//*[contains(@id, 'confirmSubmitDialog::ok')]")); //ok
		        
		        

		
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(EvaluateHCMGroupMembershipITC.class);
		run();
	}
}

}
