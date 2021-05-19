package AppiumTest.AppiumTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thoughtworks.selenium.webdriven.commands.Click;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.android.nativekey.PressesKey;
//import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumE2E001{
	private static final AppiumE2E001 ExcelDriven = null;
	Dimension size;
	String destDir;
	DateFormat dateFormat;
	
	AppiumDriver<MobileElement> driver;
	public void setUp() throws MalformedURLException, InterruptedException
	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");
		cap.setCapability("device", "Android");
		cap.setCapability("deviceName", "Nexus5");   //emulator-5554  Nexus5
		cap.setCapability("platformVersion", "8.0");
		cap.setCapability("platformName", "Android");

		//	cap.setCapability("appPackage","com.android.chrome");// .vending
		cap.setCapability("appActivity","com.google.android.apps.chrome.Main");


		//System.setProperty("webdriver.chrome.driver","C:\\Users\\kpandey\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver","Lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","Lib/TestData.xlsx");

		//	System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe"); //C:/Users/kpandey/node_modules/appium/node_modules/appium-chromedriver/chromedriver/win/chromedriver.exe
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Thread.sleep(2000);
		String baseurl = "https://preproduction.whitecap.com"; // https://beta.whitecap.com/
		driver.get(baseurl);

		//get current context
		System.out.println(driver.getContext());

		//// wait for screen to load the location popup
		Thread.sleep(5000);

		/// get all the available context
		Set<String> contextNames = driver.getContextHandles();
		System.out.println(contextNames);

		/// Switch context to Native
		driver.context("NATIVE_APP");
		System.out.println(driver.getContext());
		Thread.sleep(5000);

	
		// switch context to Web
		//	Thread.sleep(10000);
		//driver.context("CHROMIUM");
		//System.out.println(driver.getContext());

		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("Hammers");

		Thread.sleep(5000);
		driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button']")).click();  //click on search btn
		//driver.findElement(MobileBy.AccessibilityId("Submit")).click();
		takeScreenShot();
		Thread.sleep(5000);
		//			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='SKU#: 149STLHDLS']")).click();  //click back
		//	Thread.sleep(10000); 
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
		Thread.sleep(10);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
		Thread.sleep(10000); 
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Clear all']")).click();   //minimizing category
		Thread.sleep(10000);
		driver.findElement(MobileBy.className("android.widget.EditText")).click();   //minimizing Brand
		Thread.sleep(10000);               
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@content-desc='Under $25 (56)']")).click(); 
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//*[@content-desc='Under $25 (56)']")).click();
		Thread.sleep(10000);
		takeScreenShot();

		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Clear all']")).click();  //minimizing category

		driver.findElement(MobileBy.className("android.widget.EditText")).click();   //minimizing Brand
		Thread.sleep(10000); 
		//			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Stiletto Straight Replacement Hammer Handle for 14 oz or 21 oz Hammers']")).click();
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='GO']")).click();
	
		Thread.sleep(10000);	

		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Done']")).click();
		Thread.sleep(5000); 
		//driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click close btn
		//Thread.sleep(5000); 
		driver.findElement(MobileBy.xpath("//*[@content-desc='Hero Image']")).click(); //click on hammer image
			Thread.sleep(10000); 
		
		//	driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click close btn
		Thread.sleep(10000);
		new TouchAction(driver).press(115, 1600).waitAction(ofSeconds(10000)).moveTo(115, 800).release().perform();
		//	new TouchAction(driver).press(115, 650).waitAction(ofSeconds(10000)).moveTo
		
