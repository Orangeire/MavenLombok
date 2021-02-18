package SeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeniusTest {

    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\прога\\chromewebdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.manage().window().maximize();
        driver.get("https://genius.com/");

    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
