package demoqa.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public void alertClick(WebDriver driver) {
	
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		
	}
	
	public void delayedAlertClick(WebDriver driver) {
		
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
	}
	
	public void confirmBoxClick(WebDriver driver) {
		
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
	}
	
	public void promptBoxClick(WebDriver driver) {
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Prasath");
		alert.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}
	
}
