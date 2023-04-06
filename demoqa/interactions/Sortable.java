package demoqa.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public void sortByList(WebDriver driver) {
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='demo-tabpane-list']//*[@class='list-group-item list-group-item-action']"));
		
		WebElement source = null, target = null;
		
		for(WebElement e: element) {
			if(e.getText().equals("One")) source = e;
			if(e.getText().equals("Six")) target = e;
		}
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(source).moveToElement(target) .release().perform();
		
	}
	
	public void sortByGrid(WebDriver driver) {
		
		driver.findElement(By.id("demo-tab-grid")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='demo-tabpane-grid']//*[@class='list-group-item list-group-item-action']"));
		
		WebElement source = null, target = null;
		
		for(WebElement e: element) {
			if(e.getText().equals("One")) source = e;
			if(e.getText().equals("Six")) target = e;
		}
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(source).moveToElement(target) .release().perform();
		
	}
	
}
