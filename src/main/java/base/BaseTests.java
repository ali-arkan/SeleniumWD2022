package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class BaseTests {
    //initiate the Webdriver
    private WebDriver driver;
    public void setUp() throws InterruptedException {

        //Set chrome driver properties
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        // create a new driver
        driver = new ChromeDriver();
        //Open a internet site
        driver.get("https://the-internet.herokuapp.com/");

        //Set page size
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //driver.manage().window().setSize(new Dimension (768,1024));

        // size of tag=A
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //Click Input link
       WebElement inputsLinks= driver.findElement(By.linkText("Inputs"));
       inputsLinks.click();




        // Print the title
        System.out.println(driver.getTitle());

        // Quit the browser
        driver.quit();
    }


    public static void main(String args[])
    {
        // Call BaseTests Class
        BaseTests test= new BaseTests();
        try {
            test.setUp();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
