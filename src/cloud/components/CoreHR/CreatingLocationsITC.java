package cloud.components.CoreHR;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingLocationsITC extends BaseTest{
	
	public static String LocationName;
	public static String LocationCode;
	public static String Country;
	public static String Address1;
	public static String City;
	public static String State;
	public static String PostalCode;
	
	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		Thread.sleep(2000);
		clickElement(By.linkText("Workforce Structures"));////work structures link
		Thread.sleep(2000);
		clickElement(By.linkText("Manage Locations"));// Manage Locations
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'1:locSearchPanel:resultsAppsTable:_ATp:ctb1')]")); //Create icon
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'2:AP1:inputText562::content')]"), LocationName); // Location Name
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'0:MAnt2:2:AP1:it1::content')]"), LocationCode); // Location Code
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:2:AP1:r3:0:countrylov::lovIconId')]")); //Country dropdown
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'AP1:r3:0:countrylov::dropdownPopup::popupsearch')]"));// Pop search
		Thread.sleep(2000);
		setElementText(By.id("//*[contains(@id,'countrylov::_afrLovInternalQueryId:value00::content')]"), Country);//Country
		Thread.sleep(2000);
		clickElement(By.id("//*[contains(@id,'countrylov::_afrLovInternalQueryId::search')]"));// Search
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'countrylov_afrLovInternalTableId::db\\\"]/table/tbody/tr/td[2]/div/table/tbody/tr/td')]"));
		Thread.sleep(2000);
		clickElement(By.id("//*[contains(@id,'MAnt2:2:AP1:r3:0:countrylov::lovDialogId::ok')]"));
		Thread.sleep(2000);
		//clickElement(By.id(""));
		setElementText(By.id("//*[contains(@id,'AP1:r3:0:i1:0:inputText17::content')]"), Address1);
		Thread.sleep(2000);
		setElementText(By.id("//*[contains(@id,'i1:2:inputComboboxListOfValues27::content')]"), City);
		Thread.sleep(2000);
		setElementText(By.id("//*[contains(@id,'i1:4:inputComboboxListOfValues28::content')]"), PostalCode);
		Thread.sleep(2000);
		setElementText(By.id("//*[contains(@id,'r3:0:i1:3:inputComboboxListOfValues25::content')]"), State);	
		Thread.sleep(2000);		
		clickElement(By.id("//*[contains(@id,'0:MAnt2:2:AP1:tt1:submit')]")); // Submit
		Thread.sleep(2000);
		clickElement(By.id("//*[contains(@id,'0:MAnt2:2:AP1:tt1:okWarningDialog')]")); //Yes
		Thread.sleep(2000);
		clickElement(By.id("//*[contains(@id,'0:MAnt2:2:AP1:tt1:okConfirmationDialog')]")); //OK
		Thread.sleep(2000);
				
		}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingLocationsITC.class);
			run();
		}
	}

}
