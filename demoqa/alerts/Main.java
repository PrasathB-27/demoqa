package demoqa.alerts;

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
				
				System.out.println("Enter the button to be clicked, 1.New Tab  2.New Window  3.New Message Window");
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("browser-windows");
				
				BrowserWindow bw = new BrowserWindow();
				
				if(subChoice == 1) bw.newTabClick(driver);
				else if(subChoice == 2) bw.newWindowClick(driver);
				else if(subChoice == 3) bw.newWindowMessageClick(driver);
				
			}else if(choice==2) {
				
				System.out.println("Enter the alert box to be clicked, 1.alert box   2.delayed alert box   3.conform alert box   4.prompt alert box");
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("alerts");
				
				Alerts alt = new Alerts();
				
				if(subChoice == 1) alt.alertClick(driver);
				else if(subChoice == 2) alt.delayedAlertClick(driver);
				else if(subChoice == 3) alt.confirmBoxClick(driver);
				else if(subChoice == 4) alt.promptBoxClick(driver);
				
			}else if(choice == 3) {
				
				System.out.println("Enter which frame to be accessed, 1.First Frame   2.Second Frame");
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("frames");
				
				Frames frm = new Frames();
				
				if(subChoice == 1) frm.firstFrame(driver);
				else if(subChoice == 2) frm.secondFrame(driver);
				
			}else if(choice == 4) {
				
				System.out.println("Enter which frame to be accessed, 1.Parent Frame   2.Child Frame");
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("nestedframes");
				
				NestedFrame frm = new NestedFrame();
				
				if(subChoice == 1) frm.accessParentFrameContent(driver);
				else if(subChoice == 2) frm.accessChildFrameContent(driver);
				
			}else if(choice == 5) {
				
				System.out.println("Enter which frame to be accessed, 1.Small modal box   2.Large modal box");
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("modal-dialogs");
				
				ModalDailogs mdl = new ModalDailogs();
				
				if(subChoice == 1) mdl.clickSmallModal(driver);
				else if(subChoice == 2) mdl.clickLargeModal(driver);
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
