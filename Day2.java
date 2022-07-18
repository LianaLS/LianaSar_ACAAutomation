import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import dev.failsafe.internal.util.Assert;

public class Day2 {

	
	public static void main(String[] args) throws InterruptedException 
	{				
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(2000);
	    driver.findElement(By.id("bmwradio")).click();
	    driver.findElement(By.xpath("//input[@id='hondacheck']")).click();
	   // driver.findElement(By.xpath("//input[@id='hondacheck']")).clear();
	    driver.findElement(By.linkText("SUPPORT")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Liana");
		driver.findElement(By.id("email")).sendKeys("liana.sarajyan.ls@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		Thread.sleep(15000);
		
		String s=	 driver.findElement(By.cssSelector("p[class='dynamic-text']")).getText();
		Thread.sleep(13000);
		System.out.println(s);
		Thread.sleep(15000);
		if (s.contains("We will contact you very soon")) {
			System.out.println("pass");			
		}
		
	}
}
