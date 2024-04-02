package pruebasConValidaciones;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testValidado05 {
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
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    //el cuerpo de la automatizacion
    @Test
    public void testValidado04() {


        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement botonLogin = driver.findElement(By.xpath("//input[@id='login-button']"));

        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        botonLogin.click();

        WebElement fontText = driver.findElement(By.xpath("//div[@data-test='inventory-item-name']"));
        fontText.click();

        //verificamos el la fuente del texto de la descripcion del producto
        WebElement queFuenteEsLaQueTieneElProducto = driver.findElement(By.xpath("//div[@data-test='inventory-item-name']"));

        String fuenteQueMeTrajo = queFuenteEsLaQueTieneElProducto.getCssValue("font-family");
            System.out.println("la fuente del texto es:"+fuenteQueMeTrajo);


    }
    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
        //driver.quit();
    }
}