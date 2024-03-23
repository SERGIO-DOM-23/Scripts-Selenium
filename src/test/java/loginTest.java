import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginTest {

    private WebDriver driver;

    //indica por medio de jUnit la configuracion para el test (loginTest)
    @Before
    public void setUp(){}

    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();

    // aqui se encunetra "el cuerpo de la automatizacion"
    @Test
    public void testLogin(){}

    // indica lo realizado, luego de terminado el test
    @After
    public void tearDwn(){}

}
