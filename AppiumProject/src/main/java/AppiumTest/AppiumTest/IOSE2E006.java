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
import java.util.Map;
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
public class IOSE2E006 {


	AppiumDriver<IOSElement> driver;
	public void setUp() throws MalformedURLException, InterruptedException{

		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","iPhone Simulator"); //iPhone Simulator
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion","12.0");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "safari");
		caps.setCapability("nativeWebTap", true);
	//	caps.setCapability("autoGrantPermission",true);              //do not remove this code of line
		//	caps.setCapability("autoAcceptAlerts", "true");

		driver = new IOSDriver<IOSElement>(new URL("http://"+"PhaniV"+":"+"f07d417a-1a17-459d-9800-5779f6ff0892"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		Thread.sleep(10000);                                                      //87343e1cd61740e095eaeb7e13b9fe9d   794e8581-b151-423e-8d3f-b30d740d0595
		driver.get("https://preproduction.whitecap.com"); 

		Thread.sleep(10000);   
//		driver.switchTo().alert().accept();                              //do not remove this code of line
//		Thread.sleep(10000);   
//		driver.switchTo().alert().accept();
//		Thread.sleep(10000);   
		
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		Thread.sleep(50000);             
		driver.findElement(By.xpath("//a[@class='button button--login header-dropdown__button']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys("SSeComm19@gmail.com");
		Thread.sleep(50000);         
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("HDSupply19");
		Thread.sleep(10000);
		driver.findElement(By.id("next")).click(); //signin
		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[@class='user-panel__link-text link applied']")).click(); //my account
		Thread.sleep(10000);
		driver.findElement(By.xpath("//ul[@class='header-dropdown__action-list header-dropdown__action-list--order']//li[@class='header-dropdown__action-item']")).click();  //review account
		
		ScrollDown();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search by name, brand, product id…']")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("query")).sendKeys("Nails");
		Thread.sleep(3000);
		((IOSDriver<IOSElement>) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Go");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click(); 
		Thread.sleep(10);
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click(); 
		ScrollDown();
		Thread.sleep(10000);          
		driver.findElement(By.xpath("//a[@class='filter__link'][contains(text(),'Collated Nails')]")).click(); //selecting category area
		
//		Thread.sleep(10000); 
//		driver.findElement(By.xpath("//a[@class='filter__link active']")).click();
//	    Thread.sleep(5000);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='product-list']//div[1]//form[1]//div[1]//a[1]//img[1]")).click(); 
		Thread.sleep(10000);
		ScrollDown();
		
	//	driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]")).click(); //+
	//	Thread.sleep(10000);
	//	driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]")).click(); //+
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='delivery-time__change']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Tell us your zip code']")).sendKeys("12345");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--yellow-white product-view__zip-code__submit-button']")).click();  //check btn
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--yellow-black-big']")).click(); //add to cart
		Thread.sleep(10000);
		ScrollUp();
		driver.findElement(By.xpath("//span[@class='minicart__cart-count-number']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='qty-counter']//div[@class='qty-counter']//a[@class='qty-counter__btn qty-counter__btn--plus'][contains(text(),'+')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='qty-counter']//div[@class='qty-counter']//a[@class='qty-counter__btn qty-counter__btn--plus'][contains(text(),'+')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='button button--grey-dark minicart__view-cart']")).click(); //view cart
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Search by name, brand, product id…']")).sendKeys("Rivets");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='search__field']//i[@class='hd-icon icon-search']")).click();  //search btn
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='product-list']//div[1]//form[1]//div[1]//a[1]//img[1]")).click(); // clicking on img
		Thread.sleep(10000); 
		ScrollDown();
		
		driver.findElement(By.xpath("//button[@class='button button--yellow-black-big']")).click(); //add to cart
		Thread.sleep(10000);
		ScrollUp();	
		driver.findElement(By.xpath("//span[@class='minicart__cart-count-number']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='button button--yellow-long minicart__checkout']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='select-address__group']//div[1]//div[1]//label[1]//span[1]")).click();  //selecting radio btn
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();   //save and continue
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body//label[2]")).click();  //ups2
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='receiver-contact']")).sendKeys("Test5");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='job-code']")).sendKeys("123");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='po-number']")).sendKeys("345");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='tax-id']")).sendKeys("5678");
		Thread.sleep(10000);
		ScrollDown();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//h2[contains(text(),'Pay by account***')]")).click(); //pay by account
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();  //save and continue
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--green-fullwidth checkout-summary__order-button']")).click(); //place order
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='user-panel__link-text link applied']")).click();  //my account
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'My Order History')]")).click(); 
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='user-panel__link-text link applied']")).click(); //my account
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'My Invoices/Statements')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'View your invoices and statements here')]")).click();  //view your invoice and stmt here
		Thread.sleep(10000);
		driver.findElement(By.xpath("//tr[1]//td[2]//a[1]//img[1]")).click();  //click on pdf
		
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
		Thread.sleep(10000);
		
	    driver.findElement(By.xpath("//td[contains(text(),'Order Management')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'Today')]")).click();  //Today
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
		IOSE2E006 obj = new IOSE2E006();

		obj.setUp();
		obj.ScrollDown();
		obj.ScrollUp();
		//	obj.searchKeyword();
		obj.tearDown();

	}}