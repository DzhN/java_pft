package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.*;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
  private final BrowserEdit browserEdit = new BrowserEdit();
  protected WebDriver driver;
  JavascriptExecutor js;
  private Map<String, Object> vars;

  public void init() {
    browserEdit.browserOpen();
    js = (JavascriptExecutor) browserEdit.authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver;
    vars = new HashMap<String, Object>();
    browserEdit.authorizationHelper.pathHelper.goToInsurancePage();
    browserEdit.authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver.manage().window().setSize(new Dimension(847, 649));
  }

  public void stop() {
    browserEdit.authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver.quit();
  }

  public Map<String, Object> getVars() {
    return vars;
  }

  public void setVars(Map<String, Object> vars) {
    this.vars = vars;
  }

  public void finishEdition() {
    browserEdit.authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.name("commit")).click();
  }

  public void selectLicenceperiod() throws InterruptedException {
    browserEdit.authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("user_licenceperiod")).click();
    {
      WebElement dropdown = browserEdit.authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("user_licenceperiod"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
  }

  public RegistrationFormEdit getRegistrationFormEdit() {
    return browserEdit.authorizationHelper.pathHelper.editionHelper.registrationFormEdit;
  }

  public EditionHelper getEditionHelper() {
    return browserEdit.authorizationHelper.pathHelper.editionHelper;
  }

  public PathHelper getPathHelper() {
    return browserEdit.authorizationHelper.pathHelper;
  }

  public AuthorizationHelper getAuthorizationHelper() {
    return browserEdit.authorizationHelper;
  }

  public BrowserEdit getBrowserEdit() {
    return browserEdit;
  }
}
