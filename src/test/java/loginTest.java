import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
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
        driver.get("http://demo.guru99.com/test/newtours/");
    }

    //el cuerpo de la automatizacion
    @Test
    public void testLogin(){
        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement botonSubmit = driver.findElement(By.xpath("//input[@name='submit']"));

        username.sendKeys("sergio");
        password.sendKeys("123456");
        botonSubmit.click();
    }

    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
        driver.quit();
    }
}