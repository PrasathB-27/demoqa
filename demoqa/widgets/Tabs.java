package demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tabs {

	public void activeTabs(WebDriver driver,String tab) {
		String tabId = "demo-tab-"+tab;
		driver.findElement(By.id(tabId)).click();
		
		String content = "demo-tabpane-"+tab;
		String text = driver.findElement(By.id(content)).getText();
		
		System.out.println(text);
	}
	
	public void inactiveTab(WebDriver driver) {
		
		WebElement element = driver.findElement(By.id("demo-tab-more"));
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].setAttribute('class', 'nav-item nav-link');", element);
		
//		element.click();
		
		System.out.println(element.getText());
	}
	
}
//tooltip-inner