package demoqa.bookapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitBookAppTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
		
			System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
			
			WebDriver driver = new FirefoxDriver();
	    	driver.manage().window().fullscreen();
	    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	    	String url = "https://www.youtube.com";
	    	driver.navigate().to(url); 
	    	
	    	WebElement search = driver.findElement(By.cssSelector("#search-input #search"));
	    	
	    	Actions action = new Actions(driver); 
	    	action.click();
	    	action.moveToElement(search).click().sendKeys("How to run cucumber").build().perform();
	    	
	    	driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
	    	
//	    	driver.findElement(By.id("userName")).sendKeys("prasathb27");
//	    	driver.findElement(By.id("password")).sendKeys("!Prasath27");
//	    	
//	    	driver.findElement(By.id("login")).click();
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
    	
		
	}

}
