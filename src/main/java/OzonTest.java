import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OzonTest extends BaseTest{

  @Test(description = "Проверяю, что тип товара соответствует товару, который ищу")
  public void checkAvailableCandy() {
    OzonPage ozonPage = new OzonPage(driver);
    ozonPage.findCandy();
    String type = driver.findElement(By.className("x0l")).getText();

    Assert.assertEquals(type, "Пряники");
  }
}
