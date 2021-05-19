package cloud.components.CoreHR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class HiringEmployeesITC extends BaseTest{

	public static String LegalEmployer;
	public static String PersonNumber;
	public static String LastName;
	public static String FirstName;
	public static String city;
	public static String Address;

	

	private static void run() throws InterruptedException
	
	{			
		clickElement(By.xpath("//*[contains(@title,'Hire an Employee')]"));
		clickElement(By.xpath("//*[contains(@id,'cl01Pce:cl01Lv:1:cl01Pse:cl01Cl')]"));
		//clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:_FOTsr1:0:cl01Upl:UPsp1:cl01Pce:cl01Lv:1:cl01Pse:cl01Cl']")); //hireanemployee
		////Thread.sleep(9000);
		setElementText(By.xpath("//*[contains(@id,'selectOneChoice3::content')]"), LegalEmployer); //legalEmployer
		browser.findElement(By.xpath("//*[contains(@id,'selectOneChoice3::content')]")).sendKeys(Keys.TAB);
		////Thread.sleep(5000);
	    setElementText(By.xpath("//*[contains(@id,'NewPe1:0:r1:0:it1::content')]"), PersonNumber);//PersonNumber
	    browser.findElement(By.xpath("//*[contains(@id,'NewPe1:0:r1:0:it1::content')]")).sendKeys(Keys.TAB);
	    ////Thread.sleep(5000);
		////Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'NewPe1:0:pt_r1:0:r1:0:i1:5:it60::content')]"), FirstName); //FirstName
		
		setElementText(By.xpath("//*[contains(@id,'NewPe1:0:pt_r1:0:r1:0:i1:7:it20::content')]"), LastName); //lastname
		
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:pt_r1:0:SP1:tt1:next')]"));
		
		setElementText(By.xpath("//*[contains(@id,'Perso1:0:Maint1:0:i1:0:inputText17::content')]"), Address); //AddressLine1
		//_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:1:MAnt2:1:pt1:pt_r1:1:SP1:Perso2:0:Perso1:0:Maint1:0:i1:0:inputText17::content
		////Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'inputComboboxListOfValues26::content')]"), city);// City
		 browser.findElement(By.xpath("//*[contains(@id,'inputComboboxListOfValues26::content')]")).sendKeys(Keys.TAB);
		//*[contains(@id,'inputComboboxListOfValues26::content')]
		//setElementText(By.xpath("//*[contains(@id,'inputComboboxListOfValues28::content')]"), Pincode); //PostalCode
		
		////Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'1:pt1:pt_r1:1:SP1:tt1:next')]"));//Next
		//clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:1:SP1:tt1:next']/a")); //Next
		////Thread.sleep(5000);
		setElementText(By.xpath("//input[contains(@id,'businessUnitId::content')]"), "IT Convergence PS India");
		 browser.findElement(By.xpath("//*[contains(@id,'businessUnitId::content')]")).sendKeys(Keys.TAB);
//		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:2:sP2:NewPe3:0:NewPe1:0:businessUnitId::lovIconId']")); //BusinessUnit
//		////Thread.sleep(5000);
//		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:2:sP2:NewPe3:0:NewPe1:0:businessUnitId::dropdownPopup::dropDownContent::db']/table/tbody/tr[8]/td/span"));
		////Thread.sleep(5000);
		//clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:2:sP2:tt1:next']/a")); //next
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:pt_r1:2:sP2:tt1:next')]")); //next
		
		clickElement(By.xpath("//*[contains(@id,'_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:3:SP1:tt1:next')]"));//next
		////Thread.sleep(9000);
		//clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:4:AP1:tt1:submit']/a")); //submit
		clickElement(By.xpath("//*[contains(@id,'pt_r1:4:AP1:tt1:submit')]"));//submit
		////Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_manager_resources_new_person:0:MAnt2:1:pt1:pt_r1:4:AP1:tt1:okWarningDialog")); //warning
		clickElement(By.xpath("//*[contains(@id,'pt_r1:4:AP1:tt1:okWarningDialog')]"));//warning
		////Thread.sleep(5000);
		clickElement(By.xpath("//button[@accesskey='K']"));
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(HiringEmployeesITC.class);
			run();
		}
	}

}
