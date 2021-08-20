package pages.telecommunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhone extends BasePage {
    public MobilePhone(WebDriver driver) {
        super(driver);
    }
    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");

    public MobilePhone selectChooseFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }
    }
