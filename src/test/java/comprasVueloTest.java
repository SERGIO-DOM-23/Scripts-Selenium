import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comprasVueloTest {
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
    public void comprasVueloTest(){
        WebElement type = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement passangers = driver.findElement(By.xpath("//select[@name='passCount']"));
        WebElement departingFrom = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement onMonth = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement onDay = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement arriving = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement returningMonth = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement returningDay = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement serviceClass = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement airline = driver.findElement(By.xpath("//input[@value='oneway']"));

        type.sendKeys();







        //botonSubmit.click("");
    }

    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
       // driver.quit();
    }
}