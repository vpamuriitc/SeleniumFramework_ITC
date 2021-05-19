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
import itc.framework.WebDriverWait;


public class IOSE2E_008 {	
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

		driver = new IOSDriver<IOSElement>(new URL("http://"+"SMoulali"+":"+"ef3359e3-2c13-4bce-8e87-ea1383e558ef"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		Thread.sleep(10000);                                                    
		driver.get("https://preproduction.whitecap.com"); 

		//		Thread.sleep(5000);
		//		driver.switchTo().alert().accept();
		//		Thread.sleep(5000);
		//		driver.switchTo().alert().accept();
		//		Thread.sleep(5000); 
		
			
		//		driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
	Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		Thread.sleep(50000);             
		driver.findElement(By.xpath("//a[@class='button button--login header-dropdown__button']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("logonIdentifier")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("logonIdentifier")).sendKeys("SDeComm19@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("HDSupply19");
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
		driver.findElement(By.name("query")).sendKeys("139DH3");
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
		Thread.sleep(10);
		driver.findElement(By.xpath("//label[@class='form__small-radio-label select-address__label']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click();  //save and continue
		Thread.sleep(10000);
		ScrollDown();
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='receiver-contact']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='receiver-contact']")).sendKeys("Test7");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='special-instructions']")).sendKeys(Keys.TAB);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='button button--blue']")).click(); //save and continue

		driver.findElement(By.xpath("//input[@id='job-code']")).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='po-number']")).sendKeys("345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='tax-id']")).sendKeys("5678");
		Thread.sleep(50000);
		
		
//		driver.findElement(By.id(“textboxID”)).click();
//		driver.getKeyboard().sendKeys(“Poonam”);
		
		
//		driver.findElement(By.xpath("//div[@id='cc-number']")).sendKeys("4111111111111111");
//		driver.findElement(By.xpath("//div[@id='cvv-number']")).sendKeys("123");
		//driver.findElement(By.xpath("//h2[contains(text(),'Pay by credit card')]")).sendKeys(Keys.TAB);
		//Thread.sleep(5000);
		
	//	 Thread.sleep(50000);
		
	//	  Thread.sleep(10000);
		driver.findElement(By.id("first-data-payment-field-card")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("first-data-payment-field-card")).click();
		Thread.sleep(50000);
		
		driver.getKeyboard().sendKeys("4111111111111111");
		
	//	Thread.sleep(50000);       //*[@id="cc-number"]
	//	driver.findElement(By.xpath("//*[@id='checkout-page']/div/div[2]/div[3]/form/div[2]/div[1]/div[2]/div[1]/div[1]")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-card']")).sendKeys("4111111111111111");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-exp']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-exp']")).sendKeys("12/22");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-name']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-name']")).sendKeys("Test6");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-cvv']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='first-data-payment-field-cvv']")).sendKeys("123");
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
		driver.quit();

	}

//	public static void captureOutput(By locator, String variable) throws Exception{
//		WebDriverWait wait = new WebDriverWait(browser, 30);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		String value = (String) element.getText().subSequence(14, 20);
//		setValue(variable, value);
//	}
	public static String captureOutputFromAField(By locator) throws Exception{
		WebDriverWait wait = new WebDriverWait(browser, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String value = (String) element.getText();
		return value;
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
		IOSE2E_008 obj = new IOSE2E_008();

		obj.setUp();
		obj.ScrollDown();
		obj.ScrollUp();
		//	obj.searchKeyword();
		obj.tearDown();

	}

}

