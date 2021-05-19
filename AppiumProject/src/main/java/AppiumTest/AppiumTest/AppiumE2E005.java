package AppiumTest.AppiumTest;

	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	public class AppiumE2E005 {
		
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
			//	Thread.sleep(10000);
			//	driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click back btn
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Account ']")).click();
				Thread.sleep(10000);                
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).isDisplayed();
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
				
				Thread.sleep(10000);
				
//				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='LOGIN NOW']")).click();
				new TouchAction(driver).press(120, 1425).waitAction(ofSeconds(10000)).moveTo(960, 1582).release().perform();
				Thread.sleep(10000);//(115, 1600)(115, 800)  [120,1425][960,1582]
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[1]")).sendKeys("CAeComm19@gmail.com");
				Thread.sleep(10000);
				driver.hideKeyboard();	//add hide keyboard
				Thread.sleep(10000);
				driver.findElement(MobileBy.id("password")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sign in with your existing account']/android.widget.EditText[2]")).sendKeys("HDSupply19");
				Thread.sleep(10000);               
				driver.hideKeyboard();
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Sign in']")).click();
			
//				Thread.sleep(10000);
//				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='']")).click();
				Thread.sleep(50000);                
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc=\"HD Supply White Cap | Construction & Industrial - HD Supply White Cap\"]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("Eye Bolts");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Submit ']")).click();
			//	driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button']")).click();  //click on search btn
				Thread.sleep(10000);
				
			//	driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click close btn
			//	Thread.sleep(10000); 
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
				Thread.sleep(10);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Sort and Filter']")).click();
				
				
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Clear all']")).click();   //minimizing category
				Thread.sleep(10000);
				driver.findElement(MobileBy.className("android.widget.EditText")).click();   //minimizing Brand
				Thread.sleep(50000);
				
				driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@content-desc='Under $25 (4)']")).click();
				
				
		//		Thread.sleep(10000);
			//	driver.findElement(MobileBy.xpath("//*[@content-desc='Under $25 (3)']")).click();
		//		Thread.sleep(10000);
		//		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Clear all']")).click();  //minimizing category
		//		Thread.sleep(10000); 
		//		driver.findElement(MobileBy.className("android.widget.EditText")).click();   //minimizing Brand
				Thread.sleep(10000); 
//				
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='GO']")).click();
				Thread.sleep(10000);
				
				//driver.findElement(MobileBy.className("android.widget.Button"));  //go btn
				
			//	Thread.sleep(10000);
			
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Done']")).click();
				
				Thread.sleep(10000);
				
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='SKU#: 104W300M']"));
				Thread.sleep(5000);
			//	driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='$0.13']")).click();
			//	Thread.sleep(10000);
				new TouchAction(driver).press(115, 1600).waitAction(ofSeconds(10000)).moveTo(115, 800).release().perform();
				Thread.sleep(5000);
				driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				Thread.sleep(10000);
				
	
				driver.navigate().back();
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='SKU#: 277JB2']")).click();
				driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				new TouchAction(driver).press(115, 1600).waitAction(ofSeconds(10000)).moveTo(115, 800).release().perform();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='SKU#: 166WRC14']")).click();
				driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='SKU#: 166WRC38']")).click();
				driver.findElement(MobileBy.xpath("//*[@content-desc='ADD TO CART']")).click();
				Thread.sleep(10000);
				
				
		
			
				new TouchAction(driver).press(0, 546).waitAction(ofSeconds(10000)).moveTo(0, 1277).release().perform(); //scroll up
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' 0']")).click();//add minicart
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='VIEW CART']")).click();
				
			//	driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Close']")).click(); //click back btn
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Location ']")).click();  //Zip code
				//Thread.sleep(10000);
				//driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='']")).click();  //Zip code
				Thread.sleep(10000);
				driver.findElement(MobileBy.linkText("Five digit zip code")).sendKeys("60607"); 
				Thread.sleep(10);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Submit ']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Update']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='CHECKOUT']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' 5']")).click();
				//android.view.View[@content-desc=" 0"]
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='CHECKOUT']")).click(); 
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=' New Shipping Address']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[4]/android.widget.EditText")).click(); //First name
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[4]/android.widget.EditText")).sendKeys("CHIRSTINA");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[5]/android.widget.EditText")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[5]/android.widget.EditText")).sendKeys("ARBOGAST");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[6]/android.widget.EditText")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[6]/android.widget.EditText")).sendKeys("3671 Old Winter Garden");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[8]/android.widget.EditText")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[8]/android.widget.EditText")).sendKeys("Orlando");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Spinner[@content-desc='Please Select...']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Spinner[@content-desc='Please Select...']")).sendKeys("Florida");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[10]/android.widget.EditText")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[10]/android.widget.EditText")).sendKeys("32805");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[11]/android.widget.EditText")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[11]/android.widget.EditText")).sendKeys("4567382912");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@content-desc='My Billing Address is the same as my Shipping address']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
			//	driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Change Billing Address']")).click();
	//////////Need to add clear text box code.........................
				//Thread.sleep(10000);
				
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[10]/android.widget.EditText")).click();

				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[10]/android.widget.EditText")).sendKeys("BOB1");
				Thread.sleep(10000);
//				MobileElement element = (MobileElement) driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[10]/android.widget.EditText"));
//				element.clear();
//				Thread.sleep(10000);
//				Thread.sleep(10000);               //android.webkit.WebView[@content-desc="Checkout - HD Supply White Cap"]/android.view.View[2]/android.view.View[13]/android.view.View[10]/android.widget.EditText

				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[11]/android.widget.EditText")).click();
				Thread.sleep(10000);           
				
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[11]/android.widget.EditText")).sendKeys("BOB2");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[12]/android.widget.EditText")).click();
				Thread.sleep(10000);
				//element.clear();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[12]/android.widget.EditText")).sendKeys("4121 6th Ave. N.W.");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[14]/android.widget.EditText")).click();
				Thread.sleep(10000);
				//element.clear();
			//	Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[14]/android.widget.EditText")).sendKeys("Seattle");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Spinner[@content-desc='Please Select...']")).click();		
				
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Spinner[@content-desc='Please Select...']")).sendKeys("Washington");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[16]/android.widget.EditText")).click();	
				Thread.sleep(10000);
				
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[16]/android.widget.EditText")).sendKeys("98107");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[17]/android.widget.EditText")).click();	
				Thread.sleep(10000);
				
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[13]/android.view.View[17]/android.widget.EditText")).sendKeys("2134435465");	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[5]/android.widget.EditText")).click();	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[14]/android.view.View[5]/android.widget.EditText")).sendKeys("Test4");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[10]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).click();	//Credit card number
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[10]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("4111111111111111");	//Credit card number
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
				driver.findElement(MobileBy.xpath("//android.webkit.WebView[@content-desc='Checkout - HD Supply White Cap']/android.view.View[2]/android.view.View[15]/android.view.View[3]/android.view.View[14]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("Test4");
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='SAVE & CONTINUE']")).click();	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='PLACE ORDER']")).click();	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='Christina Arbogast ']")).click();	//My Account
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Order History']")).click();	
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='My Invoices/Statements']")).click();
				Thread.sleep(10000);
				driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='View your invoices and statements here']")).click();
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
				
				
				AppiumE2E005 obj = new AppiumE2E005();
			
				obj.setUp();
				obj.tearDown();
			}
		}