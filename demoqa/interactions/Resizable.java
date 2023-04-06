package demoqa.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public void resize(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath("/*[@id='resizable']//span"));
		
		Dimension initialSize = element.getSize();
	
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).moveByOffset(300, 300).release().perform();
		
		Dimension finalSize = element.getSize();
		
		System.out.println(initialSize+" "+finalSize);
		
		if (finalSize.getWidth() > initialSize.getWidth() || finalSize.getHeight() > initialSize.getHeight()) {
		    System.out.println("Element has been successfully resized.");
		} else {
		    System.out.println("Element could not be resized.");
		}
		
	}
	
}