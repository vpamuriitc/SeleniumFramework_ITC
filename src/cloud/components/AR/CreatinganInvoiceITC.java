package cloud.components.AR;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatinganInvoiceITC extends BaseTest{

	public static String Transaction_Source;
	public static String Customer_Name;
	public static String Remit_Address;
	public static String Line_Item;
	public static String Quantity;
	public static String Price;

	private static void run() throws InterruptedException{
		
		clickElement(By.xpath("//*[contains(@id,'_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon')]"));
		
		clickElement(By.xpath("//*[contains(@id,'_FOSritemNode_receivables_billing:0:_FOTRaT:0:RAtl1')]"));
	   
		setElementText(By.xpath("//*[contains(@id,'1:pt1:TCF:0:ap1:batchSourceId::content')]"),Transaction_Source);
		clickElement(By.xpath("//*[contains(@id,'TCF:0:ap1:billToNameId::lovIconId')]"));
		setElementText(By.xpath("//*[contains(@id,'_afrLovInternalQueryId:value00::content')]"),Customer_Name);
	   
		clickElement(By.xpath("//*[contains(@id,'billToNameId::_afrLovInternalQueryId::search')]"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]"));
	    clickElement(By.xpath("//*[contains(@id,'TCF:0:ap1:billToNameId::lovDialogId::ok')]"));
	   
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:TCF:0:ap1:showMore')]"));
	    
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:TCF:0:ap1:SDPayment::disAcr')]"));
	    setElementText(By.xpath("//*[contains(@id,'TCF:0:ap1:remitToAddress1Id::content')]"),Remit_Address);
	   
	    clickElement(By.xpath("//*[contains(@id,'0:MAnt2:1:pt1:TCF:0:ap1:showLess')]"));
	    clickElement(By.xpath("//*[contains(@id,'_ATp:table1:0:ip1:searchIcoId::icon')]"));
	    setElementText(By.xpath("//*[contains(@id,'table1:0:ip1:Popup1:0:Advan1:0:efqrp:value00::content')]"),Line_Item);
	    clickElement(By.xpath("//*[contains(@id,'0:ip1:Popup1:0:Advan1:0:efqrp::search')]"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:ip1:Popup1:0:Advan1:0:rstab:_ATp:table1::db']/table/tbody/tr/td[3]"));
	    clickElement(By.xpath("//*[contains(@id,'TCF:0:ap1:AT1:_ATp:table1:0:ip1:cb1')]"));
	    
	    setElementText(By.xpath("//*[contains(@id,'ap1:AT1:_ATp:table1:0:quantity::content')]"),Quantity);
	       
	    setElementText(By.xpath("//*[contains(@id,'AT1:_ATp:table1:0:sellingPrice::content')]"),Price);
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:newTrx']/table/tbody/tr/td/a/span"));
	    clickElement(By.xpath("//*[contains(@id,'_FOd1::msgDlg::cancel')]"));
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:commandToolbarButton2']/a/span"));
	    clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pt1:TCF:0:ap1:dialogCancel::yes')]"));
	    

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatinganInvoiceITC.class);
			run();
		}
	}

}
