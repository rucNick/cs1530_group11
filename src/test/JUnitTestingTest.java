// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.MatcherAssert.assertThat;
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

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JUnitTestingTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1GENRALINFOEXIST() {
    driver.get("https://cs1530.elias.eu.org/");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".sm\\3Atext-3xl"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".gap-8 > div:nth-child(1)"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".gap-8 > div:nth-child(2)"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".gap-8 > div:nth-child(3)"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST2CATEGORYEXIST() {
    driver.get("https://cs1530.elias.eu.org/");
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-1\']")).getText(), is("Appetizers"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-2\']")).getText(), is("Main Course"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-3\']")).getText(), is("Desserts"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-4\']")).getText(), is("Beverages"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-5\']")).getText(), is("Vegetarian"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-6\']")).getText(), is("Seafood"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-7\']")).getText(), is("Spicy"));
    assertThat(driver.findElement(By.id("radix-:r3:-trigger-8")).getText(), is("Chef Specials"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-9\']")).getText(), is("Gluten-Free"));
    assertThat(driver.findElement(By.xpath("//button[@id=\'radix-:r3:-trigger-10\']")).getText(), is("Kids Menu"));
  }
  @Test
  public void tEST3CARTEXIST() {
    driver.get("https://cs1530.elias.eu.org/");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'root\']/div/div/div/div/div[2]/a/button"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div/div[2]/a/button")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'root\']/div[2]/div")));
    }
  }
  @Test
  public void tEST4AUTHEXIST() {
    driver.get("https://cs1530.elias.eu.org");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'root\']/div/div/div/div/div[2]/a[2]/button"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div/div[2]/a[2]/button")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'root\']/div/div/div")));
    }
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
    }
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div[4]/button")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'root\']/div/div/div")));
    }
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
    }
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
    }
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
    }
  }
  @Test
  public void tEST5MENUITEMEXIST() {
    driver.get("https://cs1530.elias.eu.org");
    assertThat(driver.findElement(By.xpath("//div[@id=\'1\']/div[2]/div/div/div/div/div/div")).getText(), is("Crispy Calamari"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'1\']/div[2]/div/div[2]/div/div/div/div")).getText(), is("Spinach Artichoke Dip"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'1\']/div[2]/div/div[3]/div/div/div/div")).getText(), is("Bruschetta"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'1\']/div[2]/div/div[4]/div/div/div/div")).getText(), is("Spicy Chicken Wings"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'1\']/div[2]/div/div[5]/div/div/div/div")).getText(), is("Caesar Salad"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'1\']/div[2]/div/div[6]/div/div/div/div")).getText(), is("French Onion Soup"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'2\']/div[2]/div/div/div/div/div/div")).getText(), is("Grilled Salmon"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'2\']/div[2]/div/div[2]/div/div/div/div")).getText(), is("Filet Mignon"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'2\']/div[2]/div/div[3]/div/div/div/div")).getText(), is("Vegetable Stir Fry"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'2\']/div[2]/div/div[4]/div/div/div/div")).getText(), is("Margherita Pizza"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'2\']/div[2]/div/div[5]/div/div/div/div")).getText(), is("Shrimp Scampi"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'2\']/div[2]/div/div[6]/div/div/div/div")).getText(), is("Mushroom Risotto"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'2\']/div[2]/div/div[7]/div/div/div/div")).getText(), is("Lobster Mac and Cheese"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'3\']/div[2]/div/div/div/div/div/div")).getText(), is("Chocolate Lava Cake"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'3\']/div[2]/div/div[2]/div/div/div/div")).getText(), is("New York Cheesecake"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'3\']/div[2]/div/div[3]/div/div/div/div")).getText(), is("Tiramisu"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'3\']/div[2]/div/div[4]/div/div/div/div")).getText(), is("Fresh Fruit Sorbet"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'4\']/div[2]/div/div/div/div/div/div")).getText(), is("Craft IPA"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'4\']/div[2]/div/div[2]/div/div/div/div")).getText(), is("Classic Mojito"));
  }
  @Test
  public void tEST6CATEGORYREDIRECT() {
    driver.get("https://cs1530.elias.eu.org");
    driver.findElement(By.id("radix-:r3:-trigger-1")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'1\']/div[2]/div")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-2")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'2\']")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-3")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'3\']")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-4")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'4\']")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-5")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("5")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-6")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("6")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-7")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'7\']")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-8")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'8\']")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-9")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'9\']")));
    }
    driver.findElement(By.id("radix-:r3:-trigger-10")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'10\']")));
    }
  }
}
