package demoqa.widgets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Menu {

	public void accessMainItem(WebDriver driver) {
		
		WebElement currentElement = driver.findElement(By.xpath("//*[@id='nav']//*[text()='Main Item 2']")); 
		
		Actions actions = new Actions(driver);
		actions.moveToElement(currentElement).build().perform();
		
		WebElement parentElement = currentElement.findElement(By.xpath("./.."));
		
		List<WebElement> childElements = parentElement.findElements(By.xpath("./*"));
		int currentIndex = childElements.indexOf(currentElement);
		
		WebElement nextSibling = childElements.get(currentIndex + 1);
		
		System.out.println(nextSibling.getText());
		
	}
	
	public void accessSubItems(WebDriver driver) {
		
		WebElement currentElement = driver.findElement(By.xpath("//*[@id='nav']//*[text()='Main Item 2']")); 
		
		Actions actions = new Actions(driver);
		actions.moveToElement(currentElement).build().perform();
		
		WebElement parentElement = currentElement.findElement(By.xpath("./.."));
		
		List<WebElement> childElements = parentElement.findElements(By.xpath("./ul/li"));
		
		for(WebElement element:childElements) {
			
			if(element.getText().equals("SUB SUB LIST »")) {
				actions.moveToElement(element).build().perform();
				System.out.println(element.getText());
			}
			
			
		}
		
	}
}
