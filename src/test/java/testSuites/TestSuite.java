package testSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSuite {

	static WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balum\\eclipse-workspace\\TestingThroughSel\\drivers4ourproject\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test
	public void openBrowser() {
		driver= new ChromeDriver();
	}

	@Test
	public void launchURl()
	{
		driver.get("https://www.amazon.com");
	}
}
