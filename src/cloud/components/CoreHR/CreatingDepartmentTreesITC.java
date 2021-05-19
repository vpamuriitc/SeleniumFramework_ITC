package cloud.components.CoreHR;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDepartmentTreesITC extends BaseTest{

	public static String Tree_Name;
	public static String Tree_Code;
	public static String Name;
	public static String Description;
	public static String Tree_Name_1;
	public static String Tree_Name_2;
	public static String Tree_Name_3;
	public static String Start_Date;
	

	private static void run() throws InterruptedException
	
	/*{
		
		
		clickElement(By.id("pt1:_UISmmLink"));
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		clickElement(By.id("pt1:_UISnvr:0:nvcl1"));// Show more
		//pt1:_UISnvr:0:nvcl1
		//clickElement(By.id("_FOpt1:_UISnvr:0:nv_itemNode_workforce_management_workforce_structures"));// work structure
		clickElement(By.id("pt1:_UISnvr:0:nv_itemNode_workforce_management_workforce_structures"));// work structure
				
		//Thread.sleep(15000);
		
		//clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiworkstructures::ti"));
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdiworkstructures::ti")); //Task
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl11")); // Manage Department Tress
		clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon")); // Create tree
		                    
							
		 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:1:pt1:AP1:DefName_Create::content"), Tree_Name); // Name
		 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:1:pt1:AP1:DefCode_Create::content"), Tree_Code);// Code
		 					   //_FOpt1:_FOr1:0:_FONSr2:0:MAt6:1:pt1:AP1:DefCode_Create::content
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:1:pt1:AP1:tbb1:1:cni2")); //Next
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:2:pt1:AP1:tbb1:1:cni2")); //Next
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:3:pt1:AP1:APsb")); // Submit
		 Thread.sleep(5000);
		 //clickElement(By.cssSelector("a.xmi"));
		 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:q2:value10::content"), Tree_Name);//Tree Name
		 Thread.sleep(5000);
		 					 //_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:q2:value10::content
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:q2::search"));
		 Thread.sleep(5000);
		 
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db"));
				 Thread.sleep(1000);
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popArea"));  // Down arrow
		
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:ATT2:_ATTp:cmp2")); // Create tree Version
		 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:4:pt1:AP1:TVName::content"), Tree_Name_1); // Name
		 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:4:pt1:AP1:inputStartDate::content"), Start_Date);// Effective Start date
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));
		 					   //_FOpt1:_FOr1:0:_FONSr2:0:MAt6:4:pt1:AP1:inputStartDate::content
		 clickElement(By.id("_FOd1::msgDlg::cancel"));// OK button
		 //_FOd1::msgDlg::cancel
		// clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn::icon")); // Plus button
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn")); // Plus button
		 
		 //clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:2:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content")); // Search button
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:cb1")); //Search Button
		 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Department_1);
		 					   			//_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1::search"));
		 				//id="_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1::search"
		 Thread.sleep(5000);
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db")); // Row Header
		 					 //_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db
		 Thread.sleep(5000);
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1")); // Add Tree Node
		 Thread.sleep(5000);
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:hierCol:tt1::db"));// Select row
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn")); // Plus button
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:cb1")); // Search button
		 setElementText(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Department_2);// Name
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1::search"));// Search button
		 Thread.sleep(5000);
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db"));// Select Row
		 Thread.sleep(5000);
		  clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1")); // ADD tree Node
		 //clickElement(By.id("//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:hierCol:tt1:0::di\"]"));// > Expand button
		 clickElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:APsb2")); // Submit button
		 
		 
		 
//			_FOpt1:_FOr1:0:_FONSr2:0:MAt7:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon
		 //_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn::icon //Add button
		 					 //_FOpt1:_FOr1:0:_FONSr2:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1
		// _FOpt1:_FOr1:0:_FONSr2:0:MAt6:2:pt1:AP1:AH1:addView:r1:0:qryId1::search
		 					   
		 //FOpt1:_FOr1:0:_FONSr2:0:MAt6:2:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content
		 //_FOpt1:_FOr1:0:_FONSr2:0:MAt6:2:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content
		//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:MAt6:0:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db"]/table/tbody/tr[3]/td[1]
	    
	   // clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
	  
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
	 
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl11"));
	  
	   // clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon"));

	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefName_Create::content"));
	    
	    //setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefName_Create::content"), Tree_Name);
	
	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefCode_Create::content"));
	   // setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefCode_Create::content"), Tree_Code);
	   
//	    //clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:tbb1:1:cni2"));
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:pt1:AP1:tbb1:1:cni2"));
//	
//	    clickElement(By.cssSelector("span.xt4"));
//	
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2:value10::content"));
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2:value10::content"), Tree_Name);
//
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2::search"));
//	    
//	    Thread.sleep(8000);
//	  
//	    clickElement(By.cssSelector("td.xz4"));
//	    
//	    Thread.sleep(8000);
//	 
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl"));
//
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:cmp2']/td[2]"));
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"));
//	 
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"), Tree_Name_1);
//	    
//	
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"), Start_Date);
//	   
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));
//
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:APsb2"));
//	 
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl"));
//	    
//	    Thread.sleep(3000);
//
//	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:cmp2']/td[2]"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"));
//	    
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"), Tree_Name_2);
//
//	   
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"));
//	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"), Start_Date);
//	 
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));
//	   
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn::icon"));
//	 
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:nodeTypeRadio:_1"));
//	  
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:addDiag::ok"));
//	 
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:APsb2"));
//	  
//	    clickElement(By.id("_FOd1::msgDlg::cancel"));


	}*/
	
	{
		clickElement(By.id("pt1:_UISmmLink::icon']")); //Navigator
		
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures']")); //workforcestructure
		
		clickElement(By.linkText("Manage Department Trees")); //ManageDepartmentTrees
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon']")); //CreateTreeMenu
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefName_Create::content']"), Tree_Name); //Name
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:DefCode_Create::content']"), Tree_Code); //code
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:2:pt1:AP1:tbb1:1:cni2']"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:3:pt1:AP1:tbb1:1:cni2']"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:pt1:AP1:APsb']"));  //Submit
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId:2:i1']") ); //Select tree for which you want to create version
		
		clickElement(By.id("//a[contains(text(),'Actions')]")); //Actions
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:pt1:AP1:ATT2:_ATTp:commandMenuItem3']//td[@class='xnw'][contains(text(),'Create Tree Version')]")); //CreateTreeVersion
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:TVName::content']"), Name);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:TVDesc::content']"), Description); //Description
		
		setElementText(By.id("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:inputStartDate::content']"), Start_Date); //EffectiveStartDate
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:4:pt1:AP1:tbb1:1:cni2']")); //next
		
		clickElement(By.id("//button[@id='_FOd1::msgDlg::cancel']")); //ok
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:hierCol:addBtn::icon']")); //add
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:cb1']")); //Search
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content']"), Tree_Name_1); //SearchName1
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1::search']")); //SearchButton
		
		clickElement(By.id("//span[contains(text(),'IT CONVERGENCE BRBR OPERATING UNIT')]")); // clicktheTree
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1']")); //AddTreeNode
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:hierCol:addBtn::icon']")); //add
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:cb1']")); //Search
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content']"), Tree_Name_2); //SearchName2
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1::search']")); //SearchButton
		
		clickElement(By.id("//span[contains(text(),'IT CONVERGENCE BRBR OPERATING UNIT')]")); // clicktheTree
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1']")); //AddTreeNode
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:hierCol:addBtn::icon']")); //add
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:cb1']")); //Search
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content']"), Tree_Name_3); //SearchName3
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:qryId1::search']")); //SearchButton
		
		clickElement(By.id("//span[contains(text(),'IT CONVERGENCE BRBR OPERATING UNIT')]")); // clicktheTree
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1']")); //AddTreeNode
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:5:pt1:AP1:APsb2']")); //submit
		
		clickElement(By.id("_FOd1::msgDlg::cancel']")); //ok
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDepartmentTreesITC.class);
			run();
		}
	}

}




