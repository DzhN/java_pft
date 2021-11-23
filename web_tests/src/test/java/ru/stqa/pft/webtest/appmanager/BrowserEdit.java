package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserEdit {
  protected final AuthorizationHelper authorizationHelper = new AuthorizationHelper();

  public void browserOpen() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\na_dzhanaev\\Desktop\\chromedriver.exe");
    authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver = new ChromeDriver();
    WebDriver.Timeouts implicitlyWait = authorizationHelper.pathHelper.editionHelper.registrationFormEdit.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
}
