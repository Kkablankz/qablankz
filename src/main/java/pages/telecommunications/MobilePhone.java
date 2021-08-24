package pages.telecommunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhone extends BasePage {
    public MobilePhone(WebDriver driver) {
        super(driver);
    }
    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");
    // private final By inputName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    /*
    *   Choose a card from the wallet
    * */
    public MobilePhone selectChooseFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }
    /*
    * Enter phone number excluding country code
    *@param number phone number
    * */
    public MobilePhone enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }
    /*
    * @param amount for positive test
    * */
    public MobilePhone enterAmount(String amount){
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }
    /*
    * Enter Card from Test Data
    * */
    public MobilePhone enterCardFrom(String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }
    /*
    * Enter Expdate without '/'
    */
    public MobilePhone enterCardExpDate (String expDate){
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }
    /*
    * Enter cvv from Test Data
    * */
    public MobilePhone enterCardCvv(String cvv){
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }
    /*
    * Submit Card
    * */
    public MobilePhone SubmitToTheCard(){
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }
    /*
     * Check visibility Name after Submitted
     * */
    public MobilePhone checkNameVisibility(String text){
      WebElement details = driver.findElement(inputName);
      waitElementIsVisible(details);
      Assertions.assertEquals(text, details.getText());
        return this;
    }
    }



