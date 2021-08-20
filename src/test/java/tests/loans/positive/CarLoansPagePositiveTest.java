package tests.loans.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CAR_LEASING_URL;

public class CarLoansPagePositiveTest extends BaseTest {
    @Test
    public void selectAggrementTablePublicSession(){
        basePage.goToUrl(CAR_LEASING_URL);
        carLoansPage.selectAggrementsTab();
        basePage.isAuthWidgetPresent();
    }
}
