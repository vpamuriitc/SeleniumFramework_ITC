package AppiumTest.AppiumTest;

	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
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
	public class AppiumE2E_008 {
		
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
				System.setProperty("webdriver.chrome.driver","Lib\\chromedriver.exe");
				
				
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
				Thread.sleep(10000);
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Account ']")).click();
				
				Thread.sleep(10000);                 //android.view.View[@content-desc="LOGIN NOW"]
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).isDisplayed();
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
//				
//				Thread.sleep(10000);
//				
//				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
//				
				Thread.sleep(10000);
				//driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[1]")).sendKeys("CAeComm19@gmail.com");
				driver.findElement(MobileBy.id("logonIdentifier")).sendKeys("SDeComm19@gmail.com");
				Thread.sleep(10000);
				new TouchAction(driver).press(115, 650).waitAction(ofSeconds(10000)).moveTo(115, 350).release().perform();
				driver.findElement(MobileBy.id("password")).click();
				Thread.sleep(5000);
				//driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[2]")).sendKeys("HDSupply19");
				driver.findElement(MobileBy.id("password")).sendKeys("HDSupply19");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Sign in']")).click();
//				
//				Thread.sleep(10000);
//				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("139DH3");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button']")).click();  //click on search btn
				Thread.sleep(10000);
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Hero Image']")).click();
				Thread.sleep(10000); 
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc="+"]")).click();
				Thread.sleep(10);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc="+"]")).click();
				Thread.sleep(10000);
				//driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='ADD TO CART']")).click();
				Thread.sleep(15000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' 3']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='CHECKOUT']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[6]/android.view.View[1]")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				//As we were unable to select ups ground please modify below line
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[1]/android.view.View[1]/android.view.View[7]")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[11]/android.widget.EditText")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[11]/android.widget.EditText")).sendKeys("Test7");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[10]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[10]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("4111111111111111");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[12]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).click();
		        Thread.sleep(10000);
		        driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[12]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("12/22");
		        Thread.sleep(10000);
		        driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[16]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")).click();
		        Thread.sleep(10000);
		        driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[16]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("Test6");
		        Thread.sleep(10000);
		        driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[14]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[14]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("123");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='PLACE ORDER']")).click();	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Christina Arbogast ']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Order History']")).click();	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='#1567']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Christina Arbogast ']")).click();	//My Account
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Invoices/Statements']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='View your invoices and statements here']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOG OUT']")).click();
			}
			
			private int ofSeconds(int i) {
				// TODO Auto-generated method stub
				return 0;
			}

			public void tearDown() {
				driver.quit();
		}


			public static void main(String[] args) throws MalformedURLException, InterruptedException {
				
				
				AppiumE2E_008 obj = new AppiumE2E_008();
			
				obj.setUp();
				obj.tearDown();
			}
		}