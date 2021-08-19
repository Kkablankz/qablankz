package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.car_loans.CarLoansPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CarLoansPage carLoansPage = new CarLoansPage(driver);
}
