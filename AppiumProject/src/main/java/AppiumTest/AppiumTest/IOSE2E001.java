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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.HideKeyboardStrategy;
import itc.Utility.ExcelReader;
//import io.appium.java_client.touch.*;
//import io.appium.java_client.touch.offset.PointOption;
public class IOSE2E001 extends itc.Utility.ExcelReader {

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
	//	caps.setCapability("autoGrantPermission",true);   //do not remove this code of line
	//	caps.setCapability("autoAcceptAlerts", "true");
		
		 driver = new IOSDriver<IOSElement>(new URL("http://"+"SMoulali"+":"+"ef3359e3-2c13-4bce-8e87-ea1383e558ef"+"@ondemand.saucelabs.com:80/wd/hub"), caps);  //794e8581-b151-423e-8d3f-b30d740d0595    08b18af3-1f65-47d4-818e-c0dcf39fd19b
		 Thread.sleep(10000);                                                      //87343e1cd61740e095eaeb7e13b9fe9d
		 driver.get("https://preproduction.whitecap.com"); 
			
//			Thread.sleep(5000);
//			driver.switchTo().alert().accept();    //do not remove this code of line
//			Thread.sleep(5000);
//			driver.switchTo().alert().accept();     
//			Thread.sleep(2000);
		 
//		 initBrowser("chrome");
			
//			browser.get("https://preproduction.whitecap.com/");
			itc.Utility.ExcelReader reader=new itc.Utility.ExcelReader();
			ExcelReader.Excelstartup("C:\\Users\\kpandey\\workspace\\AppiumTest\\src\\main\\java\\Lib\\TestData.xlsx");


	//		String url=reader.getCellData("EE001", "Url", 2);
			
			String productName=reader.getCellData("EE001", "PName", 2);
			String searchzipCode=reader.getCellData("EE001", "SearchZipCode", 2);
			String uID=reader.getCellData("EE001", "UID",2);
	//		String PW=reader.getCellData("EE001", "Password",2);
			String fName=reader.getCellData("EE001", "FirstName", 2);
			String lName=reader.getCellData("EE001", "LastName", 2);
			String streetAddress=reader.getCellData("EE001", "StreetAddress", 2);
			String cityAddress=reader.getCellData("EE001", "CityAddress", 2);
			String stateName=reader.getCellData("EE001", "StateName", 2);
			String zipCode=reader.getCellData("EE001", "ZipCode", 2);
			String pNumber=reader.getCellData("EE001", "PNumber", 2);
//			String expDate=reader.getCellData("EE001","ExpDate",2);
//			String nameOnCard=reader.getCellData("EE001","NameOnCard",2);
//			String cvvNum=reader.getCellData("EE001","CVVNum",2);
//			String uID2=reader.getCellData("EE001","UID2",2);
//			String password=reader.getCellData("EE001","Password",2);
		 
		 
		 
		 
		 
