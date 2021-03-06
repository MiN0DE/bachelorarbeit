package selenium;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class YoutubeYourNameTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;


  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }


  public void tearDown() {
    //driver.quit();
  }


  public void youtubeYourName() throws InterruptedException{
    driver.get("https://www.youtube.com/");
    driver.findElement(By.name("search_query")).click();
    driver.findElement(By.name("search_query")).sendKeys("sparkle Your Name" + Keys.ENTER);

    {
      WebElement element = driver.findElement(By.cssSelector(".ytd-item-section-renderer:nth-child(1) > #dismissable #thumbnail #img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".style-scope:nth-child(2) > #label-container")).click();


  }
}
