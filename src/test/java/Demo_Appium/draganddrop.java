package Demo_Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class draganddrop {
	
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
			
				RemoteWebElement source = (RemoteWebElement) driver.findElement((AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"drag-l2\"]/android.widget.ImageView")));

				RemoteWebElement destination = (RemoteWebElement)driver.findElement((AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"drop-l2\"]/android.view.ViewGroup")));
				driver.executeScript("gesture: dragAndDrop", ImmutableMap.of("sourceId", source.getId(), "destinationId", destination.getId()));
				
		}

}
