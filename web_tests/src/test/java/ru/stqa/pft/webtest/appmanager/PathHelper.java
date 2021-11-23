package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.By;

public class PathHelper {
  protected final EditionHelper editionHelper = new EditionHelper();

  public void goToRegisterPage(By register) {
    editionHelper.registrationFormEdit.driver.findElement(register).click();
  }

  public void goToInsurancePage() {
    editionHelper.registrationFormEdit.driver.get("http://demo.guru99.com/insurance/v1/index.php");
  }

  public void pathSelection() {
    editionHelper.registrationFormEdit.driver.findElement(By.id("ui-id-4")).click();
    editionHelper.registrationFormEdit.driver.findElement(By.id("ui-id-3")).click();
    editionHelper.registrationFormEdit.driver.findElement(By.id("ui-id-5")).click();
  }
}
