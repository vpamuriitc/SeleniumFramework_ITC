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


public class IOSE2E0011 {

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
		//	caps.setCapability("autoAcceptAlerts", "true");
			
			 driver = new IOSDriver<IOSElement>(new URL("http://"+"SrujanaN"+":"+"cdda377f-6662-4be0-8e56-b9d16c7f06b4"+"@ondemand.saucelabs.com:80/wd/hub"), caps);
			 Thread.sleep(10000);                                                      //87343e1cd61740e095eaeb7e13b9fe9d   794e8581-b151-423e-8d3f-b30d740d0595
			 driver.get("https://preproduction.whitecap.com"); 
				
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
			
				                         
			driver.findElement(By.xpath("//*[@id='user-panel']/a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='user_account']/div[1]/a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='logonIdentifier']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='logonIdentifier']")).sendKeys("ABeComm19@gmail.com");
			Thread.sleep(50000);         
			driver.findElement(By.id("password")).sendKeys(Keys.TAB);
			Thread.sleep(50000);
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("HDSupply19");
			Thread.sleep(10000);
			 driver.findElement(By.id("next")).click(); //signin
			 Thread.sleep(10000);

			 driver.findElement(By.cssSelector(".applied")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.linkText("Accounts")).click();
			   // Thread.sleep(3000);
			   
			   
			    driver.findElement(By.cssSelector(".form__selectbox")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector("option")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.name("query")).click();
			    driver.findElement(By.name("query")).sendKeys("Washers");//product search
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".search__submit:nth-child(3) > .hd-icon")).click();
			   // Thread.sleep(3000);
			   
			   
			    driver.findElement(By.cssSelector(".filter__item:nth-child(5) > .filter__link")).click();//category filter
			   // Thread.sleep(3000);
			    driver.findElement(By.linkText("#10 Zinc Plated SAE Washer 100/Pack")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.linkText("+")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".button--yellow-black-big")).click();//add to cart
			   // Thread.sleep(3000);
			    driver.navigate().back();
			   // Thread.sleep(3000); 
			    driver.findElement(By.linkText("#8 Zinc Plated SAE Washer 100/Pack")).click();
			    driver.findElement(By.linkText("+")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".button--yellow-black-big > span")).click();//add to cart
			    driver.navigate().back();
			    driver.findElement(By.linkText("3/8\" Zinc Cut Washer 100/Box")).click();
			    driver.findElement(By.linkText("+")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".button--yellow-black-big > span")).click();//add to cart
			    
			    driver.findElement(By.linkText("View Cart")).click();//view cart
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".user-panel__item--location > .user-panel__link > .hd-icon")).click();
			    driver.findElement(By.name("searchZipCode")).click();
			    //Thread.sleep(3000);
			    driver.findElement(By.name("searchZipCode")).sendKeys("32805");
			    //Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".search__submit:nth-child(2) > .hd-icon")).click();//search
			    Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".button--small > span")).click();//update
			    
			    driver.findElement(By.id("promo-input")).click();
			    driver.findElement(By.id("promo-input")).sendKeys("ORDER40");//promo code
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".button--black-small > span")).click();//apply
			   // Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".cart__checkout-button > span")).click();//checkout
			   // Thread.sleep(3000);
			   
			    driver.findElement(By.cssSelector(".select-address__add-label")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.id("first-name[Shipping]")).click();
			    driver.findElement(By.id("first-name[Shipping]")).sendKeys("FIRST1");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("last-name[Shipping]")).click();
			    driver.findElement(By.id("last-name[Shipping]")).sendKeys("LAST1");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("street-address[Shipping]")).click();
			    driver.findElement(By.id("street-address[Shipping]")).sendKeys("Mehcanic Street");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("address-city[Shipping]")).click();
			    driver.findElement(By.id("address-city[Shipping]")).sendKeys("Orlando");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("state[Shipping]")).click();  
			    driver.findElement(By.id("state[Shipping]")).sendKeys("Florida");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("zip-code[Shipping]")).click();
			    driver.findElement(By.id("zip-code[Shipping]")).sendKeys("32805");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("phone-number[Shipping]")).click();
			    driver.findElement(By.id("phone-number[Shipping]")).sendKeys("5674386753");
			   // Thread.sleep(3000);
//			    driver.findElement(By.xpath("//label[@class='form__checkbox-label checkout__same-address']")).click();
			    driver.findElement(By.cssSelector(".form__checkmark")).click();
			    
			    boolean Ele1;
			    do{
			   		Ele1=  driver.findElement(By.cssSelector(".button--blue")).isEnabled();
			   		if(Ele1==true)
			   		{
			   			
			   			 driver.findElement(By.cssSelector(".button--blue")).click();
			   			
			   		}	
			   		}while(Ele1==false);
			   // Thread.sleep(3000);
