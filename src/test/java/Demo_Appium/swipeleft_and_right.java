package Demo_Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class swipeleft_and_right {
	
	
	
	public static void main (String[] args) throws MalformedURLException, InterruptedException 
	
	 {
		      UiAutomator2Options options = new UiAutomator2Options();
		       options.setUdid("547f58b9");
		       options.setDeviceName ("Vivo");
		       options.setAppPackage("com.wdiodemoapp");
		       options.setAppActivity("com.wdiodemoapp.MainActivity");       
		       options.setPlatformName("Android");
		       options.setPlatformVersion("13");
		       options.setAutomationName("uiautomator2");
		      
				AndroidDriver driver = new AndroidDriver(new URL ("http://127.0.0.1:4723"),options);
				
				driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Drag\"]/android.widget.TextView")).click();
				Thread.sleep(2000);
				
				RemoteWebElement carousel = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Carousel"));

				driver.executeScript("gesture: swipe", ImmutableMap.of("elementId", carousel.getId(), "percentage", 50, "direction", "left"));
				
				
				RemoteWebElement carousel1 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Carousel"));

				driver.executeScript("gesture: swipe", ImmutableMap.of("elementId", carousel1.getId(), "percentage", 50, "direction", "right"));
				
		}
	}


