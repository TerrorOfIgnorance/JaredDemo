package utils;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileBrowserType;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Drivers {
	
	public static WebDriver driver = null;
	static DesiredCapabilities capability = new DesiredCapabilities();
	public static WebDriver browser (String browser){
		try {
			if(browser.equalsIgnoreCase("androidDevice")){
				  DesiredCapabilities capabilities = new DesiredCapabilities();
				  capabilities.setCapability("deviceName", "Android");
				  capabilities.setCapability("platformName", "Android");
				  capabilities.setCapability("platformVersion", "4.4.4"); 
				  capabilities.setCapability("browserName", "Chrome");
				  driver = new RemoteWebDriver(
				           new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
			}
			if(browser.equalsIgnoreCase("iPhoneSim")){
				  DesiredCapabilities capabilities = new DesiredCapabilities();
			        capabilities.setCapability("browserName", "iOS");
			        capabilities.setCapability("browserName", "safari");
			        capabilities.setCapability("platformVersion", "8.2");
			        capabilities.setCapability("deviceName", "iPhone 6");
			        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
			}
			if(browser.equalsIgnoreCase("androidEmulator")){
				  DesiredCapabilities capabilities = new DesiredCapabilities();
				  capabilities.setCapability("deviceName", "Nexus 6");
				  capabilities.setCapability("platformName", "Android");
				  capabilities.setCapability("platformVersion", "4.4"); 
				  capabilities.setCapability("browserName", MobileBrowserType.BROWSER);
				  driver = new RemoteWebDriver(
				           new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
			}
			else{
				System.out.println("Proper Driver failed to load");
			}			
		}catch (Exception e){
			return null;
		}
		return driver;
	}
}
