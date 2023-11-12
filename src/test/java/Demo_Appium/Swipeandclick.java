package Demo_Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Swipeandclick {

public static void main (String[] args) throws MalformedURLException, InterruptedException 
	
	{
	      UiAutomator2Options options = new UiAutomator2Options();
	       options.setUdid("547f58b9");
	       options.setDeviceName ("Vivo");
	       options.setAppPackage("io.appium.android.apis");
	       options.setAppActivity(".ApiDemos");       
	       options.setPlatformName("Android");
	       options.setPlatformVersion("13");
	       options.setAutomationName("uiautomator2");
	      
			AndroidDriver driver = new AndroidDriver(new URL ("http://127.0.0.1:4723"),options);
			
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();


			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"WebView\"));")).click();
			
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
			
			
			Thread.sleep(2000);

		
			
		
	}
}
