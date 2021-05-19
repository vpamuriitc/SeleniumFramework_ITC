package AppiumTest.AppiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
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
import itc.Utility.ExcelReader;

public class IOSExcel_008 extends ExcelReader {

	AppiumDriver<IOSElement> driver;

	public void setUp() throws MalformedURLException, InterruptedException{

		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","iPhone Simulator"); 
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion","12.0");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "safari");
		caps.setCapability("autoGrantPermission",true);
		caps.setCapability("nativeWebTap", true);
		//	caps.setCapability("autoAcceptAlerts", "true");

		driver = new IOSDriver<IOSElement>(new URL("http://"+"SMoulali"+":"+"ef3359e3-2c13-4bce-8e87-ea1383e558ef"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		Thread.sleep(10000);                                                       
		browser.get("https://preproduction.whitecap.com/");

		//		Thread.sleep(5000);
		//		driver.switchTo().alert().accept();
		//		Thread.sleep(5000);
		//		driver.switchTo().alert().accept();
		//		Thread.sleep(5000); 


		//initBrowser("chrome");
		

		//captureScreenShot("Login");
		Thread.sleep(10000);
	//	ExcelReader reader=new ExcelReader();



		itc.Utility.ExcelReader reader=new itc.Utility.ExcelReader();
		ExcelReader.Excelstartup("C:\\Users\\kpandey\\workspace\\AppiumTest\\src\\main\\java\\TestData\\TestData.xlsx");
		//ExcelReader.Excelstartup("\\TestData\\TestData.xlsx");

		String url=reader.getCellData("EE008", "Url", 2);
		String username=reader.getCellData("EE008", "UID",2);
		String password=reader.getCellData("EE008", "PW",2);
		String productName=reader.getCellData("EE008", "Pname", 2);
		String receiverContactName=reader.getCellData("TestDate", "ReceiverConName", 2);
		String changeLine=reader.getCellData("EE008", "Tab", 2);
		String jCode=reader.getCellData("EE008", "JobCode", 2);
		String poNumber=reader.getCellData("EE008", "PO_Num", 2);
		String TaxID=reader.getCellData("EE008", "TaxExemptID", 2);
		String CCNum=reader.getCellData("EE008", "CreditCardNum", 2);
		String expDate=reader.getCellData("EE008","ExpDate",2);
		String nameOnCard=reader.getCellData("EE008","NameOnCard",2);
		String cvvNum=reader.getCellData("EE008","CVVNum",2);
		String uID2=reader.getCellData("EE008","UID2",2);
		//String password=reader.getCellData("EE008","Password",2);
		//String KeyboardValue=reader.getCellData("EE008","Keyvalue",2); 

		//		String =reader.getCellData("EE008","",2);


		driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		Thread.sleep(50000);             
		driver.findElement(By.xpath("//a[@class='button button--login header-dropdown__button']")).click();
		Thread.sleep(50000);

		setElementText(By.id("logonIdentifier"),username);     
		Thread.sleep(1000);


		setElementText(By.id("password"),password);
		Thread.sleep(10000);
		driver.findElement(By.id("next")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//div[@id='user-panel']//i[@class='hd-icon icon-chevron-down']")).click();
		Thread.sleep(10000);		    
		driver.findElement(By.xpath("//a[contains(text(),'Account Review')]")).click();
		Thread.sleep(10000);
		//  new TouchAction(driver).press(115, 650).waitAction(ofSeconds(10000)).moveTo(115, 350).release().perform();   //scroll down
		//   Thread.sleep(10000); 
		ScrollDown();
		Thread.sleep(5000);
		ScrollUp();

		driver.findElement(By.xpath("//input[@placeholder='Search by name, brand, product id…']")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("query")).click();
		Thread.sleep(10000);
		setElementText(By.name("query"), productName);
		//driver.findElement(By.name("query")).sendKeys("139DH3");
		Thread.sleep(10000);
		((IOSDriver<IOSElement>) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Go");
		Thread.sleep(10000);            
		driver.findElement(By.xpath("//img[@class='product__image']")).click();
		Thread.sleep(5000); 

		ScrollDown();

		Thread.sleep(50000); 
		//		MobileElement element = (MobileElement) driver.findElement(MobileBy.xpath("//input[@class='qty-counter__input']"));
		//		element.clear();
		//    driver.findElement(By.xpath("//input[@class='qty-counter__input']")).sendKeys("2");     //adding product
		driver.findElement(By.xpath("//*[@id='product']/div[1]/div[2]/form/div/label/span[2]/div/a[2]")).click(); //adding product
		Thread.sleep(50000);         

		driver.findElement(By.xpath("//button[@class='button button--yellow-black-big']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//div[@class='minicart__close']")).click();
		ScrollUp();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[@class='minicart__cart-count-number']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='button button--grey-dark minicart__checkout']")).click();
		Thread.sleep(10000);
		ScrollDown();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@class='form__small-radio-label select-address__label']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();  //save and continue
		Thread.sleep(10000);
		ScrollDown();
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='receiver-contact']")).click();
		Thread.sleep(10000);

		setElementText(By.xpath("//input[@id='receiver-contact']"),receiverContactName);

		Thread.sleep(5000);
		setElementText(By.xpath("//textarea[@id='special-instructions']"), changeLine);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click(); //save and continue

		setElementText(By.xpath("//input[@id='job-code']"),jCode);
		Thread.sleep(5000);
		setElementText(By.xpath("//input[@id='po-number']"),poNumber);
		Thread.sleep(5000);
		setElementText(By.xpath("//input[@id='tax-id']"),TaxID);
		Thread.sleep(50000);

		setElementText(By.xpath("//*[@id='first-data-payment-field-card']"),CCNum);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-exp']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[@id='first-data-payment-field-exp']"),expDate);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-name']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[@id='first-data-payment-field-name']"),nameOnCard);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-cvv']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[@id='first-data-payment-field-cvv']"),cvvNum);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Save & Continue')]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='button button--green-fullwidth checkout-summary__order-button']")).click();  //place order
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='user-panel__link link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'My Order History')]")).click();
		Thread.sleep(3000);

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
		setElementText(By.xpath("//*[@id='logonIdentifier']"),uID2);
		Thread.sleep(50000);         
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		Thread.sleep(50000);
		setElementText(By.xpath("//*[@id='password']"),password);
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



	//	private void setElementText(By id, String uN) {
	//		// TODO Auto-generated method stub
	//		
	//	}



	//	private void initBrowser(String string) {
	//		// TODO Auto-generated method stub
	//		
	//	}

	//public void EntertoNextLine(){
	//	
	//	int fingers=;
	//	WebElement element;
	//	driver.tap(fingers, element, 1000);
	//	
	//}

	public void ScrollUp(){


		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int starty = (int) (size.height * 0.2);
		int  endy = (int) (size.height * 0.8);
		int startx = size.width / 2;
		// int timedurationMS=10;
		System.out.println("Start ScrollUp operation");
		driver.swipe(startx, starty, startx, endy, 1000);

	}

	public void ScrollDown(){

		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int starty = (int) (size.height * 0.8);
		int  endy = (int) (size.height * 0.2);
		int startx = size.width / 2;
		// int timedurationMS=10;
		System.out.println("Start ScrollDown operation");
		driver.swipe(startx, starty, startx, endy, 1000);


	}

	//	@SuppressWarnings("unused")
	//	private int ofSeconds(int i) {
	//		// TODO Auto-generated method stub
	//		return 0;
	//	}

	public void tearDown() {
		driver.quit();
	}


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		IOSExcel_008 obj = new IOSExcel_008();

		
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
		
		
//		try {
//			obj.setUp();
//			obj.ScrollDown();
//			obj.ScrollUp();
//			//	obj.searchKeyword();
//			obj.tearDown();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


	}

}

