package demoqa.widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTips {

	public void hoverOverButton(WebDriver driver) {
		
		hoverOverButtonOrTextBox(driver,"toolTipButton");
	}
	
	public void hoverOverTextBox(WebDriver driver) {
		
		hoverOverButtonOrTextBox(driver,"toolTipTextField");
	}
	
	private void hoverOverButtonOrTextBox(WebDriver driver,String id) {
		
		WebElement button = driver.findElement(By.id(id));
		Actions actions = new Actions(driver);
		actions.moveToElement(button).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.attributeToBeNotEmpty(button, "aria-describedby"));

		
		String tooltipText = driver.findElement(By.id(button.getAttribute("aria-describedby"))).getText();
		System.out.println(tooltipText);
	}
	
	public void hoverOverText(WebDriver driver,String value) {
		
		String xpath = "//a[text()='"+value+"']"; 
		
		WebElement button = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(button).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.attributeToBeNotEmpty(button, "aria-describedby"));

		
		String tooltipText = driver.findElement(By.id(button.getAttribute("aria-describedby"))).getText();
		System.out.println(tooltipText);
		
	}
}
