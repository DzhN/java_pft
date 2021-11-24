package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.By;

public class AuthorizationHelper {
  protected final PathHelper pathHelper = new PathHelper();

  public void authAfterRegistration(By submitLocator) {
    login(By.id("email"), "djanai9219@gmail.com");
    password(By.id("password"), "Qwerty1");
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(submitLocator).click();
  }

  private void password(By locator, String passwordText) {
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(locator).click();
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(locator).sendKeys(passwordText);
  }

  private void login(By locator, String loginText) {
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(locator).click();
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(locator).sendKeys(loginText);
  }

  public void authorization(By submitLocatorFirstAutht) {
    login(By.id("email"), "djanai9219@gmail.com");
    password(By.id("password"), "Qwerty1");
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(submitLocatorFirstAutht).click();
  }
}
