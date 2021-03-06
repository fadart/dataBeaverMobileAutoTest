package appiumTest.TestCase;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import appiumTest.base.TestBase;
import io.appium.java_client.MobileElement;


public class loginTest extends TestBase {

	@Rule
    public TestWatcher watcher = Factory.createWatcher();
	
	
	
	@Test
	public void ValidLoginTest() throws IOException, InterruptedException {

		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		log.info("App opened");
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("email_TEXT"));
		log.info("user email passed into text box");
		
		
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("password_TEXT"));
		log.info("user password passed into text box");
		
		driver.findElement(By.xpath(OR.getProperty("loginBtn_XPATH"))).click();
		log.info("log in button clicked");
		
		Thread.sleep(3000);

			
		log.info("Login is successful");

	}
}
