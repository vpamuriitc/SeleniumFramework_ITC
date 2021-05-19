package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ManageEnterpriseHCMInformationITC extends BaseTest{

	public static String ApplSearch;
	public static String StartTime;
	public static String EndTime;
	

	private static void run() throws InterruptedException
	{
		
		//Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'r0:0:r1:0:sdi10::icon')]"));//AllTasks
		clickElement(By.xpath("//*[contains(@id,'r1:0:r10:0:i3:6:cl11')]"));//search
		setElementText(By.xpath("//*[contains(@id,'r0:1:AP1:s9:it1::content')]"), ApplSearch);
		clickElement(By.xpath("//*[contains(@id,'r0:1:AP1:s9:ctb1::icon')]"));//search button
		clickElement(By.linkText("Manage Enterprise HCM Information")); //ManageEnterpriseHCMInformation
		//Thread.sleep(9000);
		clickElement(By.xpath("//*[contains(@id,'ap1:tt1:commandToolbarButton1')]"));//Edit
		//Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'ap1:tt1:commandMenuItem2')]")); //correct
		
		//Thread.sleep(4000);
		setElementText(By.xpath("//*[contains(@id,'CTXRN1:0:_WORK_START_TIME::content')]"), StartTime);
		setElementText(By.xpath("//*[contains(@id,'CTXRN1:0:_WORK_END_TIME::content')]"), EndTime);//workendtime
		clickElement(By.xpath("//div[contains(@title,'Submit')]")); //submit
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManageEnterpriseHCMInformationITC.class);
			run();
		}
	}

}
