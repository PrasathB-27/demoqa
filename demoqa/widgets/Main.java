package demoqa.widgets;

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
			
			System.out.println("Enter the choice: 1.Accordian  2.Auto Complete  3.Slider  4.Progress Bar  5.Tabs  6.ToolTip  7.Menu  8.SelectMenu");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice==1) {
				
				System.out.println("Enter the option to access which accordian, 1.firstSection  2.secondSection  3.thirdSection");
				
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("accordian");
				
				Accordian acc = new Accordian();
				
				if(subChoice==1)  acc.accessSectionOne(driver);
				else if(subChoice==2)  acc.accessSectionTwo(driver);
				else if(subChoice==3)  acc.accessSectionThree(driver);
				
			}else if(choice==2) {
				
				System.out.println("Enter the option , 1.multiple select  2.single select");
				
				int subChoice = sc.nextInt();
				
				AutoComplete act = new AutoComplete();
				
				if(subChoice==1)  {
					
					System.out.println("Enter the Colors :");
					sc.nextLine();
					String colors[] = sc.nextLine().split(",");
					
					WebDriver driver = browserInstallation("auto-complete");
					
					act.multipleColorNames(driver,colors);
				}
				else if(subChoice==2)  {
					
					System.out.println("Enter the Color :");
					sc.nextLine();
					String color = sc.nextLine();
					
					WebDriver driver = browserInstallation("auto-complete");
					
					act.singleColorName(driver,color);
				}
				
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
				System.out.println("Enter which tab to be accessed, 1.What  2.Origin  3.Use  4.More");
				
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("tabs");
				
				Tabs tb = new Tabs();
				
				if(subChoice == 1) tb.activeTabs(driver, "what");
				else if(subChoice == 2) tb.activeTabs(driver, "origin");
				else if(subChoice == 3) tb.activeTabs(driver, "use");
				else if(subChoice == 4) tb.inactiveTab(driver);
				
			}else if(choice == 6) {
				
				System.out.println("Enter the option 1.Hover over button  2.Hover over text box  3.Hover over content");
				
				int subChoice = sc.nextInt();
				sc.nextLine();
				
				ToolTips tt = new ToolTips();
				
				if(subChoice == 1) {
					WebDriver driver = browserInstallation("tool-tips");
					tt.hoverOverButton(driver);
				}
				else if(subChoice == 2) {
					WebDriver driver = browserInstallation("tool-tips");
					tt.hoverOverTextBox(driver);
				}
				else if(subChoice == 3) {
					
					String content = sc.nextLine();
					WebDriver driver = browserInstallation("tool-tips");
					tt.hoverOverText(driver, content);
				}
			}else if(choice == 7) {
				
				System.out.println("Enter which menu to be accessed, 1.MainMenu  2.SubMenu");
				
				int subChoice = sc.nextInt();
				
				WebDriver driver = browserInstallation("menu");
				
				Menu menu = new Menu();
				
				if(subChoice == 1) menu.accessMainItem(driver);
				else if(subChoice == 2) menu.accessSubItems(driver);
				
			}else if(choice == 8) {
				
				WebDriver driver = browserInstallation("select-menu");
				
				SelectMenu menu = new SelectMenu();
				
				menu.multiSelect(driver);
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