		//	setElementText(By.id("logonIdentifier"),uID);  
		driver.findElement(By.name("query")).click();
		Thread.sleep(10000);
		setElementText(By.name("query"),productName);  
		Thread.sleep(2000);
		((IOSDriver<IOSElement>) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Go");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click(); 
		Thread.sleep(10);
		driver.findElement(By.xpath("//span[contains(text(),'Sort and Filter')]")).click(); 
		Thread.sleep(10000);
		driver.findElement(By.xpath("//section[@id='product_listing']//section[1]//h4[1]")).click();   //minimize category
		Thread.sleep(10000);       
	    driver.findElement(By.xpath("//section[2]//h4[1]")).click();   //minimize brand
   		Thread.sleep(10000);       
		driver.findElement(By.xpath("//body[@class='menu-active']/div[@class='wrapper']/main/section[@id='product_listing']/div[@class='product-listing__columns-wrap']/aside[@class='sidebar sidebar--left active']/section[@class='filter active']/div[@class='filter__content']/ul[@class='filter__item-list']/li[2]/label[1]/span[1]")).click(); //price under 0 to 25	
		Thread.sleep(10000);
		driver.findElement(By.xpath("//section[@id='product_listing']//section[1]//h4[1]")).click();   //minimize category
		Thread.sleep(10000);
	    driver.findElement(By.xpath("//section[2]//h4[1]")).click();   //minimize brand
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@class='button button--yellow-black-small sidebar__sort-button']")).click();   
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='product-list']//div[1]//form[1]//div[1]//a[1]//img[1]")).click();  ////*[@id='product_listing']/div[2]/section/div[2]/div/div[1]/form/div/a/img
		Thread.sleep(10000);
		
		ScrollDown();
	
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='qty-counter__btn qty-counter__btn--plus']")).click(); //+
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='qty-counter__btn qty-counter__btn--plus']")).click(); //+    //*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='qty-counter__btn qty-counter__btn--minus']")).click();  //-   //*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[1]
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/button")).click(); //Add to cart
		Thread.sleep(10000);
		ScrollUp();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[1]/div[2]/a")).click(); //Click on Location
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user_location_form']/input")).click(); //zip code
		Thread.sleep(10000);
		setElementText(By.xpath("//input[@name='searchZipCode']"),searchzipCode);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user_location_form']/button")).click();  //click on go
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='user_location']/div/div/div[2]/button")).click();   //click on update
		
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/button")).click(); //add to cart
		//Thread.sleep(10000);          
		driver.findElement(By.xpath("//*[@id='minicart']/a/div/span")).click(); //click on cart
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='minicart']/div/div[2]/div[3]/a[1]")).click(); //view cart
		Thread.sleep(50000); 
		ScrollDown();
		Thread.sleep(50000); 
		driver.findElement(By.xpath("//*[@id='cart-page']/div[3]/div[2]/div[1]/div[1]/div/a")).click();         //checkout
		Thread.sleep(50000);        
		       
		driver.findElement(By.id("email-address")).sendKeys(Keys.TAB);
		Thread.sleep(80000);  
		setElementText(By.xpath("//*[@id='email-address']"),uID);
		Thread.sleep(80000);         
		driver.findElement(By.xpath("//*[@id='checkout-page']/div/div[2]/div[1]/div/form/div[3]/div/button")).click();
		Thread.sleep(80000);
		driver.findElement(By.xpath("//*[@id='first-name[Shipping]']")).click();
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='first-name[Shipping]']"),fName);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='last-name[Shipping]']")).click();
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='last-name[Shipping]']"),lName);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='street-address[Shipping]']")).click();
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='street-address[Shipping]']"),streetAddress);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='address-city[Shipping]']")).click();
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='address-city[Shipping]']"),cityAddress);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='state[Shipping]']")).click();
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='state[Shipping]']"),stateName);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='zip-code[Shipping]']")).click();
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='zip-code[Shipping]']"),zipCode);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='phone-number[Shipping]']")).click();
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='phone-number[Shipping]']"),pNumber);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='checkout-page']/div/div[2]/form/div[4]/div[3]/div/button")).click(); //Save and continue
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='receiver-contact']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@id='receiver-contact']")).sendKeys("TEST");
		Thread.sleep(50000);           
		driver.findElement(By.xpath("//*[@id='special-instructions']")).click();
		Thread.sleep(50000);  
		driver.findElement(By.xpath("//span[contains(text(),'Save & Continue')]")).click();
		
		Thread.sleep(50000);          

		driver.findElement(By.id("job-code")).click();
		 Thread.sleep(5000);
	    driver.findElement(By.id("job-code")).sendKeys("123");
	    Thread.sleep(5000);
	    driver.findElement(By.id("po-number")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("po-number")).sendKeys("345");
	    Thread.sleep(5000);
	    driver.findElement(By.id("tax-id")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("tax-id")).sendKeys("5678");
	    Thread.sleep(5000);
	    driver.findElement(By.id("cc-number")).sendKeys(Keys.TAB);
	    Thread.sleep(5000);
	    driver.findElement(By.id("cc-number")).sendKeys("6011000000000004");
	    Thread.sleep(5000);
	    driver.findElement(By.id("exp-date")).sendKeys(Keys.TAB);
	    Thread.sleep(5000);
	    driver.findElement(By.id("exp-date")).sendKeys("12/22");
	    Thread.sleep(5000);
	    driver.findElement(By.id("cc-name")).sendKeys(Keys.TAB);
	    Thread.sleep(5000);
	    driver.findElement(By.id("cc-name")).sendKeys("Test");
	    Thread.sleep(5000);
	    driver.findElement(By.id("cvv-number")).sendKeys(Keys.TAB);
	    Thread.sleep(5000);
	    driver.findElement(By.id("cvv-number")).sendKeys("123");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'Save & Continue')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
	    Thread.sleep(5000);
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
	    
	    
	    
	    Thread.sleep(50000);
		}

	
//	private void initBrowser(String string) {
//		// TODO Auto-generated method stub
//		
//	}
public void ExcelData(){
	
	itc.Utility.ExcelReader reader=new itc.Utility.ExcelReader();
	ExcelReader.Excelstartup("C:\\Users\\kpandey\\workspace\\AppiumTest\\src\\main\\java\\Lib\\TestData.xlsx");


	String url=reader.getCellData("EE001", "Url", 2);
	
	String productName=reader.getCellData("EE001", "PName", 2);
	String searchzipCode=reader.getCellData("EE001", "SearchZipCode", 2);
	String uID=reader.getCellData("EE001", "UID",2);
	String PW=reader.getCellData("EE001", "Password",2);
	String fName=reader.getCellData("EE001", "FirstName", 2);
	String lName=reader.getCellData("EE001", "LastName", 2);
	String streetAddress=reader.getCellData("EE001", "StreetAddress", 2);
	String cityAddress=reader.getCellData("EE001", "CityAddress", 2);
	String stateName=reader.getCellData("EE001", "StateName", 2);
	String zipCode=reader.getCellData("EE001", "ZipCode", 2);
	String pNumber=reader.getCellData("EE001", "PNumber", 2);
	String expDate=reader.getCellData("EE001","ExpDate",2);
	String nameOnCard=reader.getCellData("EE001","NameOnCard",2);
	String cvvNum=reader.getCellData("EE001","CVVNum",2);
	String uID2=reader.getCellData("EE001","UID2",2);
	String password=reader.getCellData("EE001","Password",2);
 
	
	
	
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
		
		
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
				IOSE2E001 obj = new IOSE2E001();

			try {
				obj.setUp();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.ScrollDown();
			obj.ScrollUp();
		//	obj.searchKeyword();
			obj.tearDown();

		}

		
		
	}
	





