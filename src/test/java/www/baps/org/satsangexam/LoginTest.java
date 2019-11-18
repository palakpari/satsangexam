package www.baps.org.satsangexam;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
public class LoginTest {

	@FindBy(className = "seer-logo")
	private WebElement logoElement;
	
	@FindBy(className = "seer-subtitle")
	private WebElement logosubtitle;
	
	@FindBy(id ="UserName")
	private WebElement txtUserName;
	
	@FindBy(id ="Password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	private WebElement btnSignIn;
	

	private WebDriver driver;
	
	Properties props = new Properties();
	
	@BeforeSuite
	public void preTestSetup() throws IOException {
		
		
		
		InputStream inputStream = LoginTest.class.getClassLoader().getResourceAsStream("credentials.properties");

		//now can use this input stream as usually, i.e. to load as properties
		
		props.load(inputStream);
		
		
		
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
		
	}
	
	@Test()
	public void login() {
		
		txtUserName.click();
		txtUserName.sendKeys(props.get("baps.satsangexam.username").toString());
		txtPassword.click();
		txtPassword.sendKeys(props.get("baps.satsangexam.password").toString());
		btnSignIn.click();
	}
	
		
	
	@AfterSuite
	public void postTest() {
		
		driver.close();
	}

}