package demoqa.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrame {

	public void accessParentFrameContent(WebDriver driver) {
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("body")).getText());
	}
	
	public void accessChildFrameContent(WebDriver driver) {
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		System.out.println(driver.findElement(By.tagName("p")).getText());
	}
	
}
