package cloud.components.CoreHR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class ManagingEmploymentInformationITC extends BaseTest{
	
	public static String PersonName;
	public static String Location;
	
	
	private static void run() throws InterruptedException
	
	{
		
		//Thread.sleep(4000);
		setElementText(By.xpath("//*[contains(@id,'Perso1:0:SP3:q1:value00::content')]"), PersonName);//Name
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), PersonName); //Name
		//Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'Perso1:0:SP3:q1::search')]"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));
		//Thread.sleep(4000);
		clickElement(By.xpath("//button[@title='Actions']")); 
	    //Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'SP3:table1:am2:dc_i1:3:dcm1')]"));//PersonalandEmployement
	    //clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dcm1']/td[2]")); //PersonalandEmployement
	    //Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'SP3:table1:am2:dc_i1:3:dci1:7:dccmi1')]"));
	    //clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:am2:dc_i1:3:dci1:7:dccmi1']/td[2]")); //ManageEmployment
	    //Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'0:MAt1:0:pt1:Manag1:0:AP1:edit')]"));
	    //clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:edit']/table/tbody/tr/td[1]/a/span")); //Edit
	    //Thread.sleep(4000);
	    clickElement(By.xpath("//*[contains(@id,'AP1:updBtn')]")); //Update
	    //Thread.sleep(4000);
	    clickElement(By.xpath("//*[contains(@id,'Manag1:0:AP1:actionsName1::content')]"));
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionsName1::content")); //action
	    //Thread.sleep(4000);
	    clickElement(By.xpath("//li[contains(text(),'Location Change')]")); //locationchange
	    //Thread.sleep(4000);
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb10")); //ok
	    clickElement(By.xpath("//*[contains(@id,'0:MAt1:0:pt1:Manag1:0:AP1:cb10')]"));//Ok
	    //Thread.sleep(4000);
	    setElementText(By.xpath("//*[contains(@id,'Manag1:1:r:JobDe1:0:locationId::content')]"), Location);
	    browser.findElement(By.xpath("//*[contains(@id,'Manag1:1:r:JobDe1:0:locationId::content')]")).sendKeys(Keys.TAB);
	   // setElementText(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:r:JobDe1:0:locationId::content']"), Location); //Location
	    //Thread.sleep(4000);
	    clickElement(By.xpath("//*[contains(@id,'0:MAt1:0:pt1:Manag1:1:r:tt1:review')]"));//Review
	   // clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:r:tt1:review']")); //Review
	    //Thread.sleep(10000);
	    clickElement(By.xpath("//*[contains(@id,'0:pt1:Manag1:2:AP1:tt1:submit\')]"));
	    //clickElement(By.xpath("//*[@id=\'_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:submit\']/a")); //Submit
	    //Thread.sleep(4000);
	    clickElement(By.xpath("//*[contains(@id,'Manag1:2:AP1:tt1:okWarningDialog')]")); //Yes
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:okWarningDialog")); //yes
	    //Thread.sleep(8000);
	    clickElement(By.xpath("//*[contains(@id,'Manag1:2:AP1:tt1:okConfirmationDialog')]"));//OK
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:okConfirmationDialog")); //ok
	    //Thread.sleep(4000);
	    clickElement(By.xpath("//*[contains(@id,'0:MAt1:0:pt1:Manag1:0:AP1:cb7')]"));//Done
	    //clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb7']")); //Done

	}
	
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingEmploymentInformationITC.class);
			run();
		}
	}

}
