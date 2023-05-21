package mobileTestingPractice.Appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasic extends BaseTest
{
	/*public AppiumDriverLocalService service;
	@BeforeClass 
	public void startServer() {
	    //Set Capabilities
	    DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability("noReset", "false");

	    //Build the Appium service
	    AppiumServiceBuilder builder = new AppiumServiceBuilder();
	    builder.withIPAddress("127.0.0.1");
	    builder.usingPort(4723);
	    builder.withCapabilities(cap);
	    builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
	    builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
*/
	    //Start the server with the 
	//@SuppressWarnings("deprecation")
	@Test
    public void WifiSettingName() {
		 
    	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
    	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	driver.findElement(By.id("android:id/edit")).sendKeys("ayeshWifi");
	driver.findElement(By.id("android:id/button1")).click();
	
	}
}
