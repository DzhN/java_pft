package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.By;

public class AuthorizationHelper {
  protected final PathHelper pathHelper = new PathHelper();

  public void authAfterRegistration() {
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("email")).click();
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("email")).sendKeys("djanai9219@gmail.com");
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("password")).click();
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("password")).sendKeys("Qwerty1");
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.name("submit")).click();
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.cssSelector("h4")).click();
  }

  public void authorization() {
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("email")).click();
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("email")).sendKeys("djanai9219@gmail.com");
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("password")).click();
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.id("password")).sendKeys("Qwerty1");
    pathHelper.editionHelper.registrationFormEdit.driver.findElement(By.name("submit")).click();
  }
}
