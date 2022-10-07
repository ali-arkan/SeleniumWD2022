package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTests {
    //initiate the Webdriver
    private WebDriver driver;
    public void setUp()
    {

        //Set chrome driver properties
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        // set new driver
        driver = new ChromeDriver();
        //Open a internet site
        driver.get("https://the-internet.herokuapp.com/");

        //Resize page size
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //driver.manage().window().setSize(new Dimension (768,1024));

        // Print the title
        System.out.println(driver.getTitle());

        // Quit the browser
        driver.quit();
    }


    public static void main(String args[])
    {
        // Call BaseTests Class
        BaseTests test= new BaseTests();
        test.setUp();
    }

}
