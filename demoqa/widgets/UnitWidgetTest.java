package demoqa.widgets;

import org.openqa.selenium.WebDriver;

public class UnitWidgetTest {

	public static void main(String[] args) {
		
		WebDriver driver = Main.browserInstallation("tabs");
		
		
		Tabs sld = new Tabs();
		sld.inactiveTab(driver);
		
	}

}
