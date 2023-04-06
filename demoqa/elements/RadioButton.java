package demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public void yesClick(WebDriver driver) {
		WebElement radioButton = driver.findElement(By.id("yesRadio"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radioButton).click().perform();
		String text = driver.findElement(By.className("mt-3")).getText();
		
		System.out.println(text);
		
	}
	
	public void noClick(WebDriver driver) {
		WebElement radioButton = driver.findElement(By.id("noRadio"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].disabled = false; arguments[0].click();", radioButton);
		
		System.out.println("You have selected disabled button No");
	}

	public void impressiveClick(WebDriver driver) {
		WebElement radioButton = driver.findElement(By.id("impressiveRadio"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radioButton).click().perform();
		String text = driver.findElement(By.className("mt-3")).getText();
		
		System.out.println(text);
	}
	
}
