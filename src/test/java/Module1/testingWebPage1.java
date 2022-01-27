package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingWebPage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\balum\\eclipse-workspace\\TestingThroughSel\\drivers4ourproject\\chromedriver.exe");
WebDriver drv = new ChromeDriver();
drv.get("https://amazon.com");
	}

}
