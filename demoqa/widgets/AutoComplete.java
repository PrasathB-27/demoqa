package demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	public void multipleColorNames(WebDriver driver,String[] colors) {
		
		WebElement multiPickList = driver.findElement(By.id("autoCompleteMultipleContainer"));
		
		Actions actions = new Actions(driver);
		actions.click();
		
		for(String clr : colors) {
			actions.moveToElement(multiPickList).click().sendKeys(clr).build().perform();
			WebElement colorOption = driver.findElement(By.xpath("//*[contains(@id,'react-select-2-option')]"));
			colorOption.click();
			
		}
		
	}
	
	public void singleColorName(WebDriver driver,String color) {
		
		WebElement multiPickList = driver.findElement(By.id("autoCompleteSingleContainer"));
		
		Actions actions = new Actions(driver);
		actions.click();
		actions.moveToElement(multiPickList).click().sendKeys(color).build().perform();
		WebElement colorOption = driver.findElement(By.xpath("//*[contains(@id,'react-select-3-option')]"));
		colorOption.click();
		
	}
	
}
