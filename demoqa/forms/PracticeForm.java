package demoqa.forms;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PracticeForm {
	
	public Student createStudentObject() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("Enter the Student FirstName:");
		s.setFirstName(sc.nextLine());
		
		System.out.println("Enter the Student LastName:");
		s.setLastName(sc.nextLine());
		
		System.out.println("Enter the Student Email:");
		s.setEmail(sc.nextLine());
		
		System.out.println("Enter the Student Gender (Male,Female,Others):");
		s.setGender(sc.nextLine());
		
		System.out.println("Enter the Student PhoneNumber: (should be in 10 digits)");
		s.setPhoneNubmer(sc.nextLine());
		
		System.out.println("Enter the Student DOB: (12 August 2002)");
		s.setDob(sc.nextLine());
		
		System.out.println("Enter the Student Subjects(Since it is multi-picklist, values should be comma seperated): (Accounting,Maths)");
		String subjects[] = sc.nextLine().split(",");
		s.setSubjects(subjects);
		
		System.out.println("Enter the Student Hobbies(Since it is check-Box, values should be comma seperated): (Sports,Reading)");
		String hobbies[] = sc.nextLine().split(",");
		s.setHobbies(hobbies);
		
		System.out.println("Enter the Student CurrentAddress:");
		s.setCurrentAddress(sc.nextLine());
		
		System.out.println("Enter the Student State:");
		s.setState(sc.nextLine());
		
		System.out.println("Enter the Student City:");
		s.setCity(sc.nextLine());
		
		return s;
	}
	
	
	public void fillStudentDetails(Student s) {
		
		WebDriver driver = Main.browserInstallation();
		
		driver.findElement(By.id("firstName")).sendKeys(s.getFirstName());
		driver.findElement(By.id("lastName")).sendKeys(s.getLastName());
		driver.findElement(By.id("userEmail")).sendKeys(s.getEmail());
		
		if(s.getGender().equals("Male")) driver.findElement(By.xpath("//*[text()='Male']")).click();
		else if(s.getGender().equals("Female")) driver.findElement(By.xpath("//*[text()='Female']")).click();
		else if(s.getGender().equals("Other")) driver.findElement(By.xpath("//*[text()='Other']")).click();
		
		if(s.getPhoneNubmer().length()<10 || s.getPhoneNubmer().length()>10) {
		    driver.findElement(By.id("userNumber")).sendKeys("9999999999");
		}else {
			driver.findElement(By.id("userNumber")).sendKeys(s.getPhoneNubmer()+"");
		}
		
		dateFieldClick(s,driver);
		
		subjectsOptionsClick(driver,s.getSubjects());
		
		hobbiesCheckBoxClick(driver,s.getHobbies());
		
		WebElement image = driver.findElement(By.id("uploadPicture"));
		image.sendKeys(s.getImgUrl());
		
		driver.findElement(By.id("currentAddress")).sendKeys(s.getCurrentAddress());
		
		pickListOptionClick(s.getState(),driver,"//*[@class=' css-1hwfws3']","//*[@class=' css-11unzgr']//*[contains(@id,'react-select-3-option')]",1);
		
		pickListOptionClick(s.getCity(),driver,"//*[@class=' css-yk16xz-control']","//*[@id='city']//*[@class=' css-11unzgr']//*[contains(@id,'react-select-4-option')]",2);
		
		driver.findElement(By.id("submit")).click();
		
		printStudentDetails(s,driver);
		
		driver.findElement(By.id("closeLargeModal")).click();;
		
	}
	
	
	public void dateFieldClick(Student s,WebDriver driver) {
		String dobSeperate[] = s.getDob().split("\\s");
		
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		List<WebElement> monthList = driver.findElements(By.xpath("//*[@class='react-datepicker__month-select']//option"));
		
		if(!(dobSeperate[1].equals("March"))) {
			for(WebElement l:monthList) {
				if(l.getText().equals(dobSeperate[1])) {
					l.click();
				}
			}
		}
		List<WebElement> yearList = driver.findElements(By.xpath("//*[@class='react-datepicker__year-select']//option"));
		for(WebElement l:yearList) {
			if(l.getText().equals(dobSeperate[2])) {
				l.click();
			}
		}
		String xpath = "//*[contains(@class,'"+dobSeperate[0]+"')]";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void pickListOptionClick(String value,WebDriver driver,String xpath,String pickListXpath,int id) {
		
		WebElement pick = driver.findElement(By.xpath(xpath));
		pick.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='10%'");
		
		List<WebElement> pickListOptions = driver.findElements(By.xpath(pickListXpath)); 
		
		if(id==1) {
			if(value.equals("NCR")) pickListOptions.get(0).click();
			else if(value.equals("Uttar Pradesh")) pickListOptions.get(1).click();
			else if(value.equals("Haryana")) pickListOptions.get(2).click();
			else if(value.equals("Rajasthan")) pickListOptions.get(3).click();
		}else if(id==2) {
			if(value.equals("Delhi")) pickListOptions.get(0).click();
			else if(value.equals("Gurgaon")) pickListOptions.get(1).click();
			else if(value.equals("Noida")) pickListOptions.get(2).click();
		}
	}
	
	
	public void printStudentDetails(Student s,WebDriver driver) {
		List<WebElement> details =  driver.findElements(By.xpath("//table//tbody//tr"));
		List<WebElement> valuePair =  driver.findElements(By.xpath("//table//tbody//tr//td"));
		int i=0;
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("STUDENT DETAIL:");
		System.out.println("----------------------------------");
		
		for(int itr=0;itr<details.size();itr++) {
			
			System.out.print(valuePair.get(i++).getText()+" : ");
			System.out.print(valuePair.get(i++).getText());
			System.out.println();
		}
		
	}
	
	public void subjectsOptionsClick(WebDriver driver,String value[]) {
		WebElement subject = driver.findElement(By.id("subjectsContainer"));

		Actions actions = new Actions(driver);
		actions.click();
		
		for(int i=0;i<value.length;i++) {
			actions.moveToElement(subject).click().sendKeys(value[i]).build().perform();
			WebElement subjectOption = driver.findElement(By.xpath("//*[contains(@id,'react-select-2-option')]"));
			subjectOption.click();
		}
	}
	
	public void hobbiesCheckBoxClick(WebDriver driver,String value[]) {
		
		for(int i=0;i<value.length;i++) {
			driver.findElement(By.xpath("//*[text()='"+value[i]+"']")).click();
			
		}
	}

}
