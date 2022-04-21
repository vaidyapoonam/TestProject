package Group2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Cssselectoeredbus {

		WebDriver driver;
		
		@BeforeClass
		
		public  void transform () {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Broswers\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.redbus.in/");
		
		}
		
		
		@Test
		public void TopOperators() {
			System.out.println("the redbus page is displayed");
			
			List<WebElement> findElements = driver.findElements(By.cssSelector("#rh_footer > div:nth-child(2) > div > div > ul > li:nth-child(24) > a"));
			if (findElements.size() == 1) {
				System.out.println("The Element is present " + findElements.size());
			} else {
				System.out.println("The Element is not present");

			}
			
		}
		

		
		@Test 
		public void theNumbersAreGrowing() {
			
			WebElement CUSTOMERS = driver.findElement(By.cssSelector("#stats_div > div > div.clearfix.stats-v-holder > div:nth-child(1) > div > div.sp.rest1.animate"));
			boolean displayed = CUSTOMERS.isDisplayed();
			System.out.println(displayed);
			
			WebElement OPERATORS = driver.findElement(By.cssSelector("#stats_div > div > div.clearfix.stats-v-holder > div:nth-child(2) > div > div.sp.rest1.animate"));
			boolean displayed1 = OPERATORS.isDisplayed();
			System.out.println(displayed1);
			
			WebElement BUSTICKETS = driver.findElement(By.cssSelector("#stats_div > div > div.clearfix.stats-v-holder > div:nth-child(3) > div > div.sp.rest1.animate"));
			boolean displayed2 = BUSTICKETS.isDisplayed();
			System.out.println(displayed2);
			
			
			
			

		}
	}

