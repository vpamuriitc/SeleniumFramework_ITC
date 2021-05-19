package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingGradeRatesITC extends BaseTest{
	
	public static String Legislative_Data_Group ;
	public static String Name;
	public static String Grade;
	public static String Minimum;
	public static String Maximum;
	
	
	private static void run() throws InterruptedException{
		
			
			clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
			Thread.sleep(2000);
			clickElement(By.linkText("Workforce Structures"));////work structures link
		    //Thread.sleep(2000);
		    clickElement(By.linkText("Manage Grade Rates"));// Manage Grade Rates
		    //Thread.sleep(2000);
		    clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP4:AT5:_ATp:commandToolbarButton1::icon')]")); // Create button
		    //Thread.sleep(2000);
			setElementText(By.xpath("//*[contains(@id,'1:AP4:AT5:legislativeDataGroupNameId::content')]"), Legislative_Data_Group);
		    //Thread.sleep(2000);
			clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP4:AT5:commandButton2')]"));// OK
		    //Thread.sleep(2000);
			setElementText(By.xpath("//*[contains(@id,'MAnt2:2:AP2:inputText2::content')]"), Name); //Name
		    //Thread.sleep(2000);
			clickElement(By.xpath("//*[contains(@id,'ATp:addRateValueinCreate::icon')]")); // Add row
		    //Thread.sleep(2000);
			setElementText(By.xpath("//*[contains(@id,'_ATp:t1:0:nameId::content')]"), Grade);// Grade
		    //Thread.sleep(2000);
			setElementText(By.xpath("//*[contains(@id,'_ATp:t1:0:it2::content')]"), Minimum);// Min
		    //Thread.sleep(2000);
			setElementText(By.xpath("//*[contains(@id,'_ATp:t1:0:it3::content')]"), Maximum);//Max
		    //Thread.sleep(2000);
			clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP2:tt1:review')]"));//Review
		    //Thread.sleep(2000);
			clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:AP1:tt1:submit')]"));// Submit
		    //Thread.sleep(2000);
			clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:AP1:tt1:okWarningDialog')]"));//Yes
		    //Thread.sleep(2000);
			clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:AP1:scOk')]"));// Ok
		    
		    
		    
		    		    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingGradeRatesITC.class);
			run();
		}
	}

}
