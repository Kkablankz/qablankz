package pages.telecommunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhone extends BasePage {
    public MobilePhone(WebDriver driver) {
        super(driver);
    }
    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[1]/div/div/div[2]/div[3]/div[1]/input");
    private final By inputAmount = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[2]/div/div[1]/div[2]/input");
    private final By inputCardFrom = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[4]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/input");
    private final By inputCardExpDate = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[4]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/input");
    private final By inputCardCvv = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[4]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/input");
    private final By buttonSubmitToTheCard = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[6]/div/button/div");

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
    }

