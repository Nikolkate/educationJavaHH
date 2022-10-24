import org.openqa.selenium.WebDriver;

abstract public class BasePage {

  protected static WebDriver driver;

  public static void driverChrome(WebDriver webDriver) {
    driver = webDriver;
  }
}
