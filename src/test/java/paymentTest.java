import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paymentTest {
    private WebDriver driver;

    //indica por medio de junit la configuracion para este test (clase loginTest)
    @Before
    public void setUp(){
        //indica donde esta el driver con el que voy a automatizar
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        //le indicamos a la variable driver de selenium, que vamos a trabajar con el driver de chrome
        driver = new ChromeDriver();
        //maximizar la pantalla
        driver.manage().window().maximize();
        //indicar al driver que se dirija a la pagina que vamos a testear
        driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    //el cuerpo de la automatizacion
    @Test
    public void paymentTest(){
        WebElement quantity = driver.findElement(By.xpath("/html/body/section/div/form/div/div[4]/select/option[3]"));
        quantity.click();

        WebElement buyNow = driver.findElement(By.xpath("//input[@value='Buy Now']"));
        buyNow.click();

        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='card_nmuber']"));
        cardNumber.sendKeys("4916373434510810");

        WebElement expirationMonth = driver.findElement(By.xpath("/html/body/section/div/form/div[2]/div/div[6]/div/select/option[3]"));
        expirationMonth.click();

        WebElement expirationYear = driver.findElement(By.xpath("/html/body/section/div/form/div[2]/div/div[8]/div/select/option[3]"));
        expirationYear.click();

        WebElement CVVcode = driver.findElement(By.xpath("//input[@id='cvv_code']"));
        CVVcode.sendKeys("613");

        WebElement pay = driver.findElement(By.xpath("//input[@class='button special']"));
        pay.click();



    }

    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
       // driver.quit();
    }
}