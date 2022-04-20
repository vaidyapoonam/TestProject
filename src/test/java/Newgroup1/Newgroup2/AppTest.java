package Newgroup1.Newgroup2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver;
	
	@BeforeClass
	
	public  void transform () {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Broswers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	
	}
	
	
	@Test
	public void TopOperators() throws FileNotFoundException, IOException {
		System.out.println("the redbus page is displayed");
		
		Properties ref= new Properties();
		ref.load(new FileInputStream("C:\\Users\\poonam.vaidya\\eclipse-workspace\\New\\Newgroup2\\Redbus.property"));
		
		
		
		List<WebElement> findElements = driver.findElements(By.xpath(ref.getProperty("TopOperators")));
		if (findElements.size() == 1) {
			System.out.println("The Element is present " + findElements.size());
		} else {
			System.out.println("The Element is not present");

		}
		
	}
	

	
	@Test 
	public void theNumbersAreGrowing() {
		
		WebElement CUSTOMERS = driver.findElement(By.xpath("//div[contains(text(),\"CUSTOMERS\")]"));
		boolean displayed = CUSTOMERS.isDisplayed();
		System.out.println(displayed);
		
		WebElement OPERATORS = driver.findElement(By.xpath("//div[contains(text(),\"OPERATORS\")]"));
		boolean displayed1 = OPERATORS.isDisplayed();
		System.out.println(displayed1);
		
		WebElement BUSTICKETS = driver.findElement(By.xpath("//div[contains(text(),\"BUS TICKETS\")]"));
		boolean displayed2 = BUSTICKETS.isDisplayed();
		System.out.println(displayed2);
		
		
		
		

	}
}
