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
public class IOSE2E005 {

	AppiumDriver<IOSElement> driver;
	public void setUp() throws MalformedURLException, InterruptedException{

		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","iPhone Simulator"); //iPhone Simulator
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion","12.0");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "safari");
		caps.setCapability("nativeWebTab", true);
		//	caps.setCapability("autoGrantPermission",true);
		//	caps.setCapability("autoAcceptAlerts", "true");

		driver = new IOSDriver<IOSElement>(new URL("http://"+"SadhanaCS"+":"+"a4efc752-4e89-4ef6-8475-1cca1fe23d88"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		Thread.sleep(10000);                                                      //87343e1cd61740e095eaeb7e13b9fe9d   794e8581-b151-423e-8d3f-b30d740d0595
		driver.get("https://preproduction.whitecap.com"); 

		//			Thread.sleep(5000);
		//			driver.switchTo().alert().accept();
		//			Thread.sleep(5000);
		//			driver.switchTo().alert().accept();
		//			Thread.sleep(50000);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		Thread.sleep(50000);             
		driver.findElement(By.xpath("//a[@class='button button--login header-dropdown__button']")).click();
		Thread.sleep(10000);

		//			driver.findElement(By.xpath("//*[@id='user-panel']/a")).click();
		//			Thread.sleep(10000);
		//			driver.findElement(By.xpath("//*[@id='user_account']/div[1]/a")).click();
		//			Thread.sleep(10000);
		//			driver.findElement(By.xpath("//*[@id='logonIdentifier']")).click();
		//			Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys("CAeComm19@gmail.com");
		Thread.sleep(50000);         
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		Thread.sleep(50000);
		driver.findElement(By.id("password")).sendKeys("HDSupply19"); 
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='next'] ")).click();   //Signin
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='user-panel']//i[@class='hd-icon icon-chevron-down']")).click();
		Thread.sleep(10000);		    
		driver.findElement(By.xpath("//a[contains(text(),'Account Review')]")).click();
		Thread.sleep(10000);
		
		ScrollDown();
			 
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//input[@placeholder='Search by name, brand, product id…']")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("query")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("query")).sendKeys("Eye Bolts");
		Thread.sleep(10000);
		((IOSDriver<IOSElement>) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Go");

		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//section[@id='product_listing']//section[1]//h4[1]")).click();   //minimize category
		Thread.sleep(10000);       
		driver.findElement(By.xpath("//section[2]//h4[1]")).click();   //minimize brand
		Thread.sleep(10000);       

		driver.findElement(By.xpath("//body[@class='menu-active']/div[@class='wrapper']/main/section[@id='product_listing']/div[@class='product-listing__columns-wrap']/aside[@class='sidebar sidebar--left active']/section[3]/div[1]/ul[1]/li[2]/label[1]/span[1]")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//section[@id='product_listing']//section[1]//h4[1]")).click();   //minimize category
		Thread.sleep(10000);       
		driver.findElement(By.xpath("//section[2]//h4[1]")).click();   //minimize brand
		Thread.sleep(10000);       

		driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='button button--yellow-black-small sidebar__sort-button']")).click();  //Done
		Thread.sleep(10000);

		driver.findElement(By.xpath("//body/div[@class='wrapper']/main/section[@id='product_listing']/div[@class='product-listing__columns-wrap']/section[@class='product-listing__main']/div[@class='product-list__wrapper']/div[@class='product-list']/div[1]/form[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(10000);
		ScrollDown();
		//driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='product-list']//div[1]//form[1]//div[1]//div[1]//div[2]//button[1]")).click(); //add to cart
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/div[@class='wrapper']/main/section[@id='product_listing']/div[@class='product-listing__columns-wrap']/section[@class='product-listing__main']/div[@class='product-list__wrapper']/div[@class='product-list']/div[2]/form[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		ScrollDown();
		driver.findElement(By.xpath("//div[@class='product-list__wrapper']//div[2]//form[1]//div[1]//div[1]//div[2]//button[1]")).click(); //add to cart
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@class='wrapper']/main/section[@id='product_listing']/div[@class='product-listing__columns-wrap']/section[@class='product-listing__main']/div[@class='product-list__wrapper']/div[@class='product-list']/div[3]/form[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		ScrollDown();
		driver.findElement(By.xpath("//div[3]//form[1]//div[1]//div[1]//div[2]//button[1]")).click();  //add to cart

		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@class='wrapper']/main/section[@id='product_listing']/div[@class='product-listing__columns-wrap']/section[@class='product-listing__main']/div[@class='product-list__wrapper']/div[@class='product-list']/div[4]/form[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		ScrollDown();
		driver.findElement(By.xpath("//div[4]//form[1]//div[1]//div[1]//div[2]//button[1]")).click(); //add to cart
		Thread.sleep(3000);
		
		ScrollUp();
		
		driver.findElement(By.xpath("//span[@class='minicart__cart-count-number']")).click(); //mini cart
		driver.findElement(By.xpath("//a[@class='button button--grey-dark minicart__view-cart']")).click(); //view cart\
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//div[@class='user-panel__item user-panel__item--location']//a[@class='user-panel__link link']")).click(); //location
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='searchZipCode']")).sendKeys("60607");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//form[@id='user_location_form']//i[@class='hd-icon icon-search']")).click();  //search
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='button button--yellow-full-width cart__checkout-top-button']")).click();  //checkout btn
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='select-address__add-label']")).click(); //new shiping address
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='first-name[Shipping]']")).click();
		driver.findElement(By.xpath("//input[@id='first-name[Shipping]']")).sendKeys("CHIRSTINA");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='last-name[Shipping]']")).click();
		driver.findElement(By.xpath("//input[@id='last-name[Shipping]']")).sendKeys("ARBOGAST");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='street-address[Shipping]']")).click();
		driver.findElement(By.xpath("//input[@id='street-address[Shipping]']")).sendKeys("3671 Old Winter Garden");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='address-city[Shipping]']")).click();
		driver.findElement(By.xpath("//input[@id='address-city[Shipping]']")).sendKeys("Orlando");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@id='state[Shipping]']")).click();
		driver.findElement(By.xpath("//select[@id='state[Shipping]']")).sendKeys("Florida");
		Thread.sleep(10000);
		ScrollDown();
		driver.findElement(By.xpath("//input[@id='zip-code[Shipping]']")).click();
		driver.findElement(By.xpath("//input[@id='zip-code[Shipping]']")).sendKeys("32805");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='phone-number[Shipping]']")).click();
		driver.findElement(By.xpath("//input[@id='phone-number[Shipping]']")).sendKeys("4567382912");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='form__checkmark']")).click(); //uncheck check box
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();  //save and continue
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='first-name[Billing]']")).click();  //change billing address
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='first-name[Billing]']")).sendKeys("BOB1");   //change billing address
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@id='last-name[Billing]']")).click();

		driver.findElement(By.xpath("//input[@id='last-name[Billing]']")).sendKeys("BOB2");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='street-address[Billing]']")).click();

		driver.findElement(By.xpath("//input[@id='street-address[Billing]']")).sendKeys("4121 6th Ave. N.W.");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='address-city[Billing]']")).click();

		driver.findElement(By.xpath("//input[@id='address-city[Billing]']")).sendKeys("Seattle");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@id='state[Billing]']")).click();

		driver.findElement(By.xpath("//select[@id='state[Billing]']")).sendKeys("Washington");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='zip-code[Billing]']")).click();
		ScrollDown();
		driver.findElement(By.xpath("//input[@id='zip-code[Billing]']")).sendKeys("98107");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='phone-number[Billing]']")).click();

		driver.findElement(By.xpath("//input[@id='phone-number[Billing]']")).sendKeys("2134435465");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();  //save and continue
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='receiver-contact']")).sendKeys("Test4");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();
		Thread.sleep(10000);

		driver.findElement(By.id("cc-number")).click();
		Thread.sleep(3000);		    
		driver.findElement(By.id("cc-number")).sendKeys("4111111111111111");
		Thread.sleep(3000);
		driver.findElement(By.id("exp-date")).click();
		Thread.sleep(3000);		    
		driver.findElement(By.id("exp-date")).sendKeys("12/22");
		Thread.sleep(3000);
		driver.findElement(By.id("cc-name")).click();
		Thread.sleep(3000);		    
		driver.findElement(By.id("cc-name")).sendKeys("Test4");
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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='ctl03_MyListView_MainListView_ctl12_0_HyperLink1_0']")).click(); //click on id
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[contains(text(),'Details')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[contains(text(),'Payments')]")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//td[contains(text(),'Customer Management')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='ctl03_txtSearch']")).sendKeys("Sierra Sarver");  //search for new registered user
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='ctl03_btnSearch']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Sierra S.')]")).click(); //click on name and verify details

		Thread.sleep(50000);
		driver.quit();
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


		IOSE2E005 obj = new IOSE2E005();

		obj.setUp();
		obj.ScrollDown();
		obj.ScrollUp();
		obj.tearDown();
	}
}

