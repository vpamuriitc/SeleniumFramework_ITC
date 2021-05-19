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
//import io.appium.java_client.touch.*;
//import io.appium.java_client.touch.offset.PointOption;
public class IOSE2E003 {

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

		driver = new IOSDriver<IOSElement>(new URL("http://"+"PavaniC"+":"+"1a243900-a445-4d01-8f39-d0d4b804fa02"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		Thread.sleep(10000);                                                      
		driver.get("https://preproduction.whitecap.com"); 

		//			Thread.sleep(5000);
		//			driver.switchTo().alert().accept();
		//			Thread.sleep(5000);
		//			driver.switchTo().alert().accept();
		Thread.sleep(10000);


		driver.findElement(By.xpath("//*[@id='user-panel']/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user_account']/div[1]/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='logonIdentifier']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys("KKeComm19@gmail.com");
		Thread.sleep(50000);         
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("HDSupply19");
		Thread.sleep(10000);
		driver.findElement(By.id("next")).click(); //signin
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='nav__trigger no-desktop']")).click();   ////i[@class='hd-icon icon-menu']


		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'BRANDS')]")).click();  //click on brand    /html/body/div/header/div[2]/div/nav/ul/li[2]/a
		Thread.sleep(50000);         

		driver.findElement(By.xpath("//a[6]//img[1]")).click();  //click on DeWalt
		Thread.sleep(50000); 
		//input[@placeholder='Search by name, brand, product id…']
		driver.findElement(By.name("query")).click();
		Thread.sleep(10000); 

		driver.findElement(By.name("query")).sendKeys("Wedge Anchors");
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//div[@class='search__field']//i[@class='hd-icon icon-search']")).click();
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click();
		Thread.sleep(50000);          
		driver.findElement(By.xpath("//*[@id='product_listing']/div[2]/aside/section[1]/div/ul/li[6]/a")).click();
		Thread.sleep(50000);       
	                             
		driver.findElement(By.xpath("//div[@class='product-list']//div[1]//form[1]//div[1]//a[1]//img[1]")).click();  //click on image
		Thread.sleep(10000);      //*[@id='product_listing']/div[3]/section/div[2]/div/div[1]/form/div/a/img          //click on image
		ScrollDown(); //scroll down
		Thread.sleep(10000); 
		driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]")).click(); //+
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]")).click(); //+
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]")).click(); //+
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/button")).click(); //Add to cart
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);//*[@id='product_listing']/div[3]/section/div[2]/div/div[2]/form/div/a/img
		driver.findElement(By.xpath("//div[@class='product-list__wrapper']//div[2]//form[1]//div[1]//a[1]//img[1]")).click(); 
		Thread.sleep(10000);//div[@class='product-list__wrapper']//div[2]//form[1]//div[1]//a[1]//img[1]
		ScrollDown();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/button")).click(); //Add to cart
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user-panel']/a/span")).click();   //My Account
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user_account']/div/ul[2]/li[3]/a")).click(); // project list
		Thread.sleep(10000);
		ScrollDown(); 
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='account-page']/div/div/div[2]/div[3]/div/div/div[6]/a")).click(); // add list to cart
		ScrollUp();
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//span[@class='minicart__cart-count-number']")).click();   //click on cart     //*[@id='minicart']/a/div/i
		Thread.sleep(50000);  
		//driver.findElement(By.xpath("//i[@class='hd-icon icon-shopping-cart']")).click();  //click on view cart
		//Thread.sleep(10000);  
		driver.findElement(By.xpath("//a[@class='button button--grey-dark minicart__view-cart']")).click();//click on view cart
		//	driver.findElement(By.xpath("//i[@class='hd-icon icon-map-marker-alt'")).click();     //click on location      //i[@class='hd-icon icon-menu'
		//driver.findElement(By.xpath("/html/body/div/header/div[1]/div/div[1]/div[2]/a/span")).click();   //click on location
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user_location_form']/input")).click(); //zip code
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='searchZipCode']")).sendKeys("32805");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user_location_form']/button")).click();  //click on go
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();   //click on update    //*[@id='user_location']/div/div/div[2]/button
		Thread.sleep(10000);
		//ScrollDown();
	//	Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='button button--yellow-full-width cart__checkout-top-button']")).click();    ////*[@id='cart-page']/div[3]/div[2]/div[2]/div[1]/div/a 
		Thread.sleep(10000);
		driver.findElement(By.id("first-name[Shipping]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("first-name[Shipping]")).sendKeys("Kyle");
		Thread.sleep(10000);
		driver.findElement(By.id("last-name[Shipping]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("last-name[Shipping]")).sendKeys("Krauser");
		Thread.sleep(10000);
		driver.findElement(By.id("street-address[Shipping]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("street-address[Shipping]")).sendKeys("1400 W. Carroll Avenue");
		Thread.sleep(10000);
		driver.findElement(By.id("address-city[Shipping]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("address-city[Shipping]")).sendKeys("Chicago");
		Thread.sleep(10000);
		driver.findElement(By.id("state[Shipping]")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("option:nth-child(18)")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("zip-code[Shipping]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("zip-code[Shipping]")).sendKeys("60607");
		Thread.sleep(10000);
		driver.findElement(By.id("phone-number[Shipping]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("phone-number[Shipping]")).sendKeys("(234) 523-4567");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='checkout-page']/div/div[2]/form/div[4]/div[3]/div/button")).click(); //click on save and continue
		//	 Thread.sleep(10000);
		// driver.findElement(By.xpath("//*[@id='receiver-contact']")).click();  //Test2
		//	Thread.sleep(10000);
		//	 driver.findElement(By.xpath("//*[@id='checkout-page']/div/div[2]/form/div[3]/div[3]/div/button")).click(); //continue
		Thread.sleep(10000);
		//div[10]//div[3]//div[1]//div[1]//label[1]//span[1]
		driver.findElement(By.xpath("//div//div//div//div//div//div//div[2]//div[3]//div[1]//div[1]//label[1]//span[1]")).click(); //UPS Ground          //*[@id='checkout-page']/div/div[2]/form/div[2]/div[2]/div[2]/div[3]/div/div/label[1]/span
		Thread.sleep(10000);         
		driver.findElement(By.xpath("//body//div[3]//div[3]//div[1]//div[1]//label[1]//span[1]")).click();    //UPS Ground  //*[@id='checkout-page']/div/div[2]/form/div[2]/div[2]/div[3]/div[3]/div/div/label[1]/span//UPS Ground
		Thread.sleep(10000);      
		driver.findElement(By.xpath("//input[@id='receiver-contact']")).sendKeys("Test2");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();    //save and continue
		Thread.sleep(10000);
		driver.findElement(By.id("job-code")).sendKeys(Keys.TAB);
		Thread.sleep(10000);
		driver.findElement(By.id("job-code")).sendKeys("123");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='first-data-payment-field-card']")).sendKeys("4111111111111111");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-exp']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-exp']")).sendKeys("12/22");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-name']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-name']")).sendKeys("Test2");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-cvv']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-cvv']")).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Save & Continue')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='checkout-page']/div/div[2]/div[3]/form/div[3]/div/button")).click();
		Thread.sleep(10000);

		Thread.sleep(10000);

		Thread.sleep(10000);


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
		IOSE2E003 obj = new IOSE2E003();

		obj.setUp();
		obj.ScrollDown();
		obj.ScrollUp();
		//	obj.searchKeyword();
		obj.tearDown();

	}}