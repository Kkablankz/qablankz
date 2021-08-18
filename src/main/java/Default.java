import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Default {
    private WebDriver driver;
    String baseUrl = "https://icode.kz";
    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        System.out.println("dsadas");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        try{
            driver.get(baseUrl);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Thread.sleep(1000);

    }
    @After
    public void cleanUp(){
        System.out.println("Close browser");

        if (driver != null)
            driver.quit();
    }
    @Test
    public void openLanding() throws InterruptedException {
        System.out.println("Проверка Tittle");
        Assert.assertEquals("IKOD - Новые пути развития Вашего бизнеса",driver.getTitle());

        System.out.println("Проверка Главного текста");
        Assert.assertEquals("Новые пути развития\n" +
                "Вашего бизнеса", driver.findElement(
                By.xpath("//header/div/div[1]/div[1]/h1")).getText());
        System.out.println("Переход в Контакты");
        WebElement ContactUs = driver.findElement(By.className("btn__outline"));
        ContactUs.click();
        Thread.sleep(2000);

        driver.findElement(
                By.id("feedback-modal-phone")).sendKeys("77471112233");
        driver.findElement(
                By.id("feedback-modal-name")).sendKeys("Test");
        driver.findElement(
                By.xpath("//*[@id=\"modal-center\"]/div/div/div[1]/form/div[2]/button")).click();

        Thread.sleep(2000);
        Assert.assertEquals("Произошла ошибка при отправке формы!", driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/h3")).getText());
    }
}

