package demoqa.alerts;

import org.openqa.selenium.WebDriver;

import demoqa.widgets.Main;

public class UnitAlert {

	public static void main(String[] args) {
	
		WebDriver driver = Main.browserInstallation("modal-dialogs");
		ModalDailogs alt = new ModalDailogs();
		alt.clickLargeModal(driver);
		
	}

}
