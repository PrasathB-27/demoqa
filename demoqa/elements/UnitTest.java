package demoqa.elements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class UnitTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
		
		FirefoxOptions profile = new FirefoxOptions();
		profile.addPreference("layout.css.devPixelsPerPx", "1.5");

		WebDriver driver = new FirefoxDriver(profile);
		
		Scanner sc = new Scanner(System.in);
    	
    	driver.manage().window().fullscreen();
    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    	
    	String str = "https://demoqa.com/automation-practice-form";
    	driver.navigate().to(str); 
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='10%'");
    	
    	sc.close();
	}

}