package demoqa.interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnitInteractionsTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
    	driver.manage().window().fullscreen();
    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    	String url = "https://demoqa.com/dragabble";
    	driver.navigate().to(url); 
    	
		Draggable srt = new Draggable();
		srt.containerRestrictedText(driver);
	}
}