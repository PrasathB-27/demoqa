package demoqa.alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserWindow {
	
	public void newTabClick(WebDriver driver) {
		
		driver.findElement(By.id("tabButton")).click();
		driver.navigate().to("https://demoqa.com/sample"); 
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		
	}
	
	public void newWindowClick(WebDriver driver) {
			
		driver.findElement(By.id("windowButton")).click();
		driver.navigate().to("https://demoqa.com/sample"); 
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		
	}
	
	public void newWindowMessageClick(WebDriver driver) {
		
		driver.findElement(By.id("messageWindowButton")).click();

		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
		    driver.switchTo().window(handle);
		}
		
		String bodyText = driver.findElement(By.tagName("body")).getText();
		System.out.println(bodyText);
		
	}
}
