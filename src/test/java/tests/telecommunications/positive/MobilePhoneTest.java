package tests.telecommunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneTest extends BaseTest {
    @Test
    public void checkRedirectToAuth(){
       basePage.goToUrl(MOBILE_PAYMENT_URL);
    }
}
