package ru.stqa.pft.webtest.tests;// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import ru.stqa.pft.webtest.registraationForm.RegistrationForm;

public class WebTestTest extends TestBase {

  @Test
  public void webTest() {
    app.getPathHelper().goToRegisterPage(By.linkText("Register"));
    app.getRegistrationFormEdit().fillingOutTheRegistrationForm(new RegistrationForm("Nikolay", "Nikolay", "8999999999"));
    app.getAuthorizationHelper().authAfterRegistration();
  }

}