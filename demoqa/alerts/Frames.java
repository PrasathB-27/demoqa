package demoqa.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Frames {

	public void firstFrame(WebDriver driver) {
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText()+" - This Text from frist frame");
	}
	
	public void secondFrame(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText()+" - This Text from second frame");
	}
}
