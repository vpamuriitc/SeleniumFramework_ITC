package cloud.components.OTL;
import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageWorkerTimeProcessingProfilesITC extends BaseTest{

	public static String Role;
	public static String ProfileName;
	public static String StartDate;
	public static String TimecardPeriod;
	public static String OvertimePeriod;
	public static String TimeConsumerSet;
	public static String TimeCalculationRuleSet;
	public static String GroupName;
	public static String FromDate;
	public static String ToDate;
	
private static void run() throws InterruptedException	
	
	{
		clickElement(By.id("pt1:_UIScmil2u::icon")); //user account//*[contains(@id, 'UIScmil2u::icon')]
		
		clickElement(By.linkText("Setup and Maintenance")); //set up and maintenance
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //task
		
		clickElement(By.linkText("Search")); //search			
		
		clickElement(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']")); //
			
		setElementText(By.xpath("//input[@id='pt1:r1:0:r0:1:AP1:s9:it1::content']"), Role); //define time and labor
			
		clickElement(By.xpath("//div[@id='pt1:r1:0:r0:1:AP1:s9:ctb1']//a[@class='xx3']")); //search
		
		clickElement(By.linkText("Define Time and Labor")); //define time and labor link
				
		clickElement(By.linkText("Manage Worker Time Processing Profiles")); //Manage Worker Time Processing Profiles link
						
		clickElement(By.xpath("//*[contains(@id, 'AP1:AT1:_ATp:create::icon')]")); //create
		
		clickElement(By.xpath("//*[contains(@id, 'it1::content')]")); //profile name
		
		setElementText(By.xpath("//*[contains(@id, 'it1::content')]"), ProfileName); 
		
		clickElement(By.xpath("//*[contains(@id, 'id2::content')]")); //effective start date
		
		setElementText(By.xpath("//*[contains(@id, 'id2::content')]"), StartDate); 
		
		clickElement(By.xpath("//*[contains(@id, 'TimePeriodNameId::content')]")); //timecard period
		
		setElementText(By.xpath("//*[contains(@id, 'TimePeriodNameId::content')]"), TimecardPeriod); 		
		
//		clickElement(By.xpath("//*[contains(@id, 'overtimePeriodNameId::content')]")); //overtime period
//		
//		setElementText(By.xpath("//*[contains(@id, 'overtimePeriodNameId::content')]"), OvertimePeriod); 
//		
		clickElement(By.xpath("//*[contains(@id, 'TimeConsumerNameId::content')]")); //time consumer set
		
		setElementText(By.xpath("//*[contains(@id, 'TimeConsumerNameId::content')]"), TimeConsumerSet); 
		
//		clickElement(By.xpath("//*[contains(@id, 'ruleSetTCRNameId::content')]")); //time calculation rule set
//		
//		setElementText(By.xpath("//*[contains(@id, 'ruleSetTCRNameId::content')]"), TimeCalculationRuleSet); //				
		
		clickElement(By.xpath("//*[contains(@id, 'AP2:APnxb')]")); //next
		
		clickElement(By.xpath("//*[contains(@id, 'AP3:AT1:_ATp:create::icon')]")); //create		
		
		clickElement(By.xpath("//*[contains(@id, 'groupNameId::content')]")); //group name
		
		setElementText(By.xpath("//*[contains(@id, 'groupNameId::content')]"), GroupName); 
		
		clickElement(By.xpath("//*[contains(@id, 'id2::content')]")); //from date
		
		setElementText(By.xpath("//*[contains(@id, 'id2::content')]"), FromDate); 
		
		clickElement(By.xpath("//*[contains(@id, 'id1::content')]")); //to date
		
		setElementText(By.xpath("//*[contains(@id, 'id1::content')]"), ToDate); 
		
		clickElement(By.xpath("//*[contains(@id, 'AP3:APnxb')]")); //next
		
		clickElement(By.xpath("//*[contains(@id, 'AP4:APnxb')]")); //next
		
		clickElement(By.xpath("//span[contains(text(),'ave and Close')]")); //save and close
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:4:pt1:AP5:cb3")); //ok	
	
}
public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageWorkerTimeProcessingProfilesITC.class);
		run();
	}
}
}