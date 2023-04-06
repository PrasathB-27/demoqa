package demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownload {

	public void downloadImage(WebDriver driver) {
		
		driver.findElement(By.id("downloadButton")).click();
		System.out.println("An Image has been Downloaded.");
	}
	
	public void uploadImage(WebDriver driver) {
		
		WebElement image = driver.findElement(By.id("uploadFile"));
		
		image.sendKeys("/Users/prasath-pt6576/Downloads/pexels-arantxa-treva-959314.jpg");
		
		System.out.println("An Image has been Uploaded.");
	}
	
}
