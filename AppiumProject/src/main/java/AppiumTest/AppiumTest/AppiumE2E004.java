package AppiumTest.AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thoughtworks.selenium.webdriven.commands.Click;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.android.nativekey.PressesKey;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.android.nativekey.PressesKey;

public class AppiumE2E004{
	
		AppiumDriver<MobileElement> driver;
		public void setUp() throws MalformedURLException, InterruptedException
		{
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("browserName", "chrome");
			cap.setCapability("device", "Android");
			cap.setCapability("deviceName", "Nexus5");   //emulator-5554
			cap.setCapability("platformVersion", "8.0");
			cap.setCapability("platformName", "Android");
			
		//	cap.setCapability("appPackage","com.android.chrome");// .vending
			cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
	
			 
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\kpandey\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe"); 
			System.setProperty("webdriver.chrome.driver","Lib/chromedriver.exe");
			
			
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
			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Account ']")).click();
			
			//Thread.sleep(5000);
			//driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOG IN']")).click();
			
			Thread.sleep(10000);
			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).isDisplayed();
			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
			
			Thread.sleep(10000);
			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[1]")).sendKeys("RSeComm19@gmail.com");
			Thread.sleep(10000);
			driver.findElement(MobileBy.id("password")).click();
			Thread.sleep(5000);
			driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[2]")).sendKeys("HDSupply19");
			Thread.sleep(10000);
			driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Sign in']")).click();
			
			Thread.sleep(10000);
		//	driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='']")).click();
		//	Thread.sleep(10000);
			
			//Thread.sleep(10000);
			
			
		}
		
		public void tearDown() {
			driver.quit();
	}


		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			
			AppiumE2E004 obj = new AppiumE2E004();
		
			obj.setUp();
			obj.tearDown();
		}
	}
	
