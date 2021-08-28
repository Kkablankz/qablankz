package common;

public class Config {
    /**
     * Specify the brwser and platform for test:
     * CHROME
     * MOZILLA
     * */
    public static final String BROWSER_AND_PLATFORM = "CHROME";
    /*
    * Clean browser cookies after each iteration
    * */
    public static final boolean CLEAR_COOKIES = false;
    /*
    *to keep the browser open after all scenario
    * */
    public static final boolean HOLD_BROWSER_OPEN = true;
    /*
    *Clear screenshoots before starting build
    * */
    public static final boolean CLEAR_REPORT_DIRECTORY = true;

}
