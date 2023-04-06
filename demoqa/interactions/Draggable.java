package demoqa.interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public void simpleDrag(WebDriver driver) {
		
		WebElement draggable = driver.findElement(By.id("dragBox"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(draggable).clickAndHold().moveByOffset(100, 2).release().perform();
	}
	
	public void xaxisRestrictedDrag(WebDriver driver) {
		
		driver.findElement(By.id("draggableExample-tab-axisRestriction")).click();
		
		WebElement draggable = driver.findElement(By.id("restrictedX"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(draggable).clickAndHold().moveByOffset(100, 0).release().perform();
		
	}
	
	public void yaxisRestrictedDrag(WebDriver driver) {
		
		driver.findElement(By.id("draggableExample-tab-axisRestriction")).click();
		
		WebElement draggable = driver.findElement(By.id("restrictedY"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(draggable).clickAndHold().moveByOffset(0, 250).release().perform();
		
	}
	
	public void containerRestrictedBox(WebDriver driver) {
		
		driver.findElement(By.id("draggableExample-tab-containerRestriction")).click();
		
		WebElement draggable = driver.findElement(By.cssSelector("#containmentWrapper .draggable.ui-widget-content.ui-draggable.ui-draggable-handle"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(draggable).clickAndHold().moveByOffset(500, 200).release().perform();
		
	}
	
	public void containerRestrictedText(WebDriver driver) {
		
		driver.findElement(By.id("draggableExample-tab-containerRestriction")).click();
		
		WebElement draggable = driver.findElement(By.cssSelector(".draggable.ui-widget-content.m-3 span"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(draggable).clickAndHold().moveByOffset(20, 100).release().perform();
		
	}	
}
