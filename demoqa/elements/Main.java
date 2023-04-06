package demoqa.elements;

import java.util.Scanner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
		WebDriver driver = null;
		
		System.out.println("Enter the choice: 1.TextBox  2.CheckBox  3.RadioButton  4.WebTables  5.Buttons  6.Links  7.BrokenLinksAndImages  8.UploadAndDownload  9.DynamicProperties");
		int choice = sc.nextInt();
		sc.nextLine();
		
		try {
			if(choice==1) {
				System.out.println("---- Form -----");
		    	TestBox tb = new TestBox();
		    	
		    	System.out.println("Enter the FullName :");
		    	tb.setFullName(sc.nextLine());
		    	
		    	System.out.println("Enter the Email :");
		    	tb.setEmail(sc.nextLine());
		    	
		    	System.out.println("Enter the CurrentAddress :");
		    	tb.setCurrentAddress(sc.nextLine());
		    	
		    	System.out.println("Enter the PermanentAddress :");
		    	tb.setPermanentAddress(sc.nextLine());
		    	
		    	driver = browserInstallation(driver,"text-box");
		    
		    	driver.findElement(By.id("userName")).sendKeys(tb.getFullName());
		    	
		    	driver.findElement(By.id("userEmail")).sendKeys(tb.getEmail());
		    	driver.findElement(By.id("currentAddress")).sendKeys(tb.getCurrentAddress());
		    	
		    	driver.findElement(By.id("permanentAddress")).sendKeys(tb.getPermanentAddress());
		    	driver.findElement(By.id("submit")).click();
		    	
		    	String name[] = driver.findElement(By.id("name")).getText().split(":");
		    	String email[] = driver.findElement(By.id("email")).getText().split(":");
		    	
		    	WebElement emailAddressField = driver.findElement(By.id("email"));
		    	String currentAddress[] = driver.findElement(with(By.id("currentAddress")).below(emailAddressField)).getText().split(":");
		    	
		    	WebElement currentAddressField = driver.findElement(By.id("email"));
		    	String permanentAddress[] = driver.findElement(with(By.id("permanentAddress")).below(currentAddressField)).getText().split(":");
		    	
		    	
		    	if(name[1].equals(tb.getFullName()) && email[1].equals(tb.getEmail()) && 
		    			currentAddress[1].equals(tb.getCurrentAddress()) && permanentAddress[1].equals(tb.getPermanentAddress())) {
		    		
		    		System.out.println("Matched");
		    		
		    	}else {
		    		
		    		System.out.println("Not Matched");
		    		
		    	}
			}else if(choice==2) {
				
				System.out.println("Enter any choice to perform Action: 1.CheckAll 2.checkParticularBox 3.uncheckParticularBox");
				int subChoice = sc.nextInt();
		    	
				CheckBox cb = new CheckBox(); 
				
				if(subChoice==1) {
					driver = browserInstallation(driver,"checkbox");
					cb.checkAll(driver);
				}
				else if(subChoice==2) {
					System.out.println("Enter the option to be selected:");
					sc.nextLine();
					String option = sc.nextLine();
					driver = browserInstallation(driver,"checkbox");
					cb.checkParticularBox(driver,option);
				}
				else if(subChoice==3) {
					System.out.println("Enter the option to be unselected:");
					sc.nextLine();
					String option = sc.nextLine();
					driver = browserInstallation(driver,"checkbox");
					cb.uncheckParticularBox(driver,option);
				}
				
			}else if(choice == 3) {
				
				RadioButton rb = new RadioButton();
				
				System.out.println("Enter the choice to select specific radio button 1.yesRadio 2.noRadio 3.impressiveRadio");
				int subChoice = sc.nextInt();
				
				if(subChoice==1) {
					driver = browserInstallation(driver,"radio-button");
					rb.yesClick(driver);
				}
				else if(subChoice==2) {
					driver = browserInstallation(driver,"radio-button");
					rb.noClick(driver);
				}
				else if(subChoice==3) {
					driver = browserInstallation(driver,"radio-button");
					rb.impressiveClick(driver);
				}
				
			}else if(choice == 4) {
				
				WebTables wt = new WebTables();
				wt.addRow(driver, sc);
				
			}else if(choice == 5) {
				
				Buttons btn = new Buttons();
				
				System.out.println("Enter the Button to be clicked  1.DoubleClickButton  2.RightClickButton  3.dynamicClick");
				int subChoice = sc.nextInt();
				
				driver = browserInstallation(driver,"buttons");
				
				if(subChoice==1) btn.doubleClick(driver);
				else if(subChoice==2) btn.rightClick(driver);
				else if(subChoice==3) btn.dynamicClick(driver);
				
			}else if(choice==6) {
				
				Link ln = new Link();
				System.out.println("Enter the link to be clicked, 1.openLink  2.openDynamicLink  3.apiCallLink");
				int subChoice = sc.nextInt();
				
				if(subChoice==1) {
					driver = browserInstallation(driver,"links");
					ln.openLink(driver);
				}
				else if(subChoice==2) {
					driver = browserInstallation(driver,"links");
					ln.openDynamicLink(driver);
				}
				else if(subChoice==3) {
					System.out.println("Enter the apiCall to be send,  1.created  2.No Content  3.Moved  4.Bad Request  5.Unauthorized  6.Forbidden  7.Not Found");
					subChoice = sc.nextInt();
					
					driver = browserInstallation(driver,"links");
					
					if(subChoice==1) ln.apiCall(driver, "created");
					else if(subChoice==2) ln.apiCall(driver, "no-content");
					else if(subChoice==3) ln.apiCall(driver, "moved");
					else if(subChoice==4) ln.apiCall(driver, "bad-request");
					else if(subChoice==5) ln.apiCall(driver, "unauthorized");
					else if(subChoice==6) ln.apiCall(driver, "forbidden");
					else if(subChoice==7) ln.apiCall(driver, "invalid-url");
				}
				
			}else if(choice==7) {
				
			}else if(choice==8) {
				
				UploadAndDownload ud = new UploadAndDownload();
				
				System.out.println("Enter the choice  1.Download  2.Upload");
				int subChoice = sc.nextInt();
				
				driver = browserInstallation(driver,"upload-download");
				
				if(subChoice==1) ud.downloadImage(driver);
				else if(subChoice==2) ud.uploadImage(driver);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
    	    sc.close();
    	    driver.quit();
		}
    	
    	
    	
	}
	
	@SuppressWarnings("deprecation")
	public static WebDriver browserInstallation(WebDriver driver, String module) {
		
		driver = new FirefoxDriver();
    	driver.manage().window().fullscreen();
    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    	String url = "https://demoqa.com/"+module;
    	driver.navigate().to(url); 
    	
    	return driver;
	}


}
