import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

  protected WebDriver driver;

  @BeforeSuite
  public void setUp() {
    System.setProperty(
        "webdriver.chrome.driver",
        "chromedriver-2");
    driver = new ChromeDriver();
    BasePage.driverChrome(driver);
  }

  @AfterSuite
  public void tearDown() {
    driver.quit();
  }
}
