package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class TerminatingWorkRelationshipsITC extends BaseTest{

	public static String Search_Name;
	public static String Dates;

	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		Thread.sleep(5000);
		clickElement(By.xpath("//*[@id=\'_FOpt1:nv_itemNode_workforce_management_person_management\']"));// Person Management
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id,'pt1:Perso1:0:SP3:q1:value00::content')]"), Search_Name);//Name
		clickElement(By.xpath("//*[contains(@id,'pt1:Perso1:0:SP3:q1::search')]"));//Search
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'0:SP3:table1:_ATp:table2:0:gl1')]"));//Click the name link
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'0:_FOTsdiHcmIntWaTasksId::icon')]"));
		Thread.sleep(5000);
		clickElement(By.linkText("Manage Work Relationship")); //Manageworkrelationships
		Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'0:pt1:r1:0:pt1:SP1:edit::popEl')]"));//Actions
		clickElement(By.xpath("//td[contains(text(),'Terminate')]")); //Terminate
		Thread.sleep(4000);
		setElementText(By.xpath("//*[contains(@id,'ap1:Termi1:0:TerminationDate::content')]"), Dates);//TerminationDate
		
		clickElement(By.xpath("//*[contains(@id,'0:MAt2:1:r1:0:r1:0:pt1:ap1:tt1:cb1')]"));//Review
		
		clickElement(By.xpath("//*[contains(@id,'MAt2:1:r1:0:r1:1:pt1:sp1:tt1:submit')]"));//submit
		
		clickElement(By.xpath("//*[contains(@id,'sp1:tt1:dc1:selectOneRadio1::content')]"));//Deferred
		
		clickElement(By.xpath("//*[contains(@id,'r1:1:pt1:sp1:tt1:okWarningDialog')]"));//yes
		clickElement(By.xpath("//*[contains(@id,'sp1:tt1:okConfirmationDialog')]")); //ok
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(TerminatingWorkRelationshipsITC.class);
			run();
		}
	}

}




