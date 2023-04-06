package demoqa.forms;

import org.openqa.selenium.WebDriver;

public class UnitFormTest {

	public static void main(String[] args) {
		
		try {
		
			System.setProperty("webdriver.gecko.driver", "/Users/prasath-pt6576/Downloads/geckodriver");
			
			String str[] = {"Sports","Reading","Music"};
			
			
			Student s = new Student();
			s.setFirstName("prasath");
			s.setLastName("B");
			s.setEmail("prth@gmail.com");
			s.setGender("Male");
			s.setHobbies(str);
			s.setPhoneNubmer("9345622789");
			s.setDob("27 March 2002");
			s.setSubjects(str);
			s.setCity("Delhi");
			s.setCurrentAddress("15 north car street");
			s.setState("NCR");
			
			PracticeForm pf = new PracticeForm();
			pf.fillStudentDetails(s);
			
			
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
//5 +1.5  6.5  +0.5  7  +5  12K  2.5 14.5K  -  5.5K



//WebDriver driver = Main.browserInstallation();


//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,300)");
//
//WebElement pick = driver.findElement(By.xpath("//*[@class=' css-1hwfws3']"));
//pick.click();
//
//js = (JavascriptExecutor) driver;
//js.executeScript("document.body.style.zoom='10%'");
//
//List<WebElement> pickListOptions = driver.findElements(By.xpath("//*[@class=' css-11unzgr']//*[contains(@id,'react-select-3-option')]")); 
//
////
//
//
////for(WebElement plo:pickListOptions) {
////	if(s.getState().equals(plo.getText())) plo.click();
////}
//
//pick = driver.findElement(By.xpath("//*[@class=' css-yk16xz-control']"));
//pick.click();
//
//List<WebElement> pickListOptionsCity = driver.findElements(By.xpath("//*[@id='city']//*[@class=' css-11unzgr']//*[contains(@id,'react-select-4-option')]"));
//
//pickListOptionsCity.get(0).click();
//
//