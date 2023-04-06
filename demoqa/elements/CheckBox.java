package demoqa.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	
	public void checkAll(WebDriver driver) {
		
		driver.findElement(By.className("rct-checkbox")).click();
		driver.findElement(By.className("rct-option")).click();
	}
	
	public void checkParticularBox(WebDriver driver,String option) {
		
		driver.findElement(By.className("rct-option")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='rct-title']"));

		for(int i=0;i<list.size();i++) {
			
			if(option.equals(list.get(i).getText())) {
				list.get(i).click();
				String result = driver.findElement(By.id("result")).getText();
				System.out.println(result);
				break;
			}
			
		}
		
	}	
	
	public void uncheckParticularBox(WebDriver driver,String option) {
		checkAll(driver);
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='rct-title']"));
		
		for(int i=0;i<list.size();i++) {
			
			if(option.equals(list.get(i).getText())) {
				list.get(i).click();
				break;
			}
			
		}
	}
}



//WebElement element = driver.findElement(By.id("tree-node-home"));
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//wait.until(ExpectedConditions.visibilityOf(element));