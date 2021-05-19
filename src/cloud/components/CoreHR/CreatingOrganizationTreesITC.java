package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingOrganizationTreesITC extends BaseTest{
	
	public static String SearchTask;
	public static String TreeName;
	public static String TreeCode;
	public static String SearchTreeName;
	public static String TreeName1;
	public static String StartDate;
	public static String Name1;
	public static String Name2;
	
		
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));

        clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
        Thread.sleep(1000);
        clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2::drop"));

        clickElement(By.xpath("//*[text()='Workforce Deployment']"));

        clickElement(By.xpath("//input[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"));

        Thread.sleep(5000);

        //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP1:q1::search"));
        setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"),SearchTask);
        Thread.sleep(4000);
        clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));
        
        clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:AT1:_ATp:t1:2:cl4"));//Click Link
       // clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiworkstructures::icon")); // Task
		Thread.sleep(2000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl15")); // Manage Org tree
		Thread.sleep(2000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon")); // Create icon
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon")); //Create icon
								//pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon
		Thread.sleep(2000);
		
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP1:DefName_Create::content"), TreeName); // Tree Name
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefName_Create::content"), TreeName);
		Thread.sleep(2000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP1:DefCode_Create::content"), TreeCode); // Tree Code
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefCode_Create::content"), TreeCode); 
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP1:tbb1:1:cni2")); // Next
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:tbb1:1:cni2"));// Next 
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:tbb1:1:cni2")); // Next
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:pt1:AP1:tbb1:1:cni2")); // Next
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:3:pt1:AP1:APsb")); // Submit
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:pt1:AP1:APsb_afrdescBy"));// Submit
		
		
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:q2:value10::content"), SearchTreeName); //Tree Name
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:q2:value10::content"), SearchTreeName); //Tree Name
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:q2::search")); // Search
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:q2::search")); // Search
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db")); // Select row
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db"));// Select row
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl")); //Drop down
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl")); //Drop down
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:ATT2:_ATTp:cmp2")); //Create tree version
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:cmp2")); //Create tree version
		Thread.sleep(5000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:4:pt1:AP1:TVName::content"), TreeName1); // Tree Name
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:TVName::content"), TreeName1); // Tree Name
		Thread.sleep(5000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:4:pt1:AP1:inputStartDate::content"), StartDate); // Start date
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:inputStartDate::content"), StartDate); // Start date
		Thread.sleep(5000);
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:4:pt1:AP1:tbb1:1:cni2")); // Next
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:tbb1:1:cni2"));//Next
		Thread.sleep(5000);
		clickElement(By.id("d1::msgDlg::cancel")); //OK
		//clickElement(By.id("_FOd1::msgDlg")); //OK
		Thread.sleep(5000);
		//clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId:0::di"));
		//clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon")); //+ icon
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:hierCol:addBtn::icon"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:hierCol:addBtn::icon")); //+ icon
		Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:cb1"));// Search
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:cb1"));//Search
		//clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:addDiag::ok")); // OK
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Name1);
		Thread.sleep(5000);
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Name1);
							   //pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content
		
		//setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Name1); // Name vision Bistro OH
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1::search")); // Search button
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:qryId1::search")); // Search
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db")); // select row
		clickElement(By.xpath("//*[@id=\"pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db\"]/table/tbody/tr[1]/td[1]"));
		Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1")); // Add tree Node
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));
		Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:hierCol:tt1::db"));// Select row
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:hierCol:tt1::db"));
		Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:hierCol:addBtn::icon")); // + button
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:hierCol:addBtn::icon"));
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:cb1")); // Search
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:cb1"));
		Thread.sleep(5000);
		//setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::contentt"), Name2); // Name vision bistro PA
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Name2); // Name
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:qryId1::search")); // Search button
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:qryId1::search")); // Search button
		Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db")); // Select row
		clickElement(By.xpath("//*[@id=\"pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1\"]/div[2]/table/tbody/tr[1]/td[1]"));
		//*[@id="pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1"]/div[2]/table/tbody/tr[1]/td[1]
		Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1")); // Add tree Node
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));
		
		Thread.sleep(5000);
		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:6:pt1:AP1:APsb2")); // Submit
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:5:pt1:AP1:APsb2"));
		Thread.sleep(5000);
		//clickElement(By.id("_FOd1::msgDlg::cancel")); //OK
		clickElement(By.id("d1::msgDlg::cancel")); //OK
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingOrganizationTreesITC.class);
			run();
		}
	}

}
