package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class DynamicDropDown {
	WebDriver driver;
	@Test
	public void DynamicDropdown2() throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.spicejet.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("//input[@data-focusable='true']")).click();
	     Thread.sleep(5000);
	     
	     driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[10]/div[2]/div")).click();
	     Thread.sleep(4000);
	     
	     driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[12]/div[2]/div")).click();
	     Thread.sleep(4000);
	     
	     
	}
}
