import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
public class AutomationTest {

	public static void main(String[] args) throws InterruptedException {
		
	
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedrivernew/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/");
		
		//enter text in login and password textbox
		WebElement EmailOrPhone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		EmailOrPhone.sendKeys("hanushrma1234@gmail.com");
		
		//to click on next
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		//enter text in password textbox
		WebElement EnterYourPassword = driver.findElement(By.xpath("//input[@name='password']"));
		EnterYourPassword.sendKeys("hidenseek");
		
		//click on next
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
		
		 //click on google account
		driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
		
		//click on signout
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		
		System.out.println("Test Completed Successfully");
		
		driver.close();
	
	}

}
