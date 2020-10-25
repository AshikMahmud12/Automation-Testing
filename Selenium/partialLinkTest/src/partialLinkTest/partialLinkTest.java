package partialLinkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashik\\Downloads\\driver\\chromedriver_win32.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.indeed.com");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkTest("Post Jobs")).click();
	
	
	

	}

}
