package cloud.components.AR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingACustomerITC extends BaseTest{
	
	public static String Name;
	public static String CustomerName;
	public static String AccountName;
	public static String Address_SetName;
	public static String SITE;
	public static String Address;
	public static String PostalCode;


	private static void run() throws InterruptedException{
		
		
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		
	 	clickElement(By.xpath("//*[contains(@id,'_UISnvr:0:nvcl1')]"));
	 	clickElement(By.xpath("//*[contains(@id,'0:nv_itemNode_receivables_billing::icon')]"));//Bills Icon
	 	clickElement(By.xpath("//*[contains(@id,'nv_itemNode_receivables_billing')]"));
		
	 	clickElement(By.xpath("//*[contains(@id,'_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon')]"));
		
	 	clickElement(By.xpath("//*[contains(@id,'0:_FONSr2:0:_FOTRaT:0:RAtl9')]"));
		
	 	setElementText(By.xpath("//*[contains(@id,'cupanel1:pt_r1:0:inputText123::content')]"),CustomerName);
		
	 	setElementText(By.xpath("//*[contains(@id,'cupanel1:pt_r2:0:inputText1::content')]"),AccountName);
		
	 	clickElement(By.xpath("//*[contains(@id,'cupanel1:pt_r3:0:setIdLovId::lovIconId')]"));
		
	 	clickElement(By.xpath("//*[contains(@id,'0:setIdLovId::dropdownPopup::popupsearch')]"));
	
	 	setElementText(By.xpath("//*[contains(@id,'0:setIdLovId::_afrLovInternalQueryId:value00::content')]"),Address_SetName);
		
		clickElement(By.xpath("//*[contains(@id,'0:setIdLovId::_afrLovInternalQueryId::search')]"));
				
		clickElement(By.xpath("//tr[@class='xep']//td//div//table//tbody//tr//span[@class='x2r9'][contains(text(),'AP_DEPT_SET')] "));
		Thread.sleep(2000);
		clickElement(By.xpath("//*[contains(@id,'0:setIdLovId::lovDialogId::ok')]"));
		
		setElementText(By.xpath("//*[contains(@id,'0:dynam1:0:inputText13::content')]"),SITE);
		
		setElementText(By.xpath("//*[contains(@id,'0:dynam1:0:s2:i1:4:inputText2::content')]"),Address);
		
		setElementText(By.xpath("//*[contains(@id,'0:s2:i1:2:inputComboboxListOfValues4::content')]"),PostalCode);
		
		clickElement(By.xpath("//*[contains(@id,'cupanel1:pt_r3:0:AT1:_ATp:create::icon')]"));
		setElementText(By.xpath("//*[contains(@id,'AT1:_ATp:table1:0:SiteUseCode::content')]"),"Bill to");
		clickElement(By.xpath("//*[text()='Bill to']"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:cupanel1:cucommandButton2')]"));
		
		

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingACustomerITC.class);
			run();
		}
	}

}
