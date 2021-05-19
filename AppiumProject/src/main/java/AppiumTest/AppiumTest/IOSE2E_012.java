package AppiumTest.AppiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.android.nativekey.PressesKey;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.HideKeyboardStrategy;
//import io.appium.java_client.touch.*;
//import io.appium.java_client.touch.offset.PointOption;
public class IOSE2E_012 {

	AppiumDriver<IOSElement> driver;
	public void setUp() throws MalformedURLException, InterruptedException{
	
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","iPhone Simulator"); //iPhone Simulator
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion","12.0");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "safari");
		caps.setCapability("nevigateWebTab", true);
	//	caps.setCapability("autoGrantPermission",true);
	//	caps.setCapability("autoAcceptAlerts", "true");
		
		 driver = new IOSDriver<IOSElement>(new URL("http://"+"SadhanaCS"+":"+"a4efc752-4e89-4ef6-8475-1cca1fe23d88"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		 Thread.sleep(10000);                                                      
		 driver.get("https://preproduction.whitecap.com"); 
			
//			Thread.sleep(5000);
//			driver.switchTo().alert().accept();
//			Thread.sleep(5000);
//			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='user-panel']/a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='user_account']/div[1]/a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='logonIdentifier']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys("DWeComm19@gmail.com");
			Thread.sleep(50000);         
			driver.findElement(By.id("password")).sendKeys(Keys.TAB);
			Thread.sleep(50000);
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("HDSupply19");
			Thread.sleep(10000);
			 driver.findElement(By.id("next")).click(); //signin
			 Thread.sleep(10000);
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//div[@id='user-panel']//i[@class='hd-icon icon-chevron-down']")).click();
			    Thread.sleep(10000);		    
			    driver.findElement(By.xpath("//a[contains(text(),'Account Review')]")).click();
			    Thread.sleep(10000);
			    
			    driver.findElement(By.xpath("//input[@placeholder='Search by name, brand, product id…']")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.name("query")).click();
			    Thread.sleep(50000);
			    driver.findElement(By.name("query")).sendKeys("Nuts");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//div[@class='search__field']//i[@class='hd-icon icon-search']")).click();
			  //  ((IOSDriver<IOSElement>) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Go");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//div[@class='product-list']//div[1]//form[1]//div[1]//h3[1]")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//div[@class='product-list']//div[1]//form[1]//div[1]//div[1]//div[2]//button[1]")).click();  //add to cart
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//div[@class='product-list__wrapper']//div[2]//form[1]//div[1]//a[1]//img[1]")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//div[@class='product-list__wrapper']//div[2]//form[1]//div[1]//div[1]//div[2]//button[1]")).click(); //add to cart
			    Thread.sleep(10000);
			    
			    driver.findElement(By.name("query")).clear();
			    Thread.sleep(10000);
			    driver.findElement(By.name("query")).sendKeys("262SCRS825");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//div[@class='search__field']//i[@class='hd-icon icon-search']")).click();
			    Thread.sleep(10000);         
			    driver.findElement(By.xpath("//div[@class='product__sku-label']")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//button[@class='button button--yellow-white']")).click(); //add to cart
			    Thread.sleep(10000);
				driver.findElement(By.xpath("//a[@class='user-panel__link link applied']")).click(); //zip code
				Thread.sleep(10000);
				driver.findElement(By.xpath("//input[@name='searchZipCode']")).sendKeys("12345");
				Thread.sleep(10000);
			    driver.findElement(By.xpath("//form[@id='user_location_form']//i[@class='hd-icon icon-search']")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//button[@class='button button--small header-dropdown__update-btn active']")).click(); //update 
			    Thread.sleep(10000);
			 
			    driver.findElement(By.xpath("//span[@class='minicart__cart-count-number']")).click(); //click on cart
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//a[@class='button button--grey-dark minicart__view-cart']")).click(); //view cart
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//a[@class='button button--yellow-full-width cart__checkout-button']")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//input[@id='first-name[Shipping]']")).sendKeys("FIRST2");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//input[@id='last-name[Shipping]']")).sendKeys("Last2");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//input[@id='street-address[Shipping]']")).sendKeys("Hilltop Street");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//input[@id='address-city[Shipping]']")).sendKeys("Canton");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//select[@id='state[Shipping]']")).sendKeys("Georgia");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//input[@id='zip-code[Shipping]']")).sendKeys("30114");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//input[@id='phone-number[Shipping]']")).sendKeys("7849302832");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//button[@class='button button--blue']")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//input[@id='receiver-contact']")).sendKeys("Test1");
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//button[@class='button button--blue']")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.id("cc-number")).click();
			    Thread.sleep(3000);		    
			    driver.findElement(By.id("cc-number")).sendKeys("6011000000000004");
			    Thread.sleep(3000);
			    driver.findElement(By.id("exp-date")).click();
			    Thread.sleep(3000);		    
			    driver.findElement(By.id("exp-date")).sendKeys("12/22");
			    Thread.sleep(3000);
			    driver.findElement(By.id("cc-name")).click();
			    Thread.sleep(3000);		    
			    driver.findElement(By.id("cc-name")).sendKeys("Test10");
			    Thread.sleep(3000);
			    driver.findElement(By.id("cvv-number")).click();
			    Thread.sleep(3000);		    
			    driver.findElement(By.id("cvv-number")).sendKeys("123");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//button[@class='button button--blue']")).click(); //save and continue
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//button[@class='button button--green-fullwidth checkout-summary__order-button']")).click();  //place order
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//a[@class='user-panel__link link']")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//a[contains(text(),'My Order History')]")).click();
			    Thread.sleep(3000);

				 driver.findElement(By.xpath("//a[contains(text(),'#1612')]")).click();
				 Thread.sleep(10000);
				 driver.findElement(By.xpath("//a[@class='user-panel__link link']")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//a[contains(text(),'My Invoices/Statements')]")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//a[contains(text(),'View your invoices and statements here')]")).click();
			    Thread.sleep(10000);
			   
			    driver.findElement(By.xpath("//tr[1]//td[2]//a[1]//img[1]")).click();
			    Thread.sleep(3000);
			    driver.close();
			    Thread.sleep(10000);
			    driver.get("https://preproduction-cm.whitecap.com");
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys("KKeComm19@gmail.com");
				Thread.sleep(50000);         
				driver.findElement(By.id("password")).sendKeys(Keys.TAB);
				Thread.sleep(50000);
				driver.findElement(By.xpath("//*[@id='password']")).sendKeys("HDSupply19");
				Thread.sleep(10000);
				 driver.findElement(By.id("next")).click(); //signin
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//td[contains(text(),'Order Management')]")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//span[contains(text(),'Today')]")).click();  //Today
			    Thread.sleep(5000);
			    
			    driver.findElement(By.xpath("//a[@id='ctl03_MyListView_MainListView_ctl12_0_HyperLink1_0']")).click(); //click on id
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//li[contains(text(),'Details')]")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//li[contains(text(),'Payments')]")).click();
			    
//			    Thread.sleep(10000);
//				driver.findElement(By.xpath("//td[contains(text(),'Customer Management')]")).click();
//				Thread.sleep(10000);
//				driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//				Thread.sleep(10000);
//				driver.findElement(By.xpath("//input[@id='ctl03_txtSearch']")).sendKeys("Sierra Sarver");  //search for new registered user
//				Thread.sleep(10000);
//				driver.findElement(By.xpath("//input[@id='ctl03_btnSearch']")).click();
//				Thread.sleep(10000);
//				driver.findElement(By.xpath("//a[contains(text(),'Sierra S.')]")).click(); //click on name and verify details
//				
				Thread.sleep(50000);
			    driver.findElement(By.xpath("")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("")).click();
			    Thread.sleep(10000);
			    
			    
			    
			    
	}
	
public void ScrollUp(){
		
		
		Dimension size = driver.manage().window().getSize();
	    System.out.println(size);
	    int starty = (int) (size.height * 0.2);
	    int  endy = (int) (size.height * 0.8);
	    int startx = size.width / 2;
	  // int timedurationMS=10;
	    System.out.println("Start swipe operation");
	    driver.swipe(startx, starty, startx, endy, 1000);
		
	}
	
	
	
public void ScrollDown(){
		
		Dimension size = driver.manage().window().getSize();
	    System.out.println(size);
	    int starty = (int) (size.height * 0.8);
	    int  endy = (int) (size.height * 0.2);
	    int startx = size.width / 2;
	  // int timedurationMS=10;
	    System.out.println("Start swipe operation");
	    driver.swipe(startx, starty, startx, endy, 1000);
		
		
	}


private int ofSeconds(int i) {
// TODO Auto-generated method stub
return 0;
}

public void tearDown() {
	driver.quit();
}


public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	
	
	// TODO Auto-generated method stub
	IOSE2E_012 obj = new IOSE2E_012();
	
	obj.setUp();
	obj.ScrollDown();
	obj.ScrollUp();
//	obj.searchKeyword();
	obj.tearDown();

}}
