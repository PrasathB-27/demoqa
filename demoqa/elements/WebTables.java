package demoqa.elements;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables {
 
	public void addRow(WebDriver drive,Scanner sc) {
		
		System.out.println("Enter FirstName:");
		String firstName = sc.nextLine();
		System.out.println("Enter LastName:");
		String lastName = sc.nextLine();
		System.out.println("Enter Email:");
		String email = sc.nextLine();
		System.out.println("Enter Age:");
		String age = sc.nextLine();
		System.out.println("Enter Salary:");
		String salary = sc.nextLine();
		System.out.println("Enter Department:");
		String department = sc.nextLine();
		
		WebDriver driver = Main.browserInstallation(drive, "webtables");
		int i=1;
		while(i<15) {
			driver.findElement(By.id("addNewRecordButton")).click();
			driver.findElement(By.id("firstName")).sendKeys(firstName);
			driver.findElement(By.id("lastName")).sendKeys(lastName);
			driver.findElement(By.id("userEmail")).sendKeys(email);
			driver.findElement(By.id("age")).sendKeys(age);
			driver.findElement(By.id("salary")).sendKeys(salary);
			driver.findElement(By.id("department")).sendKeys(department);
			driver.findElement(By.id("submit")).click();
			i++;
		}
	}
	
	public void editRow(WebDriver drive,Scanner sc) {
		
		System.out.println("Enter Email field to identify the record to edit:");
		String email = sc.nextLine();
		System.out.println("Enter the field to be editted: 1.First Name  2.Last Name  3.Email  4.Age  5.Salary  6.Department");
		int fieldOption = sc.nextInt();
		System.out.println("Enter the updated value of a field:");
		sc.nextLine();
		String value = sc.nextLine();
		
		WebDriver driver = Main.browserInstallation(drive, "webtables");
		
		WebElement searchBox = driver.findElement(By.id("searchBox"));
		searchBox.sendKeys(email);
		driver.findElement(By.id("basic-addon2")).click();
		driver.findElement(By.xpath("//*[contains(@id,'edit-record')]")).click();
		
		WebElement fn = null;
		
		if(fieldOption==1) fn = driver.findElement(By.id("firstName"));
		else if(fieldOption==2) fn = driver.findElement(By.id("lastName"));
		
		else if(fieldOption==3) fn = driver.findElement(By.id("userEmail"));
		else if(fieldOption==4) fn = driver.findElement(By.id("age"));
		
		else if(fieldOption==5) fn = driver.findElement(By.id("salary"));
		else if(fieldOption==6) fn = driver.findElement(By.id("department"));
		
		fn.clear();
		fn.sendKeys(value);
		
		driver.findElement(By.id("submit")).click();
		
		searchBox.clear();
		
	}
	
	public void deleteRow(WebDriver drive,Scanner sc) {
		System.out.println("Enter Email field to identify the record to delete:");
		String email = sc.nextLine();
		
		WebDriver driver = Main.browserInstallation(drive, "webtables");
		
		WebElement searchBox = driver.findElement(By.id("searchBox"));
		searchBox.sendKeys(email);
		driver.findElement(By.id("basic-addon2")).click();
		
		driver.findElement(By.xpath("//*[contains(@id,'delete-record')]")).click();
		
		searchBox.clear();
	}
	
	public void getSingleRow(WebDriver drive,Scanner sc) {
		System.out.println("Enter Email field to identify the record:");
		String email = sc.nextLine();
		
		WebDriver driver = Main.browserInstallation(drive, "webtables");
		WebElement searchBox = driver.findElement(By.id("searchBox"));
		searchBox.sendKeys(email);
		driver.findElement(By.id("basic-addon2")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='rt-tr-group']//*[@class='rt-td']"));

    	System.out.println("FirstName :"+list.get(0).getText());
    	System.out.println("LastName :"+list.get(1).getText());
    	System.out.println("Email :"+list.get(2).getText());
    	System.out.println("Age :"+list.get(3).getText());
    	System.out.println("Salary :"+list.get(4).getText());
    	System.out.println("Department :"+list.get(5).getText());
	}
	
	public void getAllRow(WebDriver drive) {
		
		WebDriver driver = Main.browserInstallation(drive, "webtables");
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='rt-tr-group']"));
		for(WebElement l:list) {
			if(l.getText().equals("")) break;
			System.out.println(l.getText());
			System.out.println("------------------");
		}
	}
	
}
 