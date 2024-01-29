package selenium_day_2_assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class test_3 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");

       
        List<WebElement> val=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[2]"));
        
		for ( WebElement vals : val) {
        	System.out.println(vals.getText());
        }
        
        driver.quit();
    }
}

