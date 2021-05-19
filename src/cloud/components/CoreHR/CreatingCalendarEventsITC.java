package cloud.components.CoreHR;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingCalendarEventsITC extends BaseTest{
	
	public static String Responsibility;
	public static String Event_Name;
	public static String ShortCode;
	public static String StartDate;
	public static String EndDate;
	
	
	private static void run() throws InterruptedException 
	
	
	
	{
		
		//Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'r0:0:r1:0:AP1:soc2::drop')]"));//setup
		clickElement(By.xpath("//li[contains(text(),'Workforce Deployment')]")); //workforceDeployment
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"), Responsibility); //taskname
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'0:AP1:s92:ctb3::icon')]"));// Search
		Thread.sleep(5000);
		clickElement(By.linkText("Manage Calendar Events")); //ManagecalendarEvents
		//Thread.sleep(8000);
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:commandToolbarButton11')]"));//create
		setElementText(By.xpath("//*[contains(@id,'appspanel2:inputText1::content')]"), Event_Name);//Name
		//Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'appspanel2:selectOneChoice1::content')]"));
		clickElement(By.xpath("//li[contains(text(),'Public holiday')]"));//public holiday
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'1:appspanel2:inputDate1::content')]"), StartDate);//StartDate
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'1:appspanel2:inputDate2::content')]"), EndDate);//Enddate
	    Thread.sleep(5000);
	    setElementText(By.xpath("//*[contains(@id,'1:appspanel2:inputText2::content')]"), ShortCode);//shortcode
		Thread.sleep(5000);
	    clickElement(By.xpath("//*[contains(@id,'1:appspanel2:choice1::content')]")); //hirerarchytype
		Thread.sleep(5000);
	    clickElement(By.xpath("//li[contains(text(),'Geographic')]")); //
		//Thread.sleep(5000);
	    clickElement(By.xpath("//*[contains(@id,'1:appspanel2:choice2::content')]")); 
		clickElement(By.xpath("//li[contains(text(),'ITC Global HCM Tree')]")); 
		clickElement(By.xpath("//span[contains(text(),'Include')]"));//Include
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'1:appspanel2:Tbut2')]"));//Submit
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'1:appspanel2:confirmD::ok')]"));//ok
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingCalendarEventsITC.class);
			run();
		}
	}

}
