package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailloginPage {
	
	
	//to make it static to this class only we use "private"
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.id("identifierId"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.id("identifierNext"));
		return element;
	}

}
