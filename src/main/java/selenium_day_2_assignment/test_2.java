package selenium_day_2_assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class test_2 {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        WebElement customerIdInput = driver.findElement(By.name("cusid"));
        WebElement submitButton = driver.findElement(By.name("submit"));
        customerIdInput.sendKeys("1234");

        submitButton.click();

        Alert alert = driver.switchTo().alert();

        alert.accept();
        
        //driver.close();

	}

}
