package www.baps.org.satsangexam;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@FindBy(className = "seer-logo")
	private WebElement logoElement;
	
	@FindBy(className = "seer-subtitle")
	private WebElement logosubtitle;
	

	private WebDriver driver;
	
	@BeforeSuite
	public void preTestSetup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\satsangexam\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bapssatsangexams.org/");
		PageFactory.initElements(driver, this);
	}
	
	
	
	@Test()
	public void validateSEerLogoIsDisplayed() throws InterruptedException {
		
		assertEquals(true, logoElement.isDisplayed());

	}
	
	
	@Test()
	public void validateSEerLogoSubtitleIsDisplayed() throws InterruptedException {
		
		assertEquals(true, logosubtitle.isDisplayed());
		System.out.println("This is a feature branch change.");

	}
	
		
	
	@AfterSuite
	public void postTest() {
		
		driver.close();
	}

}