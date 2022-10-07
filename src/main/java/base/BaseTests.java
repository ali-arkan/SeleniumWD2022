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

        //getText by tagname
        WebElement tag1 = driver.findElement(By.tagName("h2"));
        System.out.println(tag1.getText());


        WebElement inputsLinks= driver.findElement(By.linkText("Inputs"));
       inputsLinks.click();






        // Print the title
        System.out.println(driver.getTitle());

        // Quit the browser
        driver.quit();
    }

    public void shiftContent() throws  InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        // create a new driver
        driver = new ChromeDriver();
        //Open a internet site
        driver.get("https://the-internet.herokuapp.com/");

         /* 1. Click Shift Content
        2. Click : Example 1: Menu Element
        3. How many : home, about
         */

        //Click Shift Content
        WebElement clickshiftbutton= driver.findElement(By.linkText("Shifting Content"));
        clickshiftbutton.click();

        //Click : Example 1: Menu Element
        WebElement menuelement= driver.findElement(By.linkText("Example 1: Menu Element"));
        menuelement.click();

        List<WebElement> menuitems = driver.findElements(By.tagName("li"));
        System.out.println("Menu size is: " + menuitems.size());
        //System.out.println("Name of third item is: " + menuitems.get(2).getText());

        for (int i=0;i<menuitems.size();i++)
        {
           var name= menuitems.get(i).getText();
            System.out.println(name);
        }

        // Quit the browser
        driver.quit();

    }


    public static void main(String args[])
    {
        // Call BaseTests Class
        BaseTests test= new BaseTests();
        try {
            //test.setUp();
            test.shiftContent();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
