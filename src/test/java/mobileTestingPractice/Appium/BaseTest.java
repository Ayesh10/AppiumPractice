package mobileTestingPractice.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public static AppiumDriverLocalService service;
	public static AndroidDriver driver;
	@BeforeClass
	public void configAppium() throws MalformedURLException {
	 service=new AppiumServiceBuilder()
			.withAppiumJS(new File("C:\\Users\\ayesh\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
			.withIPAddress("127.0.0.1").usingPort(4723).build();
	//service.start();
		
		UiAutomator2Options option=new UiAutomator2Options();
		option.setDeviceName("AyeshTryEmulator");
		File apiDemoLocation= new File("./APKFiles/resources/ApiDemos-debug.apk");
		String apiDemoLocationPath = apiDemoLocation.getAbsolutePath();
		option.setApp(apiDemoLocationPath);
		System.out.println(apiDemoLocationPath);		
		driver=new AndroidDriver(new URL ("http://127.0.0.1:4723"), option);
	}
	@AfterClass
public void tearDown() {
	//service.close();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
driver.quit();	
}
}