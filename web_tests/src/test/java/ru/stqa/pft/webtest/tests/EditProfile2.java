package ru.stqa.pft.webtest.tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class EditProfile2 extends TestBase {

  @Test
  public void testEditProfile2 () {

    app.getAuthorizationHelper().authorization(By.name("submit"));
    app.getPathHelper().pathSelection();
    app.getEditionHelper(By.id("user_address_attributes_county"), "Испания");
    app.finishEdition();
  }
}
