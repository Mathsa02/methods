package sel;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class FileDownload {
	WebDriver driver;
	@Test
	public void FileDownload2() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://omayo.blogspot.com/p/page7.html");
	    driver.manage().window().maximize();
	    
	    WebElement abc= driver.findElement(By.linkText("ZIP file"));
	    abc.click();
	    String downloadPath = "C:\\Users\\kkr\\Downloads";
	    File downloadedFile = new File(downloadPath + "/DownloadDemo-master (11).zip");
	    Assert.assertFalse(downloadedFile.exists(), "File not downloaded successfully");
	}
 
}