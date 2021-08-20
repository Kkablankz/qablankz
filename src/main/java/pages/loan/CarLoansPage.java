package pages.loan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {
    WebDriver driver;
    public CarLoansPage(WebDriver driver) {
    this.driver = driver;
    }
    public final By tabAggrements = By.xpath("//*[@id=\"app\"]/div[2]/section/div[2]/a[2]/div");

    public CarLoansPage selectAggrementsTab(){
        driver.findElement(tabAggrements).click();
        return this;
    }
}
