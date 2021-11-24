package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.webtest.registraationForm.RegistrationForm;

public class RegistrationFormEdit {
  protected WebDriver driver;

  public void fillingOutTheRegistrationForm(RegistrationForm registrationForm, By userFirstnameLocator, By userSurnameLocator, By userPhoneLocator, By userDateOfBirthLocator3, By userDateOfBirthLocator3Click, By userDateOfBirthLocator1, By userDateOfBirthLocator1Click, By userAddressAttributesStreetLocator, String userAddressAttributesStreetText, By userAddressAttributesCityLocator, String userAddressAttributesCityText, By userAddressAttributesCountyLocator, String userAddressAttributesCountyText, By userAddressAttributesPostcodeLocator, String userAddressAttributesPostcodeText, By userDetailAttributesEmailLocator, String userDetailAttributesEmailText, By userDetailAttributesPasswordLocator, String userDetailAttributesPasswordText, By userDetailAttributesPasswordConfirmationLocator, String userDetailAttributesPasswordConfirmationText, By submitLocator) {
    driver.findElement(userFirstnameLocator).sendKeys(registrationForm.firstname());
    driver.findElement(userSurnameLocator).click();
    driver.findElement(userSurnameLocator).sendKeys(registrationForm.surname());
    driver.findElement(userPhoneLocator).click();
    driver.findElement(userPhoneLocator).sendKeys(registrationForm.phoneNumber());
    driver.findElement(userDateOfBirthLocator3).click();
    {
      WebElement dropdown = driver.findElement(userDateOfBirthLocator3);
      dropdown.findElement(userDateOfBirthLocator3Click).click();
    }
    driver.findElement(userDateOfBirthLocator1).click();
    {
      WebElement dropdown = driver.findElement(userDateOfBirthLocator1);
      dropdown.findElement(userDateOfBirthLocator1Click).click();
    }
    driver.findElement(userAddressAttributesStreetLocator).click();
    driver.findElement(userAddressAttributesStreetLocator).sendKeys(userAddressAttributesStreetText);
    driver.findElement(userAddressAttributesCityLocator).click();
    driver.findElement(userAddressAttributesCityLocator).sendKeys(userAddressAttributesCityText);
    driver.findElement(userAddressAttributesCountyLocator).click();
    driver.findElement(userAddressAttributesCountyLocator).sendKeys(userAddressAttributesCountyText);
    driver.findElement(userAddressAttributesPostcodeLocator).click();
    driver.findElement(userAddressAttributesPostcodeLocator).sendKeys(userAddressAttributesPostcodeText);
    driver.findElement(userDetailAttributesEmailLocator).click();
    driver.findElement(userDetailAttributesEmailLocator).sendKeys(userDetailAttributesEmailText);
    driver.findElement(userDetailAttributesPasswordLocator).click();
    driver.findElement(userDetailAttributesPasswordLocator).sendKeys(userDetailAttributesPasswordText);
    driver.findElement(userDetailAttributesPasswordConfirmationLocator).click();
    driver.findElement(userDetailAttributesPasswordConfirmationLocator).sendKeys(userDetailAttributesPasswordConfirmationText);
    driver.findElement(submitLocator).click();
  }
}