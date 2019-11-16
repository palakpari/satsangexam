package www.baps.org.satsangexam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
private final Logger logger = LoggerFactory.getLogger(AppTest.class);

@Test()
public void openBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\workspace\\satsangexam\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	// Open Google
	driver.get("https://www.bapssatsangexams.org/");
	driver.manage().window().maximize();

	// Close browser
	driver.close();

}
}