package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationTest {

	public static void main(String[] args) {
		
	}
	
	public static void gmailLogin() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedrivernew/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/");
		
		//enter text in login and password textbox
		WebElement EmailOrPhone = driver.findElement(By.name("identifier"));
		EmailOrPhone.sendKeys("daksha7877@gmail.com");
		
		//to click on next
		driver.findElement(By.id("identifierNext")).click();
		
		//enter text in password textbox
		WebElement EnterYourPassword = driver.findElement(By.name("password"));
		EnterYourPassword.sendKeys("hanu@7877");
		
		//click on next
		driver.findElement(By.id("passwordNext")).click();
		
		 //click on google account
		driver.findElement(By.id("gb")).click();
		
		//click on signout
		driver.findElement(By.id("gb_71")).click();
		
		System.out.println("Test Completed Successfully");
		
		//driver.close();
	}

}
