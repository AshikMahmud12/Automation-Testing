import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchJob {

	public static void main(String[] args) {
	//System.out.println("ashik");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashik\\Downloads\\driver\\chromedriver_win32");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.indeed.com");
	driver.findElement(By.id("what")).sendKeys("Selenium");
	driver.findElement(By.id("where")).sendKeys("London");
	driver.findElement(By.id("fj")).click();
	
	}

}
