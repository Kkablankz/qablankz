package tests.telecommunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.MobilePhoneTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class

MobilePhonePositiveTest extends BaseTest {
    @Test
    public void checkRedirectToAuth(){
       basePage.goToUrl(MOBILE_PAYMENT_URL);
       mobilePhone.selectChooseFromWallet();
       basePage.isAuthWidgetPresent();
    }
    @Test
    public void checkMinimumReplenishmentAmount(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhone
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount(MOBILE_PAYMENT_AMOUNT)
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXPDATE)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .SubmitToTheCard()
                .checkNameVisibility("First name");
    }
}
