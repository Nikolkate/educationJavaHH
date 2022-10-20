
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OzonTest {

  protected WebDriver driver;

  @BeforeTest
  public void setUp() {
    System.setProperty(
        "webdriver.chrome.driver",
        "chromedriver-2");
    driver = new ChromeDriver();
  }

  @AfterSuite
  public void tearDown() {
    driver.quit();
  }

  @Test(description = "Проверяю, что тип товара соответствует товару, который ищу")
  public void checkAvailableCandy() {

    driver.get("https://www.ozon.ru/");
    driver.findElement(By.className("a4ao")).sendKeys("Тульский пряник");
    driver.findElement(By.className("o4aa")).click();
    driver.findElement(By.className("tile-hover-target")).click();
    String type = driver.findElement(By.className("xl9")).getText();

    Assert.assertEquals(type, "Пряники");
  }
}
