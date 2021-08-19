package pages.base;

import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    /*
    * The method for navigating to a specific URL
    * */
    public void goToUrl(String url){
        driver.get(url);
    }
}
