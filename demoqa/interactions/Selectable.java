package demoqa.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selectable {

	public void selectByList(WebDriver driver) {
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='verticalListContainer']//li"));
		
		for(WebElement e : element) {
			e.click();
		}
		
	}
	
	public void selectByGrid(WebDriver driver) {
		
		driver.findElement(By.id("demo-tab-grid")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='gridContainer']//li"));
		
		
		for(WebElement e : element) {
			e.click();
		}
		
	}
	
}
