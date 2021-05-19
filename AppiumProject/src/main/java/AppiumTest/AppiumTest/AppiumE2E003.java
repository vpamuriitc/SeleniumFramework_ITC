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
	

public class AppiumE2E003 {

		
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
		
				 
				System.setProperty("webdriver.chrome.driver","Lib/chromedriver.exe");
				
				
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
				Thread.sleep(2000);
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
				Thread.sleep(10000);
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Account ']")).click();
				
				Thread.sleep(10000);                
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).isDisplayed();
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
				new TouchAction(driver).press(115, 1600).waitAction(ofSeconds(10000)).moveTo(115, 800).release().perform();
				Thread.sleep(50000);
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
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("Wedge Anchors");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button']")).click();  //click on search btn
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click close btn
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='Hero Image']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click close btn
				Thread.sleep(10000);
				new TouchAction(driver).press(115, 1600).waitAction(ofSeconds(10000)).moveTo(115, 800).release().perform();
				Thread.sleep(10000);
				MobileElement element = (MobileElement) driver.findElementByAccessibilityId("1");    //Or use xpath : //android.widget.EditText[@content-desc="1"]
				element.clear();
				Thread.sleep(40000);
				driver.findElement(MobileBy.xpath("//android.widget.EditText[@content-desc='1']")).sendKeys("10");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='ADD TO CART']")).click();
				Thread.sleep(10000);
				driver.navigate().back();   //or add Scroll up code here if back function is not working and the search or other product.
				//driver.pressKeyCode(AndroidKeyCode.BACK);
				//driver.back();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("Wedge Anchors");
				Thread.sleep(10000);
				//add scroll here if needed
				
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button']")).click();  //click on search btn
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='SKU#: 2117417SD1']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Account ']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Project List']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				Thread.sleep(10000);
				new TouchAction(driver).press(115, 850).waitAction(ofSeconds(10000)).moveTo(115, 450).release().perform();  //add scroll here if needed
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				Thread.sleep(10000);
				//add scroll here if needed
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' ']")).click(); //click on mini cart
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='View Cart']")).click();  //view cart 1
				//Thread.sleep(10000);
				//driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='VIEW CART']")).click();  //view cart 2
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Location ']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.linkText("Five digit zip code")).sendKeys("32805");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='Submit ']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Update']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='CHECKOUT']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[4]/android.widget.EditText")).sendKeys("KYLE");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[5]/android.widget.EditText")).sendKeys("KRAUSER");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[6]/android.widget.EditText")).sendKeys("1400 W. Carroll Avenue");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[8]/android.widget.EditText")).sendKeys("Chicago");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Spinner[@content-desc='Please Select...']")).sendKeys("Illinois");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[10]/android.widget.EditText")).sendKeys("60607");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[11]/android.widget.EditText")).sendKeys("2345234567");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[35]/android.widget.EditText")).sendKeys("Test2");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("	//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[10]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("4111111111111111");
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
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[14]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("Test2");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='PLACE ORDER']")).click();	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Christina Arbogast ']")).click();	//My Account //unable to ckick on My Account
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Order History']")).click();	
				Thread.sleep(10000);
				//unable to click on My Account
				Thread.sleep(10000);
				
				Thread.sleep(10000);
				
				Thread.sleep(10000);
				
				
				
}
			private int ofSeconds(int i) {
				// TODO Auto-generated method stub
				return 0;
			}
			public void tearDown() {
				driver.quit();
		}


			public static void main(String[] args) throws MalformedURLException, InterruptedException {
				
				
				AppiumE2E003 obj = new AppiumE2E003();
			
				obj.setUp();
				obj.tearDown();
			}
		}