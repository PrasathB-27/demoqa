package demoqa.bookapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
		
			System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
			
			WebDriver driver = new FirefoxDriver();
	    	driver.manage().window().fullscreen();
	    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	    	String url = "https://demoqa.com/login";
	    	driver.navigate().to(url); 
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
    	
		
	}

}
