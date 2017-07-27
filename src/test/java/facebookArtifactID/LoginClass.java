package facebookArtifactID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
 
public class LoginClass {
	
	private WebDriver driver;
	  protected static DesiredCapabilities dCaps;
	  
	@Test
	public void facebookLogisnProcedure(){
/*		 driver = new FirefoxDriver();
		System.out.println("Test is Execution Started !!!!!!!!!!!");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Girish");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Test is Execution Completed !!!!!!!!!!");
		driver.quit();
		System.out.println("Browser get Close....!!!!");*/
		

		  dCaps = new DesiredCapabilities();
		  dCaps.setJavascriptEnabled(true);
		dCaps.setCapability("takesScreenshot", false);
		  
		  driver = new PhantomJSDriver(dCaps);

		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		System.out.println("URL is Opened.>>>>>>>>>!!");
		 
		driver.findElement(By.name("email")).isEnabled();
		System.out.println("Sending the data to email Field");
		WebElement Email = driver.findElement(By.name("email"));
			Email.sendKeys("girish");
		
		System.out.println("Value enterd in NAME File.....>>>!");
		driver.findElement(By.name("pass")).sendKeys("abc");
		System.out.println("Password is entered .............!!!!!!!");
		driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
		
		System.out.println("Test is Execution Completed !!!!!!!!!!");
		driver.quit();
		System.out.println("Browser get Close....!!!!");
			
	}
}
