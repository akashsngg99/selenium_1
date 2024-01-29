package selenium_day_2_assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class test_4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://seleniumbase.io/demo_page");

        driver.switchTo().frame(0);
/*
        WebElement textElement = driver.findElement(By.xpath("//h4[contains(text(),'iFrame Text')]"));
        String textFromFrame = textElement.getText();
        System.out.println("Text from the frame: " + textFromFrame);
*/         System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'iFrame Text')]")).getText());
        driver.switchTo().defaultContent();

        }
}
