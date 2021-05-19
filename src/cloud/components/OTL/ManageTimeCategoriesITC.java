package cloud.components.OTL;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class ManageTimeCategoriesITC extends BaseTest{

	public static String Search;
	public static String Name;
	public static String TimeAttribute;
	public static String TimeAttribute2;
	
	
	private static void run() throws InterruptedException {
		
		clickElement(By.xpath("//*[contains(@id, 'UIScmil2u::icon')]"));
		
		clickElement(By.linkText("Setup and Maintenance"));
		
		clickElement(By.id("pt1:r1:0:r0:0:r1:0:sdi10::icon")); //Tasks
		
		clickElement(By.linkText("Search"));   
		
		setElementText(By.xpath("//*[contains(@id, 'it1::content')]"), Search);  //search
		
		clickElement(By.xpath("//*[contains(@id, 'AP1:s9:ctb1')]")); //searchbutton
		
		clickElement(By.linkText("Define Time and Labor"));
		
		clickElement(By.linkText("Manage Time Categories")); 
		
		clickElement(By.xpath("//*[contains(@id, '_ATp:create::icon')]"));
		
		setElementText(By.xpath("//*[contains(@id, 'AP1:it2::content')]"), Name);
		
		clickElement(By.xpath("//*[contains(@id, 'uomSoc1::content')]"));  //Unitofmeasure
		
		clickElement(By.xpath("//li[contains(text(),'Hours')]"));
		
		clickElement(By.xpath("//*[contains(@id, 'ATT2:_ATp:create::icon')]"));  //Add
		
		setElementText(By.xpath("//*[contains(@id, '0:TimeAtrbFldNameTrans::content')]"), TimeAttribute); //Time Attribute
		
		//clickElement(By.xpath("//li[contains(text(),'Billable')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'ATTt2:0:soc3::content')]"));  //ValueType
		
		clickElement(By.xpath("//li[contains(text(),'Null value')]"));
		
		clickElement(By.xpath("//*[contains(@id, 'ATTt2:0:soc2::content')]"));  //Operator
		
		clickElement(By.xpath("//li[contains(text(),'AND')]")); 
		
		clickElement(By.xpath("//*[contains(@id, 'ATT2:_ATp:create::icon')]"));  //Add   
		
		clickElement(By.xpath("//tr[@class='xep p_AFSelected']//td[@class='x12z']"));  //secondRow
		
		setElementText(By.xpath("//*[contains(@id, '1:TimeAtrbFldNameTrans::content')]"), TimeAttribute2); //TimeAttribute
		
		//clickElement(By.xpath("//li[contains(text(),'Activity Type')]")); 
		
		clickElement(By.xpath("//*[contains(@id, '1:soc3::content')]"));  //ValueType
		
		clickElement(By.xpath("//li[contains(text(),'Null value')]"));
		
		clickElement(By.xpath("//*[contains(@id, 'ATTt2:1:soc2::content')]"));  //Operator
		
		clickElement(By.xpath("//li[contains(text(),'AND')]")); 
		
		clickElement(By.xpath("//span[contains(text(),'ave and Close')]"));
		
		clickElement(By.xpath("//button[@accesskey='K']"));
		
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ManageTimeCategoriesITC.class);
		run();
	}
}

}
