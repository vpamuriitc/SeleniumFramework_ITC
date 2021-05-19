package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingReportingEstablishmentsITC extends BaseTest{

	public static String Name;
	public static String Location;
	public static String Reporting_Name;
	public static String Manager;
	

	

	private static void run() throws InterruptedException
	
	{
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		Thread.sleep(2000);
		clickElement(By.linkText("Workforce Structures"));//work structures link
	    //Thread.sleep(2000);
		clickElement(By.linkText("Manage Reporting Establishments"));//Manage Reporting Establishments
	    //Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP1:AT2:_ATp:commandToolbarButton12\\\"]/a/span')]"));// Create 
	    //Thread.sleep(2000);
		
	    setElementText(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText1::content\"]"), Name); //name
	    //Thread.sleep(2000);
	    setElementText(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:locationCode1Id::content\"]"), Location); //Location
	    //Thread.sleep(2000);
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP1:tt1:next\\')]"));//next
	    //Thread.sleep(2000);
	    setElementText(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content\"]"), Reporting_Name);  //Reporting Name
	    //Thread.sleep(2000);
	   // setElementText(By.id(""), Manager);  //Manager
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:AP2:tt1:next\\')]"));//next
	    //Thread.sleep(2000);
	   
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:4:ap1:tt1:submit\\')]"));//Submit
	    //Thread.sleep(2000);
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:4:ap1:tt1:okWarningDialog')]"));//Yes
	   
	    //Thread.sleep(2000);
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:4:ap1:tt1:okConfirmationDialog')]"));//OK
	   
	    
	    
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingReportingEstablishmentsITC.class);
			run();
		}
	}

}




