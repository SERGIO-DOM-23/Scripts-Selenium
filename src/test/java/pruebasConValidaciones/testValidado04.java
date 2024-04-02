package pruebasConValidaciones;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testValidado04 {
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

        WebElement botonCarrito = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        botonCarrito.click();
        WebElement botonCheckOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        botonCheckOut.click();
        //WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        //firstName.sendKeys("sergio");
        WebElement botonContinue = driver.findElement(By.xpath("//input[@id='continue']"));
        botonContinue.click();

        //validamos la existencia del mensaje "completar campo"
        WebElement mensajeError = driver.findElement(By.xpath("//h3[contains(text(),'Error: First Name is required')]"));

        String mensajeErrorMostrado = mensajeError.getText();
        String mensajeMostrado = "//h3[contains(text(),'Error: First Name is required')]";
        if (mensajeMostrado.equals(mensajeErrorMostrado));
        System.out.println("mensaje para completar campos mostrado, TEST PASO");



      //  System.out.println(driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).isEnabled()+"EL BOTON IS ENABLED");
    }
    //indica lo que se realiza luego de terminar el test
    @After
    public void tearDown(){
        //driver.quit();
    }
}