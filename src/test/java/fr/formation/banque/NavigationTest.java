package fr.formation.banque;

// Generated by Selenium IDE

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
public class NavigationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    //driver = new ChromeDriver();
    //js = (JavascriptExecutor) driver;
    //vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void navigationChrome() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    
    navigation();
  }
  
  @Test
  public void navigationFirefox() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    
    navigation();
  }
 // @Test
  private void navigation() {
    // Test name: Navigation
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://192.168.18.104/");
    // 2 | setWindowSize | 550x692 | 
    driver.manage().window().setSize(new Dimension(550, 692));
    // 3 | click | css=.navbar | 
    driver.findElement(By.cssSelector(".navbar")).click();
    // 4 | assertText | css=h2 | Bienvenue sur votre Banque en ligne !!!
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Bienvenue sur votre Banque en ligne !!!"));
    // 5 | click | linkText=Accès client | 
    driver.findElement(By.linkText("Accès client")).click();
    // 6 | assertText | css=h3 | Identification Client
    assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Identification Client"));
    // 7 | click | id=authIdentifiant | 
    driver.findElement(By.id("authIdentifiant")).click();
    // 8 | assertElementPresent | id=authIdentifiant | 
    {
      List<WebElement> elements = driver.findElements(By.id("authIdentifiant"));
      assert(elements.size() > 0);
    }
    // 9 | click | id=authMotdepasse | 
    driver.findElement(By.id("authMotdepasse")).click();
    // 10 | assertElementPresent | id=authMotdepasse | 
    {
      List<WebElement> elements = driver.findElements(By.id("authMotdepasse"));
      assert(elements.size() > 0);
    }
    // 11 | assertElementPresent | css=.btn | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".btn"));
      assert(elements.size() > 0);
    }
    // 12 | click | linkText=Nous Contacter | 
    driver.findElement(By.linkText("Nous Contacter")).click();
    // 13 | assertText | css=h3 | Nous contacter
    assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Nous contacter"));
    // 14 | close |  |
    //---inutile car on fait un driver.quite() dans tearDown
   // driver.close();
  }
}