//		Thread.sleep(10000); 
//		MobileElement element = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.EditText[@content-desc='1']"));
//		element.clear();
		Thread.sleep(2000); 

		//driver.findElement(By.xpath("//android.view.View[@content-desc='Stiletto']")).click();
	//	Thread.sleep(5000);
		//	driver.findElement(MobileBy.xpath("//android.widget.EditText[@content-desc='1']")).sendKeys("3");
	//	Thread.sleep(5000); 
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='+']")).click();
		Thread.sleep(5000); 
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='+']")).click();
		Thread.sleep(5000); 
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='-']")).click();

		Thread.sleep(5000); 
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='ADD TO CART']")).click();
		Thread.sleep(10000);
		//		new TouchAction(driver).press(0, 546).waitAction(ofSeconds(10000)).moveTo(0, 877).release().perform();//0,546][1080,677
		Thread.sleep(10000); 
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' 0']")).click();// minicart
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='VIEW CART']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Location ']")).click();  //Zip code
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//*[@content-desc='Submit ']")).sendKeys("32805");
		//	Thread.sleep(10000);
		//	driver.findElement(MobileBy.name("Five digit zip code")).sendKeys("32805");
		Thread.sleep(10);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Submit ']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Update']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='CHECKOUT']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[3]/android.view.View[2]/android.widget.EditText")).sendKeys("test123@gmail.com");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='CONTINUE AS GUEST']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[4]/android.widget.EditText")).sendKeys("FIRST");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[5]/android.widget.EditText")).sendKeys("LAST");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[6]/android.widget.EditText")).sendKeys("First Street");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[8]/android.widget.EditText")).sendKeys("Atlanta");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Spinner[@content-desc='Please Select...']")).sendKeys("Georgia");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[10]/android.widget.EditText")).sendKeys("30301");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[11]/android.widget.EditText")).sendKeys("1234567890");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[11]/android.widget.EditText")).sendKeys("Test");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[16]/android.view.View[3]/android.view.View[1]/android.widget.EditText")).sendKeys("123");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[16]/android.view.View[3]/android.view.View[2]/android.widget.EditText")).sendKeys("345");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[16]/android.view.View[3]/android.view.View[3]/android.widget.EditText")).sendKeys("5678");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[10]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).click();	//Credit card number
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[10]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("6011000000000004");	//Credit card number
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[12]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).click();	
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[12]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("12/22");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[16]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")).click();	
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[16]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("123");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[14]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[14]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("Test");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();	
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='PLACE ORDER']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='OK']")).click();
		Thread.sleep(10000);
		driver.get("https://preproduction-cm.whitecap.com");
		Thread.sleep(10000);
		                                   

		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[1]")).sendKeys("KKeComm19@gmail.com");
		Thread.sleep(10000);
		driver.hideKeyboard();
		Thread.sleep(10000);
		driver.findElement(MobileBy.id("password")).click();
		Thread.sleep(10000);
		
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[2]")).sendKeys("HDSupply19");
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Sign in']")).click();
		Thread.sleep(10000);
		
		
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Order Management']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Today']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='PO69243255']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Details']")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Payments']")).click();
		
		
		
		Thread.sleep(60000);



	}

//	public static String getCellData(int rownum,int col, String fileName)
//	
//	
//	
//	{
//	     try {
//	    	 
//	    	 
//	    	 
//	         FileInputStream fis = new FileInputStream("/path/to/file/"+fileName+".xlsx");
//	         XSSFWorkbook wb = new XSSFWorkbook(fis);
//	         XSSFSheet sheet = wb.getSheet("Sheet1");
//	         XSSFRow row = sheet.getRow(rownum);
//	         XSSFCell cell = row.getCell(col);
//	    //   System.out.println(cell.getStringCellValue());
//	         if (cell==null){
//	             return "";
//	         }
//	         return cell.getStringCellValue();
//
//	    } 
//	     catch (Exception e)
//	     {
//	        System.out.println("In the Catch Block:"+e);
//	         return "Exception Occured";
//	    }
//
//	
//	     int i;
//		while (!ExcelDriven.getCellData(0,i,"fileName").equals(""))
//	     {
//
//	         SomeClass.SomeMethod(ExcelDriven.getCellData(0,i,"fileName"));
//	         i++;
//	     }
//	} 
	
	

	public void takeScreenShot() {
		
		destDir = "screenshots";
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		
		new File(destDir).mkdirs();
		
		String destFile = dateFormat.format(new Date()) + ".png";

		try {
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/AppiumTest/screenshots/img" + destFile));
															
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	private int ofSeconds(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void tearDown() {
		driver.quit();
	}


	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		AppiumE2E001 obj = new AppiumE2E001();
		//obj.closeLocationDialog();
		
		obj.setUp();
		obj.takeScreenShot();
		obj.tearDown();
	}
}
