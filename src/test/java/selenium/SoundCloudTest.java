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
public class SoundCloudTest {
  private WebDriver driver;

  @Before
  public void setUp() {
    driver = new FirefoxDriver();

  }
  @After
  public void tearDown() {
   // driver.quit();
  }
  @Test
  public void yourName() throws InterruptedException {
    driver.get("https://soundcloud.com/discover");
    Thread.sleep(2000);
    driver.findElement(By.name("q")).sendKeys("Sparkle Kimi No Na Wa" + Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div/ul/li[1]/div/div/div/div[2]/div[1]/div/div/div[2]/a/span")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/a")).click();


  }
}
