package ru.stqa.pft.webtest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditionHelper {
  protected final RegistrationFormEdit registrationFormEdit = new RegistrationFormEdit();

  public void editCountry(By editCountryLocator, String editCountryText) {
    registrationFormEdit.driver.findElement(editCountryLocator);
    registrationFormEdit.driver.findElement(editCountryLocator).sendKeys(editCountryText);
  }

  public void editPhone(By userPhoneLocator, String userPhoneText) {
    registrationFormEdit.driver.findElement(userPhoneLocator).click();
    registrationFormEdit.driver.findElement(userPhoneLocator).sendKeys(userPhoneText);
  }

  public void editSurname(By userSurnameLocator, By userFirstnameLocator, String userFirstnameText) {
    registrationFormEdit.driver.findElement(userSurnameLocator).click();
    sendKeys(By.id("user_surname"), By.id("user_firstname"), By.id("user_phone"), By.id("user_address_attributes_street"), By.id("user_address_attributes_city"), By.id("user_address_attributes_county"), By.id("user_address_attributes_postcode"), "Nikolay", "Nikolay", "88999999999", "street", "city", "country", "sy24 be");
    {
      WebElement element = registrationFormEdit.driver.findElement(userFirstnameLocator);
      Actions builder = new Actions(registrationFormEdit.driver);
      builder.doubleClick(element).perform();
    }
    registrationFormEdit.driver.findElement(userFirstnameLocator).sendKeys(userFirstnameText);
  }

  public void sendKeys(By userSurnameLocator, By userFirstnameLocator, By userPhoneLocator, By userAddressAttributesStreetLocator, By userAddressAttributesCityLocator, By userAddressAttributesCountyLocator, By userAddressAttributesPostcodeLocator, String userSurnameText, String userFirstnameText, String userPhoneText, String userAddressAttributesStreetText, String userAddressAttributesCityText, String userAddressAttributesCountyText, String userAddressAttributesPostcodeText) {
    registrationFormEdit.driver.findElement(userSurnameLocator).sendKeys(userSurnameText);
    registrationFormEdit.driver.findElement(userFirstnameLocator).sendKeys(userFirstnameText);
    registrationFormEdit.driver.findElement(userPhoneLocator).sendKeys(userPhoneText);
    registrationFormEdit.driver.findElement(userAddressAttributesStreetLocator).sendKeys(userAddressAttributesStreetText);
    registrationFormEdit.driver.findElement(userAddressAttributesCityLocator).sendKeys(userAddressAttributesCityText);
    registrationFormEdit.driver.findElement(userAddressAttributesCountyLocator).sendKeys(userAddressAttributesCountyText);
    registrationFormEdit.driver.findElement(userAddressAttributesPostcodeLocator).sendKeys(userAddressAttributesPostcodeText);
    registrationFormEdit.driver.findElement(userFirstnameLocator).click();
    registrationFormEdit.driver.findElement(userFirstnameLocator).click();
  }
}
