package demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public void slide(WebDriver driver) {
		
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		Actions moveSlider = new Actions(driver);
		moveSlider.dragAndDropBy(slider, 10, 0).build().perform();
	}
	
}
