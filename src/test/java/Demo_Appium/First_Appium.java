package Demo_Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class First_Appium {
	
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

//		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
//		WebElement getName = driver.findElement(AppiumBy.accessibilityId("Animation"));
//		String text = getName.getText();
//		Assert.assertEquals(text, "Animation");
//	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Search\"]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Invoke Search")).click();
		
		WebElement test = driver.findElement(AppiumBy.id("io.appium.android.apis:id/txt_query_appdata"));
		  
		 test.sendKeys("tamil");

		
		
		
}


     }
