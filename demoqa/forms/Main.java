package demoqa.forms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
			
			PracticeForm pf = new PracticeForm();
			
			Student s = pf.createStudentObject();
			
			pf.fillStudentDetails(s);
		
		}
		catch(Exception e) {
			
			System.out.println("Exception caught ");
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static WebDriver browserInstallation() {
		
		FirefoxOptions profile = new FirefoxOptions();
		profile.addPreference("layout.css.devPixelsPerPx", "1.5");

		WebDriver driver = new FirefoxDriver(profile);
		
    	driver.manage().window().fullscreen();
    	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    	
    	String url = "https://demoqa.com/automation-practice-form";
    	driver.navigate().to(url); 
    	
    	return driver;
	}
}
