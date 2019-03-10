package VTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class VV{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		String deviceName = "VCan";
		String platformVersion = "4.4.2";
		String apkName = "微博.apk";
		String appActivity = "com.sina.weibo.SplashActivity";
		String AppiumServerIP = "http://127.0.0.1:4723/wd/hub";
		AndroidDriver driver;
		File apk = new File(System.getProperty("user.dir")+File.separator+"apps"+File.separator+apkName);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformVersion", platformVersion);
		capabilities.setCapability("app", apk);
		capabilities.setCapability("appActivity", appActivity);
		capabilities.setCapability("noSign", true);
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		Thread.sleep(3000);
		System.out.println("App启动等待时间");
		Thread.sleep(4000);
		driver.findElementById("com.sina.weibo:id/plus_icon").click();
		driver.findElementById("com.sina.weibo:id/pop_control_bar_front_close_img").click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
