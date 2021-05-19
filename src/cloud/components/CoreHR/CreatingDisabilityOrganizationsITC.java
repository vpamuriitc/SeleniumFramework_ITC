package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDisabilityOrganizationsITC extends BaseTest{

	public static String OrganisationName;
	
	private static void run() throws InterruptedException{

		clickElement(By.id("pt1:_UISmmLink::icon"));// Navigator
		//Thread.sleep(2000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));// workforce structures
		//Thread.sleep(2000);
		clickElement(By.linkText("Manage Disability Organizations"));// Manage Disability Organizations link
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:AP1:AT2:_ATp:commandToolbarButton12')]")); //Create button
		//Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:2:AP1:inputText1::content')]"), OrganisationName); //  Name
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP1:tt1:next')]")); //Next
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:ap1:tt1:submit')]")); //Submit
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:ap1:tt1:okWarningDialog')]")); //Yes
		//Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:ap1:tt1:okConfirmationDialog')]"));//OK
		
			}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDisabilityOrganizationsITC.class);
			run();
		}
	}

}
