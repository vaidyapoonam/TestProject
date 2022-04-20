package Group2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Redbusjava {
	@BeforeClass
	public  void transform () {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Broswers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	
	}
	
	
	@Test
	public void actionblock() {
		System.out.println("the redbus page is displayed");
		
		
		
	}
	
	
	
	}
	


