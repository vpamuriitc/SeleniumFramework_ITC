package AppiumTest.AppiumTest;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	//AndroidDriver driver;
	Dimension size;
	String destDir;
	DateFormat dateFormat;

	AppiumDriver<MobileElement> driver;
	public void setUp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");
		cap.setCapability("device", "Android");
		cap.setCapability("deviceName", "Nexus5");   //emulator-5554
		cap.setCapability("platformVersion", "8.0");
		cap.setCapability("platformName", "Android");
//		capabilities.setCapability("deviceName", "ZX1B32FFXF");
//		capabilities.setCapability("browserName", "Android");
//		capabilities.setCapability("platformVersion", "4.4.2");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("appPackage", "io.appium.android.apis");
//		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	//	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//Thread.sleep(2000);
		cap.setCapability("appActivity","com.google.android.apps.chrome.Main");


		System.setProperty("webdriver.chrome.driver","Lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","Lib/TestData.xlsx");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Thread.sleep(2000);
		String baseurl = "https://preproduction.whitecap.com"; // https://beta.whitecap.com/
		driver.get(baseurl);

		System.out.println(driver.getContext());

		
		Thread.sleep(5000);

		
		Set<String> contextNames = driver.getContextHandles();
		System.out.println(contextNames);

		
		driver.context("NATIVE_APP");
		System.out.println(driver.getContext());
		Thread.sleep(5000);
		driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("Hammers");

//class name - android.widget.EditText  ,  text- Search by name, brand, product id…
			Thread.sleep(5000);
			driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button']")).click();  //click on search btn
			Thread.sleep(5000);
			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
			Thread.sleep(10);
			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
			
			
//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			 FileUtils.copyFile(scrFile, new File("\\AppiumTest\\Results\\img.png"));
			 
			 
			takeScreenShot();
	//		Thread.sleep(10000);
		// Scroll till element which contains "Views" text If It Is not visible on screen.
	//	driver.scrollTo("Views");
		// Click on Views.
	//	driver.findElement(By.name("Views")).click();
		// Scroll till element which contains "Tabs" text If It Is not visible on screen.
	//	driver.scrollTo("Tabs");
		//Call takeScreenShot() function to capture screenshot of android screen.
	//	getscreenshot();

	}
	
	
//	public void captureScreenShots() throws IOException {
//        folder_name="screenshot";
//        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        //Date format fot screenshot file name
//        df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
//        //create dir with given folder name
//        new File(folder_name).mkdir();
//        //Setting file name
//        String file_name=df.format(new Date())+".png";
//        //coppy screenshot file into screenshot folder.
//        FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
//    }
//	

//	public void getscreenshot() throws Exception 
//    {
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         //The below method will save the screen shot in d drive with name "screenshot.png"
//            FileUtils.copyFile(scrFile, new File("\\AppiumTest\\Results\\img.png"));
//    }
//	
	
	
	public void takeScreenShot() {
		// Set folder name to store screenshots.
		destDir = "screenshots";
		// Capture screenshot.
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Set date format to set It as screenshot file name.
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// Create folder under project with name "screenshots" provided to destDir.
		new File(destDir).mkdirs();
		// Set file name using current date time.
		String destFile = dateFormat.format(new Date()) + ".png";

		try {
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/AppiumTest/screenshots/img" + destFile));
															
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

public void tearDown() {
	driver.quit();
}


public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	
	 CaptureScreenShot obj= new CaptureScreenShot();

	try {
		obj.setUp();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		obj.takeScreenShot();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	obj.tearDown();
}
}