//			    driver.findElement(By.xpath("//a[contains(text(),'Change Billing Address')]")).click();
			    
			    driver.findElement(By.id("first-name[Billing]")).click();
			    driver.findElement(By.id("first-name[Billing]")).sendKeys("FIRST_1");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("last-name[Billing]")).click();
			    driver.findElement(By.id("last-name[Billing]")).sendKeys("LAST_1");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("street-address[Billing]")).click();
			    driver.findElement(By.id("street-address[Billing]")).sendKeys("117 Arch Street ");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("address-city[Billing]")).click();
			    driver.findElement(By.id("address-city[Billing]")).sendKeys("Far Rockaway");   
			   // Thread.sleep(3000);
			    driver.findElement(By.id("state[Billing]")).click();   
			    driver.findElement(By.id("state[Billing]")).sendKeys("New York");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("zip-code[Billing]")).click();
			    driver.findElement(By.id("zip-code[Billing]")).sendKeys("11691");
			   // Thread.sleep(3000);
			    driver.findElement(By.id("phone-number[Billing]")).click();
			    driver.findElement(By.id("phone-number[Billing]")).sendKeys("3465778899");
			   // Thread.sleep(3000);
//			    driver.findElement(By.cssSelector(".button--blue")).click();
			   // Thread.sleep(3000);
			    boolean Ele2;
			    do{
			   		Ele2=  driver.findElement(By.cssSelector(".button--blue")).isEnabled();
			   		if(Ele2==true)
			   		{
			   			
			   			 driver.findElement(By.cssSelector(".button--blue")).click();
			   			
			   		}	
			   		}while(Ele2==false);
			  
			    driver.findElement(By.cssSelector(".checkout__rates-row:nth-child(3) .form__small-radio-label:nth-child(2) > .form__small-radio-marker")).click();
			   // Thread.sleep(3000);
			    driver.findElement(By.id("receiver-contact")).click();
			    //Thread.sleep(3000);
			    driver.findElement(By.id("receiver-contact")).sendKeys("Test10");		    
//			    Thread.sleep(2000);
//			    driver.findElement(By.cssSelector(".button--blue > span")).click();
			    boolean Ele;
			    do{
			   		Ele=  driver.findElement(By.cssSelector(".button--blue")).isEnabled();
			   		if(Ele==true)
			   		{
			   			
			   			 driver.findElement(By.cssSelector(".button--blue")).click();
			   			
			   		}	
			   		}while(Ele==false);
			    
			  //new code
			    WebElement ele1 = driver.findElement(By.id("first-data-payment-field-card"));
			   	driver.switchTo().frame(ele1);
			   	driver.findElement(By.id("card")).sendKeys("4111111111111111");
			   	driver.switchTo().defaultContent();
			   	//driver.findElement(By.id("card")).sendKeys(CARD_NUMBER);
			   	WebElement ele2 = driver.findElement(By.id("first-data-payment-field-exp"));
			   	driver.switchTo().frame(ele2);
			   	driver.findElement(By.id("exp")).sendKeys("12/22");
			   	driver.switchTo().defaultContent();
			   	WebElement ele3 = driver.findElement(By.id("first-data-payment-field-name"));
			   	driver.switchTo().frame(ele3);
			   	driver.findElement(By.id("name")).sendKeys("Test9");
			   	driver.switchTo().defaultContent();
			   	WebElement ele4 = driver.findElement(By.id("first-data-payment-field-cvv"));
			   	driver.switchTo().frame(ele4);
			   	driver.findElement(By.id("cvv")).sendKeys("123");
			   	driver.switchTo().defaultContent();
			    
			   driver.findElement(By.cssSelector(".checkout__section-body:nth-child(2)")).click();  
			    //Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".button--blue > span")).click();    
			    boolean Ele3;
			    do{
			   		Ele3=  driver.findElement(By.cssSelector(".button--green-fullwidth")).isEnabled();
			   		if(Ele3==true)
			   		{
			   			
			   			 driver.findElement(By.cssSelector(".button--green-fullwidth")).click();
			   			
			   		}	
			   		}while(Ele3==false);
			    
			    driver.findElement(By.cssSelector("#user-panel > .user-panel__link > .hd-icon")).click();
			    //Thread.sleep(3000);
			    driver.findElement(By.linkText("My Order History")).click();
			    //Thread.sleep(3000);
			    driver.findElement(By.xpath("//*[@id=\"account-page\"]/div/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/a")).click();
			    //Thread.sleep(3000);
			    driver.findElement(By.cssSelector("#user-panel > .user-panel__link > .hd-icon")).click();
			    //Thread.sleep(3000);
			    driver.findElement(By.linkText("My Invoices/Statements")).click();
			    //Thread.sleep(3000);
//			    driver.findElement(By.linkText("View your invoices and statements here")).click();
			  
			    driver.findElement(By.linkText("Log out")).click();
			 
			 
			 
			 
			 
			 
			 
			 






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
	IOSE2E0011 obj = new IOSE2E0011();
	
	obj.setUp();
//	obj.searchKeyword();
	obj.tearDown();

}}