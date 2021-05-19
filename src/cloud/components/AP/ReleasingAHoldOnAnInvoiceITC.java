package cloud.components.AP;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ReleasingAHoldOnAnInvoiceITC extends BaseTest{
	
	public static String Invoice_Number;
	public static String Number;
	
	private static void run(){
		
		
		
		
		clickElement(By.xpath("//*[contains(@id,'_UISmmLink::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_payables_payables_invoices')]"));
		clickElement(By.xpath("//*[contains(@id,'0:_FOTsdiitemNode_InvoiceWorkbench_FndTasksList::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_payables_payables_invoices:0:_FOTRaT:0:RAtl4')]"));
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:q1:value10::content')]"));
		setElementText(By.xpath("//*[contains(@id,'1:pm1:r1:0:ap1:q1:value10::content')]"),Invoice_Number);
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:q1::search')]"));
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:0:ap1:at1:_ATp:ta1:0:cl1')]"));
		clickElement(By.cssSelector("div.xi4"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:0:ap1:r7:1:cm1']/td[2]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:at2:_ATp:ctb2']/a/span"));
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:1:ap1:at2:_ATp:create::icon')]"));
		clickElement(By.xpath("//*[contains(@id,'1:pm1:r1:1:ap1:at2:_ATp:ta2:1:i26::content')]"));  
		setElementText(By.xpath("//*[contains(@id,'1:ap1:at2:_ATp:ta2:1:i26::content')]"),Number);
		clickElement(By.linkText("Invoice Actions"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:cm4']/td[2]"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:r6:1:at1:_ATp:_vw']/div/table/tbody/tr/td[3]/div"));
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:r6:1:at1:_ATp:_vw']/div/table/tbody/tr/td[3]/div"));	
		clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pm1:r1:1:ap1:cb9')]"));  
		
		clickElement(By.linkText("Invoice Actions"));
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:pm1:r1:1:ap1:cm1']/td[2]"));
		clickElement(By.cssSelector("span.xpc"));
	    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ReleasingAHoldOnAnInvoiceITC.class);
			run();
		}
	}

}
