package AppiumTest.AppiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

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
import io.appium.java_client.remote.HideKeyboardStrategy;

	@SuppressWarnings("unused")
	public class IOSE2E_009 {
		AppiumDriver<IOSElement> driver;
		
		public void setUp() throws MalformedURLException, InterruptedException{

			DesiredCapabilities caps = DesiredCapabilities.iphone();
			caps.setCapability("appiumVersion", "1.9.1");
			caps.setCapability("deviceName","iPhone Simulator"); //iPhone Simulator
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("platformVersion","12.0");
			caps.setCapability("platformName", "iOS");
			caps.setCapability("browserName", "safari");
			caps.setCapability("autoGrantPermission",true);
			caps.setCapability("nativeWebTap", true);
		//	caps.setCapability("autoAcceptAlerts", "true");
			
			 driver = new IOSDriver<IOSElement>(new URL("http://"+"PraveenSK"+":"+"f19e3d4e-c8d2-4139-9fe3-63bf20ce0aec"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		Thread.sleep(10000);                                                      //87343e1cd61740e095eaeb7e13b9fe9d   794e8581-b151-423e-8d3f-b30d740d0595
		driver.get("https://preproduction.whitecap.com"); 
	
		Thread.sleep(10000);
		 driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		 Thread.sleep(50000);             
		 driver.findElement(By.xpath("//a[@class='button button--login header-dropdown__button']")).click();
		 Thread.sleep(10000);
	    driver.findElement(By.id("logonIdentifier")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.id("logonIdentifier")).sendKeys("BKeComm19@gmail.com");
	    Thread.sleep(10000);
	    driver.findElement(By.id("password")).sendKeys("HDSupply19");
	    Thread.sleep(10000);
	    driver.findElement(By.id("next")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//div[@id='user-panel']//i[@class='hd-icon icon-chevron-down']")).click();
	    Thread.sleep(10000);		    
	    driver.findElement(By.xpath("//a[contains(text(),'Account Review')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//select[@class='form__selectbox']")).click(); //open drop down list
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id='account-page']/div/div/div[2]/div[3]/div/div[1]/div[2]/select/option[2]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[contains(text(),'Shop on this Account')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.name("query")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.name("query")).sendKeys("15150605");
	    Thread.sleep(10000);
	    ((IOSDriver<IOSElement>) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Go");
	    Thread.sleep(10000);          
	    driver.findElement(By.xpath("//h3[@class='product__title']")).click();
	    ScrollDown();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[@class='qty-counter__btn qty-counter__btn--plus']")).click();//+
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[@class='button button--yellow-black-big']")).click(); //add to cart
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//input[@placeholder='Search by name, brand, product id…']")).sendKeys("Nails");
	    Thread.sleep(10000);         
	    driver.findElement(By.xpath("//a[contains(text(),'DEWALT 2-1/2' 16 GAuge Angled Finish Nails')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[@class='quantity']//a[@class='qty-counter__btn qty-counter__btn--plus'][contains(text(),'+')]")).click();
	   	driver.findElement(By.xpath("//span[@class='quantity']//a[@class='qty-counter__btn qty-counter__btn--plus'][contains(text(),'+')]")).click();
	    driver.findElement(By.xpath("//span[@class='quantity']//a[@class='qty-counter__btn qty-counter__btn--plus'][contains(text(),'+')]")).click();
	    driver.findElement(By.xpath("//span[@class='quantity']//a[@class='qty-counter__btn qty-counter__btn--plus'][contains(text(),'+')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[@class='button button--yellow-black-big']")).click(); //add to cart
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[@class='minicart__cart-count-number']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[@class='button button--grey-dark minicart__checkout']")).click();
			
	    Thread.sleep(10000);         
	    driver.findElement(By.xpath("//div[@class='select-address__group']//div[1]//div[1]//label[1]")).click(); //radio btn
	   	Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[@class='button button--blue']")).click();
	   	Thread.sleep(10000);
	   	driver.findElement(By.xpath("//input[@id='receiver-contact']")).sendKeys("Test8");
	   	Thread.sleep(10000);
	   	driver.findElement(By.xpath("//button[@class='button button--blue']")).click();
	   	
	   	
	   	Thread.sleep(10000);
	   	driver.findElement(By.id("cc-number")).click();
	    Thread.sleep(10000);		    
	    driver.findElement(By.id("cc-number")).sendKeys("6011000000000000");
	    Thread.sleep(10000);
	    driver.findElement(By.id("exp-date")).click();
	    Thread.sleep(10000);		    
	    driver.findElement(By.id("exp-date")).sendKeys("12/22");
	    Thread.sleep(10000);
	    driver.findElement(By.id("cc-name")).click();
	    Thread.sleep(10000);		    
	    driver.findElement(By.id("cc-name")).sendKeys("Test7");
	    Thread.sleep(10000);
	    driver.findElement(By.id("cvv-number")).click();
	    Thread.sleep(10000);		    
	    driver.findElement(By.id("cvv-number")).sendKeys("123");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[@class='button button--blue']")).click(); //save and continue
	    Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--green-fullwidth checkout-summary__order-button']")).click(); //Place order
	   	Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[@class='user-panel__link link']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[contains(text(),'My Order History')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[contains(text(),'#1617')]")).click();	    
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
		
		
		
		
	@SuppressWarnings("unused")
	private int ofSeconds(int i) {
	// TODO Auto-generated method stub
	return 0;
	}

	public void tearDown() {
	driver.quit();
	}


	public static void main(String[] args) throws MalformedURLException, InterruptedException {



	// TODO Auto-generated method stub
	IOSE2E_009 obj = new IOSE2E_009();

	obj.setUp();
	obj.ScrollDown();
	obj.ScrollUp();
//		obj.searchKeyword();
	obj.tearDown();

	}

		}

