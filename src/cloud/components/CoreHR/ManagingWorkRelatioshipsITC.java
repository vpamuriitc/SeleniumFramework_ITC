package cloud.components.CoreHR;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ManagingWorkRelatioshipsITC extends BaseTest{
	
	public static String PersonName;
	public static String SeniorityDate;
	
	
	private static void run() throws InterruptedException
	
	{
		
		setElementText(By.xpath("//*[contains(@id,'Perso1:0:SP3:q1:value00::content')]"), PersonName);//Name
		//Thread.sleep(4000);
		clickElement(By.xpath("//*[contains(@id,'Perso1:0:SP3:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'Perso1:0:SP3:table1:_ATp:table2:0:cil1')]"));// Actions
	    clickElement(By.xpath("//*[contains(@id,'table1:am2:dc_i1:3:dcm1')]"));//PersonalandEmployement
	   	clickElement(By.xpath("//*[contains(@id,'table1:am2:dc_i1:3:dci1:13:dccmi1')]"));//Manageworkrelationship
	   	clickElement(By.xpath("//*[contains(@id,'pt1:SP1:edit::popEl')]"));//actions
	    clickElement(By.xpath("//*[contains(@id,'r1:0:pt1:SP1:edtBtn')]"));//edit
	    setElementText(By.xpath("//*[contains(@id,'0:pt1:SP1:r2:0:id3::content')]"), SeniorityDate);//SenirityDate
	 	clickElement(By.xpath("//*[contains(@id,'tt1:submit')]"));//submit
	  	clickElement(By.xpath("//*[contains(@id,'tt1:okWarningDialog')]")); //yes
	   	clickElement(By.xpath("//*[contains(@id,'tt1:okConfirmationDialog')]"));//ok
	   
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingWorkRelatioshipsITC.class);
			run();
		}
	}

}
