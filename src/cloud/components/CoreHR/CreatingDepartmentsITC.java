package cloud.components.CoreHR;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingDepartmentsITC extends BaseTest{
	
	public static String Name;
	public static String Location;
	public static String ReportingName;
	public static String Manager;
	public static String WorkStartTime;
	public static String WorkEndTime;
	public static String WorkingHours;
	public static String Frequency;
	
	
	private static void run() throws InterruptedException{
		clickElement(By.id("pt1:_UISmmLink::icon"));
		//Thread.sleep(1000);
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
		//Thread.sleep(1000);
		clickElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:4:ll02Pce:ll01Lv:1:ll01Pse:ll01Cl']"));
		//Thread.sleep(1000);
		clickElement(By.xpath("//*[(text()='Create')]"));
		//Thread.sleep(1000);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:inputText1::content']"),Name);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:locationCode1Id::content']"),Location);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:AP1:tt1:next"));
		
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content']"),ReportingName);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content']"),Manager);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_WORK_START_TIME::content']"),WorkStartTime);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_WORK_END_TIME::content']"),WorkEndTime);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_STD_WORKING_HOURS::content']"),WorkingHours);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_STD_WORKING_HOURS_FREQUENCY_Display::content']"),Frequency);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:AP2:tt1:next"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:ap1:tt1:submit"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:ap1:tt1:okWarningDialog"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:ap1:tt1:okConfirmationDialog"));
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDepartmentsITC.class);
			run();
		}
	}

}
