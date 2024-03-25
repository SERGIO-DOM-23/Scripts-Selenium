import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerTest {
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
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }

    //el cuerpo de la automatizacion
    @Test
    public void registerTest(){
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        WebElement email = driver.findElement(By.xpath("//input[@name='userName']"));
        WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        WebElement stateProvince = driver.findElement(By.xpath("//input[@name='state']"));
        WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        WebElement botonSubmit = driver.findElement(By.xpath("//input[@name='submit']"));

        firstName.sendKeys("Sergio");
        lastName.sendKeys("Dominguez");
        phone.sendKeys("3815640844");
        email.sendKeys("sergio123@gmail.com");
        address.sendKeys("psj marti 2571");
        city.sendKeys("San Miguel Tucuman");
        stateProvince.sendKeys("Tucuman");
        postalCode.sendKeys("4000");
        country.sendKeys("ARGENTINA");
        userName.sendKeys("sergioGURU");
        password.sendKeys("user123");
        confirmPassword.sendKeys("user123");
        botonSubmit.click();
    }

    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
       // driver.quit();
    }
}