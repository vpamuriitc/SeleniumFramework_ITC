package AppiumTest.AppiumTest;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
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
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.android.nativekey.PressesKey;

public class AppiumE2E006 {

	
		
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
				Thread.sleep(50000);
				String baseurl = "https://preproduction.whitecap.com"; // https://beta.whitecap.com/
				driver.get(baseurl);
				Thread.sleep(50000);
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
				//Thread.sleep(10000);
//				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click back btn
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Account ']")).click();
				Thread.sleep(10000);                
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).isDisplayed();
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
				
				Thread.sleep(50000);
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(10000)).moveTo(115, 350).release().perform();
//				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
				//new TouchAction(driver).press(120, 1425).waitAction(ofSeconds(10000)).moveTo(960, 1582).release().perform();
				Thread.sleep(50000);
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[1]")).sendKeys("SSeComm19@gmail.com");
				Thread.sleep(10000);
				driver.hideKeyboard();	//add hide keyboard
				Thread.sleep(10000);
				driver.findElement(MobileBy.id("password")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[2]")).sendKeys("HDSupply19");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Sign in']")).click();
				Thread.sleep(50000);

				//MyAccount                       
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sierra Sarver ']")).click();
				Thread.sleep(50000);
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Account Review']")).click();
				Thread.sleep(50000);               
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); 
				Thread.sleep(50000);   
				//account selection
				driver.findElement(MobileBy.xpath("//android.widget.Spinner[@content-desc='66771000 | CONRAD CONSTRUCTION CO']")).click(); 
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView")).click(); 
				Thread.sleep(50000);
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(10000)).moveTo(115, 350).release().perform();
				//search
				driver.navigate().back();//back
				Thread.sleep(10000);
				driver.findElement(MobileBy.linkText("Search by name, brand, product id…")).sendKeys("Nails");
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Submit ']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click dialog close btn
				//categeory selection
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
				Thread.sleep(10);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
				Thread.sleep(50000);
				//add scroll up if needed
				driver.scrollToExact("Collated Nails (.*)");
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Collated Nails (.*)']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click dialog close btn
				
				//add product
			//	driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='SKU#: 324DCA16250']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='Hero Image']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click dialog close btn
				Thread.sleep(50000);
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(1)).moveTo(115, 350).release().perform();//need to scroll little
				Thread.sleep(50000);
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Location ']")).click();
			//	Thread.sleep(50000);
			//	driver.findElement(MobileBy.linkText("Tell us your zip code")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Location ']")).click();  //Zip code
				Thread.sleep(50000);
				driver.findElement(MobileBy.linkText("Five digit zip code")).sendKeys("12345");
				Thread.sleep(10);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Submit ']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Update']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='ADD TO CART']")).click(); //add to cart
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' 0']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='+']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='VIEW CART']")).click();
				Thread.sleep(50000);
				driver.navigate().back();   //previous screen
				Thread.sleep(50000);
				driver.findElement(MobileBy.linkText("Search by name, brand, product id…")).sendKeys("Rivets");
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Submit ']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='Hero Image'")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); 
				Thread.sleep(50000);
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(1)).moveTo(115, 350).release().perform();//need to scroll little
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='ADD TO CART']")).click(); //add to cart
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' 0']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='CHECKOUT']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); 
				Thread.sleep(50000);  
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(1)).moveTo(115, 350).release().perform();//need to scroll little
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='W LITTLE YORK @ ANTOINE-CC4750']")).click();  //radio btn
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(50000);
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(1)).moveTo(115, 350).release().perform();//need to scroll little
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[17]/android.widget.EditText")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.id("job-code")).sendKeys(Keys.TAB);
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='.*']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[1]/android.widget.EditText")).sendKeys("123");
				Thread.sleep(50000);
				driver.findElement(MobileBy.id("po-number")).sendKeys(Keys.TAB);
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='.*']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[2]/android.widget.EditText")).sendKeys("345");
				Thread.sleep(50000);
				driver.findElement(MobileBy.id("tax-id")).sendKeys(Keys.TAB);
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='.*']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[3]/android.widget.EditText")).sendKeys("5678");
				Thread.sleep(50000);
				driver.findElement(MobileBy.id("card")).sendKeys(Keys.TAB);
				Thread.sleep(50000);
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(1)).moveTo(115, 350).release().perform();//need to scroll little
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='Pay by account*** 66771000'")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("	//android.widget.Button[@content-desc='PLACE ORDER']")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("")).click();//26 to 30 steps
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("")).click();
				Thread.sleep(50000);
				driver.findElement(MobileBy.xpath("")).click();
				Thread.sleep(50000);
				
				
				
				
				
				
				
				
				
				
				
				
	}
			
			public void screenshot(String path_screenshot) throws IOException{
			    File srcFile=driver.getScreenshotAs(OutputType.FILE);
			    String filename=UUID.randomUUID().toString(); 
			    File targetFile=new File(path_screenshot + filename +".jpg");
			    FileUtils.copyFile(srcFile,targetFile);
			}
			
			private int ofSeconds(int i) {
				// TODO Auto-generated method stub
				return 0;
			}

			public void tearDown() {
				driver.quit();
		}


			public static void main(String[] args, String path_screenshot) throws MalformedURLException, InterruptedException {
				
				
				AppiumE2E006 obj = new AppiumE2E006();
			
				obj.setUp();
				try {
					obj.screenshot(path_screenshot);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				obj.tearDown();
			}
		}
				
				
				
				
				
				
				
				
				
				
				
				
