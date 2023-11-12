package Demo_Appium;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class touchaction_tab {
	
	
		
		public static void main (String[] args) throws MalformedURLException, InterruptedException 
			
			{
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability ("deviceName" ,"Vivo");
				cap.setCapability ("udid", "547f58b9");
				cap.setCapability ("platformName" , "Android");
				cap.setCapability ("platformVersion" , "13");
				cap.setCapability ("appPackage","io.appium.android.apis");
				cap.setCapability ("appActivity",".ApiDemos");
				cap.setCapability("automationName", "UiAutomator2");
				
				AndroidDriver driver = new AndroidDriver (new URL ("http://127.0.0.1:4723/"),cap);
//				
//				MobileElement clicktext = driver.findElementByAccessibilityId("Animation");
//				TouchAction t1 = new TouchAction(driver);
//				t1.tap(TapOptions.tapOptions().withElement(element(clicktext))).perform();
					
		      }


}