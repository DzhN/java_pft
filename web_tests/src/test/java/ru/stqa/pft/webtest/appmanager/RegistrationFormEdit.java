package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.webtest.registraationForm.RegistrationForm;

public class RegistrationFormEdit {
  protected WebDriver driver;

  public void fillingOutTheRegistrationForm(RegistrationForm registrationForm) {
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
}
