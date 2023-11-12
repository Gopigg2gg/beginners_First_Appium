package Demo_Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class click_sendkeys_gettext_Assert {
	
	
		
		public static void main (String[] args) throws MalformedURLException, InterruptedException 
			
			{
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability ("deviceName" ,"Vivo");
				cap.setCapability ("udid", "547f58b9");
				cap.setCapability ("platformName" , "Android");
				cap.setCapability ("platformVersion" , "13");
				cap.setCapability ("appPackage","io.appium.android.apis");
				cap.setCapability ("appActivity",".ApiDemos");
				cap.setCapability("automationName", "UiAutomator);
				
				AndroidDriver driver = new AndroidDriver (new URL ("http://127.0.0.1:4723/"),cap);
				
				// Click Action
				WebElement clicktext = driver.findElement(AppiumBy.accessibilityId(""));
				clicktext.click();
				System.out.print("passed");
				
				// get text and assert values
				 WebElement clicktext1 = driver.findElement(AppiumBy.accessibilityId("App"));
				String get= clicktext1.getText();
				System.out.print(get);
				Assert.assertEquals(get, "Animation");
				
				// Send values
				 driver.findElement(AppiumBy.accessibilityId("App"));
				 driver.findElement(AppiumBy.accessibilityId("Search"));
				 driver.findElement(AppiumBy.accessibilityId("Invoke Search"));
	
					WebElement sendtext = driver.findElement(AppiumBy.accessibilityId(""));
				sendtext.sendKeys("tamil");
				
				
		      }
	
	

}
