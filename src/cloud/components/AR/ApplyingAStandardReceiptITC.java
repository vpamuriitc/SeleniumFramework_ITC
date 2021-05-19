package cloud.components.AR;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ApplyingAStandardReceiptITC extends BaseTest{

	public static String ReceiptNumber;
	public static String AppliedAmount;

	private static void run() throws InterruptedException{


		clickElement(By.xpath("//*[contains(@id,'_UISnvr:0:nvcl1')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'nv_itemNode_receivables_receivables_balances::icon')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'_FOTsdi__ReceiptsWorkArea_itemNode__FndTasksList::icon')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'_FOTRaT:0:RAtl5')]"));
		setElementText(By.xpath("//*[contains(@id,'pt1:RMF:0:ap1:q1:value10::content')]"),ReceiptNumber);
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:RMF:0:ap1:q1::search')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'ap1:appTable:_ATp:t1:0:commandLink1')]"));
		Thread.sleep(3000);
		clickElement(By.xpath("//*[contains(@id,'REF:0:ap1:AT1:_ATp:table3:0::di')]"));
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:table3:0:AmtApplied::content')]"));
		Thread.sleep(2000);
		setElementText(By.xpath("//*[contains(@id,'_ATp:table3:0:AmtApplied::content')]"),AppliedAmount);
		clickElement(By.xpath("//*[contains(@id,'RMF:1:pt1:REF:0:ap1:commandButton1')]"));
		clickElement(By.xpath("//*[contains(@id,'RMF:1:pt1:REF:0:ap1:commandButton122')]"));
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:RMF:0:ap1:commandButton1')]"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ApplyingAStandardReceiptITC.class);
			run();
		}
	}

}
