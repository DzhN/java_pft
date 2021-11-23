package ru.stqa.pft.webtest;// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class WebTestTest extends TestBase {

  @Test
  public void webTest() {
    goToRegisterPage(By.linkText("Register"));
    fillingOutTheRegistrationForm(new RegistrationForm("Nikolay", "Nikolay", "8999999999"));
    authAfterRegistration();
  }

}
