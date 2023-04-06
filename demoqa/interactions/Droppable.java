package demoqa.interactions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public void dragAndDrop(WebDriver driver,WebElement draggable,WebElement droppable) {
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(draggable, droppable).build().perform();

		String textAfterDrop = droppable.getText();
		System.out.println(textAfterDrop);

		
	}
	
	public void simpleDragAndDrop(WebDriver driver) {
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		dragAndDrop(driver,draggable,droppable);
		
	}
	
	
	public void acceptDragAndDrop(WebDriver driver) {
		
		driver.findElement(By.id("droppableExample-tab-accept")).click();

		WebElement draggable = driver.findElement(By.id("acceptable"));
		WebElement droppable = driver.findElement(By.cssSelector("#droppableExample-tabpane-accept #droppable"));
		
		dragAndDrop(driver,draggable,droppable);
		
	} 
	
	public void acceptNotDragAndDrop(WebDriver driver) {
		
		driver.findElement(By.id("droppableExample-tab-accept")).click();

		WebElement draggable = driver.findElement(By.id("notAcceptable"));
		WebElement droppable = driver.findElement(By.cssSelector("#droppableExample-tabpane-accept #droppable"));
		
		dragAndDrop(driver,draggable,droppable);
		
	}
	
	public void preventPropogationDragAndDrop(WebDriver driver) {
		
		driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();

		WebElement draggable = driver.findElement(By.id("dragBox"));
		WebElement droppable = driver.findElement(By.id("notGreedyDropBox"));
		
		dragAndDrop(driver,draggable,droppable);
		
	}
	
	public void revertDraggableDragAndDrop(WebDriver driver) {
		
		driver.findElement(By.id("droppableExample-tab-revertable")).click();

		WebElement draggable = driver.findElement(By.id("notRevertable"));
		WebElement droppable = driver.findElement(By.cssSelector("#revertableDropContainer #droppable"));
		
		dragAndDrop(driver,draggable,droppable);
		
		droppable = driver.findElement(By.cssSelector("#revertableDropContainer div"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(draggable, droppable).build().perform();
		
	}
	
}
