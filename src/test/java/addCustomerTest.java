import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCustomerTest {
    private WebDriver driver;

    //indica por medio de junit la configuracion para este test (clase customerTest)
    @Before
    public void setUp(){
        //indica donde esta el driver con el que voy a automatizar
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        //le indicamos a la variable driver de selenium, que vamos a trabajar con el driver de chrome
        driver = new ChromeDriver();
        //maximizar la pantalla
        driver.manage().window().maximize();
        //indicar al driver que se dirija a la pagina que vamos a testear
        driver.get("https://demo.guru99.com/telecom/addcustomer.php");
    }

    //el cuerpo de la automatizacion
    @Test
    public void addCustomerTest(){

        //WebElement addCustomer = driver.findElement(By.xpath("//a[@href='addcustomer.php'][1]"));
        //WebElement closePopUp = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/svg/path[2]"));
        WebElement backgroundCheck = driver.findElement(By.xpath("/html/body/section/div/form/div/div[1]/label"));
        WebElement firstName = driver.findElement(By.xpath("//input[@name='fname']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lname']"));
        WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
        WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));
        WebElement phone = driver.findElement(By.xpath("//input[@name='telephoneno']"));
        WebElement botonSubmit = driver.findElement(By.xpath("//input[@name='submit']"));


        //addCustomer.click();
        //closePopUp.click();
        backgroundCheck.click();
        firstName.sendKeys("Sergio");
        lastName.sendKeys("Dominguez");
        email.sendKeys("sergio123@gmail.com");
        address.sendKeys("psj marti 2571");
        phone.sendKeys("3815640844");
        botonSubmit.click();
    }

    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
       // driver.quit();
    }
}