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
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
    }

    //el cuerpo de la automatizacion
    @Test
    public void comprasVueloTest(){
        WebElement type = driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement passangersCant = driver.findElement(By.xpath("//option[@value='4']"));
        WebElement departingFrom = driver.findElement(By.xpath("//option[@value='Frankfurt']"));
        WebElement onMonth = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option[3]"));
        WebElement onDay = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]/option[30]"));
        WebElement arriving = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[10]"));
        WebElement returningMonth = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]/option[4]"));
        WebElement returningDay = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]/option[10]"));
        WebElement serviceClass = driver.findElement(By.xpath("//input[@value='Business']"));
        WebElement airline = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[4]"));
        WebElement botonContinue = driver.findElement(By.xpath("//input[@type='image']"));



        type.click();
        passangersCant.click();
        departingFrom.click();
        onMonth.click();
        onDay.click();
        arriving.click();
        returningMonth.click();
        returningDay.click();
        serviceClass.click();
        airline.click();
        botonContinue.click();
    }

    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
       // driver.quit();
    }
}