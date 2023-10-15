package Demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OneTest {
	WebDriver driver;
	
	@Test
	public void mOne() {
		System.out.println("m1 Executed");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String actualText = driver.findElement(By.id("pah")).getText();
	    Assert.assertEquals(actualText , "PracticeAutomationHere");
	    
	}
     
	@AfterMethod
     public void closre() {
    	driver.close(); 
     }

}
