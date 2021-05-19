package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDivisionsITC extends BaseTest{

	public static String Name;
	public static String ReportingName;
	public static String ManagerValue;

	private static void run() throws InterruptedException
	
	{		
		
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		//Thread.sleep(3000);
		clickElement(By.linkText("Workforce Structures"));////work structures link
		//Thread.sleep(3000);
		clickElement(By.linkText("Manage Divisions")); //ManageDivisions
		//Thread.sleep(3000);
		clickElement(By.xpath("//span[contains(text(),'Create')]")); //Create
		
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:2:AP1:inputText1::content')]"), Name);//name
		
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP1:tt1:next')]"));
		
		Thread.sleep(3000);
		setElementText(By.xpath("//*[contains(@id,'0:CTXRN1:0:_REPORTING_NAME::content')]"), ReportingName);
		
		Thread.sleep(3000);
		setElementText(By.xpath("//*[contains(@id,'0:CTXRN1:0:_MANAGER_Display::content')]"), ManagerValue);
		
		Thread.sleep(3000);
		
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:AP2:tt1:next')]")); //next
		
		Thread.sleep(3000);
		
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:4:ap1:tt1:submit')]")); //Submit
		
		clickElement(By.xpath("//*[contains(@id,'ap1:tt1:okWarningDialog')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'tt1:okConfirmationDialog')]"));
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDivisionsITC.class);
			run();
		}
	}

}
