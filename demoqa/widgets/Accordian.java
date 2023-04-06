package demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accordian {

	public void accessSectionOne(WebDriver driver) {
		
		driver.findElement(By.id("section1Heading")).click();
		
		System.out.println("content from first section.");
		System.out.println(driver.findElement(By.xpath("//*[@id='section1Content']//p")).getText());
	}
	
	public void accessSectionTwo(WebDriver driver) {
			
		driver.findElement(By.id("section2Heading")).click();
		
		System.out.println("content from second section.");
		System.out.println(driver.findElement(By.xpath("//*[@id='section2Content']//p")).getText());
	}
	
	public void accessSectionThree(WebDriver driver) {

		driver.findElement(By.id("section3Heading")).click();
		
		System.out.println("content from third section.");
		System.out.println(driver.findElement(By.xpath("//*[@id='section3Content']//p")).getText());
	}
		
}
