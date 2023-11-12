package Demo_Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class doubletabandlongpress {
	
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
				
				driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Swipe\"]/android.widget.TextView[2]")).click();
				
				Thread.sleep(2000);
			
				RemoteWebElement doubleTapMe = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("button-LOGIN"));

				driver.executeScript("gesture: doubleTap", ImmutableMap.of("elementId", doubleTapMe.getId()));
				
				Thread.sleep(2000);
				
				RemoteWebElement LongPress = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
			
				driver.executeScript("gesture: longPress", ImmutableMap.of("elementId", LongPress.getId(), "pressure", 5.0, "duration", 8000));
		}


}
