package demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link {
	
	public void openLink(WebDriver driver) {
		
		WebElement web = driver.findElement(By.linkText("Home"));
    	web.click();
    	System.out.println("Navigated to Home page by clicking openLink");
	}
	
	public void openDynamicLink(WebDriver driver) {
		
		WebElement web = driver.findElement(By.partialLinkText("Home"));
		web.click();
		System.out.println("Navigated to Home page by clicking openDynamicLink");
	}
	
	public void apiCall(WebDriver driver,String api) {
		
		WebElement apiCall = driver.findElement(By.id(api));
		apiCall.click();
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
	}
	
}
