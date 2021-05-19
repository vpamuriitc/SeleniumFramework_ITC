package cloud.tests.CoreHR;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cloud.components.CoreHR.AddingAssignmentsITC;
import cloud.components.CoreHR.HiringEmployeesITC;
import cloud.components.CoreHR.TerminatingWorkRelationshipsITC;
import cloud.components.common.Login;
import cloud.components.common.Navigate;
import itc.framework.*;

public class CoreHRE2E01ITC_Test extends BaseTest {
	
	@BeforeTest
	public void start(){
		startUp("chrome", this.getClass().getSimpleName()); 
	}

	@Test
	@Parameters({ "dataFile" ,"sheet","scenario"})
	public void executeTest(String dataFile1,String sheet1,String scenario1) throws Exception{
		testDataFile = dataFile1;
		scenario = scenario1;
		testsheet = sheet1;
		Login.run(1);
		Navigate.run(1);
		HiringEmployeesITC.run(1);
		AddingAssignmentsITC.run(1);
		//Navigate.run(1);
		TerminatingWorkRelationshipsITC.run(1);
		
	}
	@AfterTest
	public void end(){
		close();
	}

}
