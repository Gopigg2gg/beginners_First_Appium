package Demo_Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class longpress_draganddrop {
	
	
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
		

		
		
		
			
      }

}
