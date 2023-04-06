package demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public void doubleClick(WebDriver driver) {
		
		WebElement web = driver.findElement(By.id("doubleClickBtn"));
    	Actions actions = new Actions(driver);
        actions.doubleClick(web).perform();
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
	}
	
	public void rightClick(WebDriver driver) {
		
		WebElement web = driver.findElement(By.id("rightClickBtn"));
    	Actions actions = new Actions(driver);
        actions.contextClick(web).perform();
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
	}
	
	public void dynamicClick(WebDriver driver) {
		
		WebElement web = driver.findElement(By.xpath("//*[text()='Click Me']"));
    	web.click();
    	System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
	}
	
}
