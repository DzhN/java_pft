package ru.stqa.pft.webtest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestBase {
  protected WebDriver driver;
  JavascriptExecutor js;
  private Map<String, Object> vars;

  @Before
  public void setUp() {
    browserOpen();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    goToInsurancePage();
    driver.manage().window().setSize(new Dimension(847, 649));
  }

  private void browserOpen() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\na_dzhanaev\\Desktop\\chromedriver.exe");
    driver = new ChromeDriver();
    WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  protected void authAfterRegistration() {
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("djanai9219@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Qwerty1");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("h4")).click();
  }

  protected void fillingOutTheRegistrationForm(RegistrationForm registrationForm) {
    driver.findElement(By.id("user_firstname")).sendKeys(registrationForm.firstname());
    driver.findElement(By.id("user_surname")).click();
    driver.findElement(By.id("user_surname")).sendKeys(registrationForm.surname());
    driver.findElement(By.id("user_phone")).click();
    driver.findElement(By.id("user_phone")).sendKeys(registrationForm.phoneNumber());
    driver.findElement(By.id("user_dateofbirth_3i")).click();
    {
      WebElement dropdown = driver.findElement(By.id("user_dateofbirth_3i"));
      dropdown.findElement(By.xpath("//option[. = '20']")).click();
    }
    driver.findElement(By.id("user_dateofbirth_1i")).click();
    {
      WebElement dropdown = driver.findElement(By.id("user_dateofbirth_1i"));
      dropdown.findElement(By.xpath("//option[. = '1950']")).click();
    }
    driver.findElement(By.id("user_address_attributes_street")).click();
    driver.findElement(By.id("user_address_attributes_street")).sendKeys("street");
    driver.findElement(By.id("user_address_attributes_city")).click();
    driver.findElement(By.id("user_address_attributes_city")).sendKeys("city");
    driver.findElement(By.id("user_address_attributes_county")).click();
    driver.findElement(By.id("user_address_attributes_county")).sendKeys("country");
    driver.findElement(By.id("user_address_attributes_postcode")).click();
    driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("sy24 be");
    driver.findElement(By.id("user_user_detail_attributes_email")).click();
    driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("djanai9219@gmail.com");
    driver.findElement(By.cssSelector(".newadd:nth-child(6) > div:nth-child(2)")).click();
    driver.findElement(By.id("user_user_detail_attributes_password")).click();
    driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Qwerty1");
    driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).click();
    driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Qwerty1");
    driver.findElement(By.name("submit")).click();
  }

  protected void goToRegisterPage(By register) {
    driver.findElement(register).click();
  }

  protected void goToInsurancePage() {
    driver.get("http://demo.guru99.com/insurance/v1/index.php");
  }

  public Map<String, Object> getVars() {
    return vars;
  }

  public void setVars(Map<String, Object> vars) {
    this.vars = vars;
  }

  protected void editBirthDate() {
    driver.findElement(By.id("user_dateofbirth_1i")).click();
    {
      WebElement dropdown = driver.findElement(By.id("user_dateofbirth_1i"));
      dropdown.findElement(By.xpath("//option[. = '1991']")).click();
    }
    driver.findElement(By.id("user_dateofbirth_2i")).click();
    {
      WebElement dropdown = driver.findElement(By.id("user_dateofbirth_2i"));
      dropdown.findElement(By.xpath("//option[. = 'December']")).click();
    }
    driver.findElement(By.id("user_dateofbirth_3i")).click();
    {
      WebElement dropdown = driver.findElement(By.id("user_dateofbirth_3i"));
      dropdown.findElement(By.xpath("//option[. = '19']")).click();
    }
  }

  protected void editPhone() {
    driver.findElement(By.id("user_phone")).click();
    driver.findElement(By.id("user_phone")).sendKeys("89992450000");
  }

  protected void editSurname() {
    driver.findElement(By.id("user_surname")).click();
    sendKeys();
    {
      WebElement element = driver.findElement(By.id("user_firstname"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("user_firstname")).sendKeys("Dzhanaev");
  }

  private void sendKeys() {
    driver.findElement(By.id("user_surname")).sendKeys("Nikolay");
    driver.findElement(By.id("user_firstname")).sendKeys("Nikolay");
    driver.findElement(By.id("user_phone")).sendKeys("88999999999");
    driver.findElement(By.id("user_address_attributes_street")).sendKeys("street");
    driver.findElement(By.id("user_address_attributes_city")).sendKeys("city");
    driver.findElement(By.id("user_address_attributes_county")).sendKeys("country");
    driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("sy24 be");
    driver.findElement(By.id("user_firstname")).click();
    driver.findElement(By.id("user_firstname")).click();
  }

  protected void authorization() {
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("djanai9219@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Qwerty1");
    driver.findElement(By.name("submit")).click();
  }

  protected void pathSelection() {
    driver.findElement(By.id("ui-id-4")).click();
    driver.findElement(By.id("ui-id-3")).click();
    driver.findElement(By.id("ui-id-5")).click();
  }

  protected void finishEdition() {
    driver.findElement(By.name("commit")).click();
  }

  protected void selectLicenceperiod() throws InterruptedException {
    driver.findElement(By.id("user_licenceperiod")).click();
    wait(2000);
    {
      WebElement dropdown = driver.findElement(By.id("user_licenceperiod"));
      wait(2000);
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
  }
}
