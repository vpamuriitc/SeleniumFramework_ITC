package cloud.components.CoreHR;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

@SuppressWarnings("unused")
public class CoreHRE2E01ITC extends BaseTest{
	
	public static String JobName;
	public static String JobCode;
	public static String JobGrade;
	public static String ProfileName;
	
	private static void run() throws InterruptedException{
		
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		Thread.sleep(2000);
		clickElement(By.linkText("Workforce Structures"));////work structures link
		Thread.sleep(2000);
		clickElement(By.linkText("Manage Jobs"));//Manage Jobs link
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:AT1:_ATp:createBtn')]"));//Create Button
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:2:basicDetailsPnl:name::content')]"), JobName);// JobName
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:2:basicDetailsPnl:jobCode::content')]"), JobCode);//Code
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:basicDetailsPnl:tt1:next')]"));//Next
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:jobDetailsPnl:fullPartTime::content')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:jobDetailsPnl:fullPartTime::pop\\']/li[3]')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:jobDetailsPnl:regularTemporary::content')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:jobDetailsPnl:regularTemporary::pop\\']/li[3]')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:jobDetailsPnl:vgApplTbl:_ATp:vgAdd')]"));//Add row
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'vgApplTbl:_ATp:t1:0:nameFld::content')]"), JobGrade);
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:3:jobDetailsPnl:tt1:next')]")); //Next
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:4:evalCriteriaPnl:tt1:next')]")); //Next
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:5:jobProfPnl:r1:0:AT1:_ATp:a_btn')]"));//Add existing Profile
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:description1Id::lovIconId')]"));//Dropdown
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'table1:0:description1Id::dropdownPopup::popupsearch')]"));//Pop Search
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'description1Id::_afrLovInternalQueryId:value10::content')]"), ProfileName);
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:description1Id::_afrLovInternalQueryId::search')]"));// Search
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:description1Id_afrLovInternalTableId::db')]"));//Select row
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:description1Id::lovDialogId::ok')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:5:jobProfPnl:tt1:submit')]"));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:5:jobProfPnl:tt1:okConfirmationDialog')]"));
		
			
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CoreHRE2E01ITC.class);
			run();
		}
	}

}
