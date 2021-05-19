package AppiumTest.AppiumTest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.android.nativekey.PressesKey;
public class TestScroll {

	
		// TODO Auto-generated method stub

		
			
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
					Thread.sleep(10000);
					
					
					//Thread.sleep(10000);
					//com.android.chrome:id/bottom_container
					//<android.widget.FrameLayout resource-id=com.android.chrome:id/bottom_container>
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
					Thread.sleep(10000);
				//	driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); 
				//	Thread.sleep(10000);
					//new TouchAction(driver).press(115, 650).waitAction(ofSeconds(1)).moveTo(115, 350).release().perform();
					driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).click();
					
					driver.hideKeyboard();
					driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("Nails");
					
					Thread.sleep(10000);
					driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button']")).click();  //click on search btn
					
					Thread.sleep(50000);
					driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
					Thread.sleep(10);
					driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
					Thread.sleep(50000);
					//add scroll up if needed
					driver.scrollToExact("Collated Nails (.*)");
					driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Collated Nails (.*)']")).click();
					Thread.sleep(50000);
				//	driver.navigate().back();
				//	MobileElement element = (MobileElement) driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText"));
				//	element.clear();
				//	driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("Eye Bolts");
				//	Thread.sleep(10000);
				//	element.clear();
					
					Thread.sleep(10000);
					new TouchAction(driver).press(115, 850).waitAction(ofSeconds(10000)).moveTo(115, 450).release().perform();
					Thread.sleep(10000); 
				//	new TouchAction(driver).press(0, 546).waitAction(ofSeconds(10000)).moveTo(0, 1277).release().perform();//scroll up
				//	Thread.sleep(10000); 
					
					Thread.sleep(10000); 
					new TouchAction(driver).press(0, 546).waitAction(ofSeconds(10000)).moveTo(0, 877).release().perform();//0,546][1080,677
				//clear the textbox
					
					MobileElement element = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.EditText[@content-desc='1']"));
					element.clear();
					
					
					
//					
//					Actions action = new Actions(driver);
//					action.moveTo(element, 10, 10);
//					action.perform();
//
//
//					
//					
//					JavascriptExecutor js = (JavascriptExecutor) driver;
//					HashMap<String, String> scrollObject = new HashMap<String, String>();
//					scrollObject.put("direction", "up");
//					js.executeScript("mobile: scroll", scrollObject);
					
				//	driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys(Keys.UP);
				
					
					
					//	new TouchAction(driver).press(115, 850).waitAction(ofSeconds(10000)).moveTo(115, 150).release().perform(); // Horizontal swipe
					
					
				//	Thread.sleep(20000);
//					MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
//				"new UiScrollable(new UiSelector().resourceId(\"com.android.chrome:id/bottom_container\")).getChildByText("
//				+ "new UiSelector().className(\"android.widget.Button"));
//		
					
					//Perform the action on the element
//					element.click();
					
					
//					Screen ss = new ScreenShots((AndroidDriver<MobileElement>) driver);
//					ScrollElement se = new ScrollElement((AndroidDriver<MobileElement>) driver);
//					try
//					{
//						MobileElement title = driver.findElement(By.xpath("//android.widget.TextView[@text='Contacts']"));
//						System.out.println(title.getText()+" page opened");
//						ss.takeScreenShots("Contact List");
//					}
//					catch(NoSuchElementException|IOException e)
//					{
//						System.out.println("Contact page fail to open");
//						e.printStackTrace();
//					}
		



				}


private int ofSeconds(int i) {
					// TODO Auto-generated method stub
					return 0;
				}


public void tearDown() {
	driver.quit();
}
//
//
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	
	TestScroll obj = new TestScroll();

	obj.setUp();
	obj.tearDown();
}
}
