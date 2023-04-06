package demoqa.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDailogs {
	
	public void clickSmallModal(WebDriver driver) {
		
		driver.findElement(By.id("showSmallModal")).click();
		String str = driver.findElement(By.className("modal-body")).getText();
		System.out.println(str);
		driver.findElement(By.id("closeSmallModal")).click();
	}
	
	public void clickLargeModal(WebDriver driver) {
		
		driver.findElement(By.id("showLargeModal")).click();
		String str = driver.findElement(By.className("modal-body")).getText();
		System.out.println(str);
		driver.findElement(By.id("closeLargeModal")).click();
	}
	
}
