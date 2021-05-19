package cloud.components.AP;

import org.openqa.selenium.By;
import itc.framework.BaseTest;


public class ReissuingAPaymentITC extends BaseTest{
	//public static String Payment_Date;
	public static String Payment_Number;
	
	private static void run() throws Exception{
		
		
		
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
	 	clickElement(By.xpath("//*[contains(@id,'_UISnvr:0:nvcl1')]"));
	 	clickElement(By.xpath("//*[contains(@id,'nv_itemNode_payables_payables_payments::icon')]"));
	 	clickElement(By.xpath("//*[contains(@id,'_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon')]"));
	 	clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:_FOTRaT:0:RAtl5')]"));
	 	setElementText(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:q1:value20::content')]"),Payment_Number);
	 	clickElement(By.xpath("//*[contains(@id,'_FONSr2:0:MAnt2:1:AP1:q1::search')]"));
	 	clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:AP1:AT1:_ATp:t1:0:commandLink1')]"));
	 	clickElement(By.linkText("Actions"));
	 	clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:menu1\"]/div/table/tbody/tr/td[2]"));
	 	Thread.sleep(2000);
	 	clickElement(By.xpath("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:ap1:dialog5::ok\"]"));
	
		
	}
	    
	
		public static void run(int iterations) throws Exception{
			initComponent();
			for(int i=0;i<iterations;i++)
			{
				iteration=i;
				popluateParams(ReissuingAPaymentITC.class);
				run();
			}
		}

	}
