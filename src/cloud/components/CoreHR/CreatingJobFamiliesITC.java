package cloud.components.CoreHR;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingJobFamiliesITC extends BaseTest{
	
	public static String Name;
	public static String Code;
	//public static String JobFamilyCode;
	
	private static void run() throws InterruptedException{
			
		                       	
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		Thread.sleep(2000);
		clickElement(By.linkText("Workforce Structures"));////work structures link
		//Thread.sleep(2000);
		clickElement(By.linkText("Manage Job Families"));//Job families link
		//Thread.sleep(2000);	
		clickElement(By.xpath("//*[contains(@id,'1:jfSearchPnl:jfSrchResApplTbl:_ATp:createBtn')]")); //Create button
		//Thread.sleep(2000);	
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:2:AP3:inputText1::content')]"), Name); //  Name
		//Thread.sleep(2000);	
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:2:AP3:it1::content')]"), Code);// Code
		//Thread.sleep(2000);	
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP3:tt1:submit')]"));//Submit
		//Thread.sleep(2000);	
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP3:tt1:okWarningDialog')]"));//Yes              	
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP3:tt1:okConfirmationDialog')]"));//OK    
		
				
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingJobFamiliesITC.class);
			run();
		}
	}

}
