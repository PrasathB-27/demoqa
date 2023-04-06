package demoqa.interactions;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {

	public static void main(String[] args) {
		
		try {
			
			System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the choice: 1.BrowserWindow  2.Alerts  3.Frames  4.NestedFrames  5.Modal-Dailogues");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice==1) {
				
			}else if(choice==2) {
				
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
			}
		
		}
		catch(Exception e) {
			
			System.out.println("Exception caught ");
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static WebDriver browserInstallation(String module) {

		WebDriver driver = new FirefoxDriver();
    	driver.manage().window().fullscreen();
    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    	String url = "https://demoqa.com/"+module;
    	driver.navigate().to(url); 
    	
    	return driver;
	}
}