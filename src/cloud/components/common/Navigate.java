package cloud.components.common;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class Navigate extends BaseTest{
	public static String appl;

	private static void run() throws Exception
	{		
		clickElement(By.xpath("//a[@title='Navigator']"));
		//clickElement(By.linkText(appl));

		clickElement(By.linkText(appl));

	}
	public static void run(int iterations) throws Exception
	{	
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(Navigate.class);
			run();
		}

	}
}
