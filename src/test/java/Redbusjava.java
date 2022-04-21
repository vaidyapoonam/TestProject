import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Redbusjava {
  @Test

	  
	  
	  @BeforeClass
		public void beforeClass1() {
			getdriver("chrome", "https://www.redbus.in/");
		}

	private void getdriver(String string, String string2) {
	// TODO Auto-generated method stub
	
}

	@Test(priority = 2)
	public void topOperators1() {
//			List<WebElement> findElements = driver.findElements(By.xpath("//a[text()='Mahasagar Travels']"));
//			if (findElements.size() == 1) {
//				System.out.println("The Element is present " + findElements.size());
//			} else {
//				System.out.println("The Element is not present");
//
//			}

			// (OR)

			WebElement topoperators = findelementbyxpath(
					"//ul[@class='container clearfix']/child::li/child::a[text()='Sharma Travels']");
			boolean enabled = topoperators.isEnabled();
			System.out.println(enabled);
			String text = topoperators.getText();
			System.out.println(text);
		}

		private WebElement findelementbyxpath(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		//@Test(priority = 1)
//		public void theNumbersAreGrowing() {
//
//			WebElement customers = findelementbyxpath(
//					"(//div[@class='clearfix stats-v-holder']/child::div[@class='fl']/child::div)[1]");
//			boolean customersdisplayed = customers.isDisplayed();
//			System.out.println(customersdisplayed);
//			String customertext = customers.getText();
//			System.out.println(customertext);
//
//			WebElement operators = findelementbyxpath("//div[text()='network of over 3500 bus operators worldwide']");
//			boolean operatorsdisplayed = operators.isDisplayed();
//			System.out.println(operatorsdisplayed);
//
//			WebElement bustickets = findelementbyxpath("//div[text()='Over 220 million trips booked using redBus']");
//			boolean enabled = bustickets.isEnabled();
//			System.out.println(enabled);
//
//		}
  




}
