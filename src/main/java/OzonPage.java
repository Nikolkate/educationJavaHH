import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzonPage extends BaseTest{

  protected WebDriver driver;

  private By search = By.className("o0aa");
  private By searchButton = By.className("_4-e7");
  private By productButton = By.className("m4k");
  private By productType = By.className("x0l");

  public OzonPage(WebDriver driver){
    this.driver = driver;
  }

  public OzonPage findCandy() {
    driver.get("https://www.ozon.ru/");
    driver.findElement(search).sendKeys("Тульский пряник");
    driver.findElement(searchButton).click();
    driver.findElement(productButton).click();
    driver.findElement(productType).getText();
    return new OzonPage(driver);
  }
}
