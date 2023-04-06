package demoqa.widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBar {

	public void slideBar(WebDriver driver) {
		
//		WebElement progressBar = driver.findElement(By.id("startStopButton"));
//		progressBar.click();
		
		WebElement progressBar = driver.findElement(By.id("progress-bar"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));
		progressBar.click();
	}
	
}
