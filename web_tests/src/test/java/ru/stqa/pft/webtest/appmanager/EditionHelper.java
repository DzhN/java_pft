package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditionHelper {
  protected final RegistrationFormEdit registrationFormEdit = new RegistrationFormEdit();

  public void editBirthDate() {
    registrationFormEdit.driver.findElement(By.id("user_dateofbirth_1i")).click();
    {
      WebElement dropdown = registrationFormEdit.driver.findElement(By.id("user_dateofbirth_1i"));
      dropdown.findElement(By.xpath("//option[. = '1991']")).click();
    }
    registrationFormEdit.driver.findElement(By.id("user_dateofbirth_2i")).click();
    {
      WebElement dropdown = registrationFormEdit.driver.findElement(By.id("user_dateofbirth_2i"));
      dropdown.findElement(By.xpath("//option[. = 'December']")).click();
    }
    registrationFormEdit.driver.findElement(By.id("user_dateofbirth_3i")).click();
    {
      WebElement dropdown = registrationFormEdit.driver.findElement(By.id("user_dateofbirth_3i"));
      dropdown.findElement(By.xpath("//option[. = '19']")).click();
    }
  }

  public void editPhone() {
    registrationFormEdit.driver.findElement(By.id("user_phone")).click();
    registrationFormEdit.driver.findElement(By.id("user_phone")).sendKeys("89992450000");
  }

  public void editSurname() {
    registrationFormEdit.driver.findElement(By.id("user_surname")).click();
    sendKeys();
    {
      WebElement element = registrationFormEdit.driver.findElement(By.id("user_firstname"));
      Actions builder = new Actions(registrationFormEdit.driver);
      builder.doubleClick(element).perform();
    }
    registrationFormEdit.driver.findElement(By.id("user_firstname")).sendKeys("Dzhanaev");
  }

  public void sendKeys() {
    registrationFormEdit.driver.findElement(By.id("user_surname")).sendKeys("Nikolay");
    registrationFormEdit.driver.findElement(By.id("user_firstname")).sendKeys("Nikolay");
    registrationFormEdit.driver.findElement(By.id("user_phone")).sendKeys("88999999999");
    registrationFormEdit.driver.findElement(By.id("user_address_attributes_street")).sendKeys("street");
    registrationFormEdit.driver.findElement(By.id("user_address_attributes_city")).sendKeys("city");
    registrationFormEdit.driver.findElement(By.id("user_address_attributes_county")).sendKeys("country");
    registrationFormEdit.driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("sy24 be");
    registrationFormEdit.driver.findElement(By.id("user_firstname")).click();
    registrationFormEdit.driver.findElement(By.id("user_firstname")).click();
  }
}
