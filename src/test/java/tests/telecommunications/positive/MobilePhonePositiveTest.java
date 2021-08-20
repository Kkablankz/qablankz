package tests.telecommunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhonePositiveTest extends BaseTest {
    @Test
    public void checkRedirectToAuth(){
       basePage.goToUrl(MOBILE_PAYMENT_URL);
       mobilePhone.selectChooseFromWallet();
       basePage.isAuthWidgetPresent();
    }
}
