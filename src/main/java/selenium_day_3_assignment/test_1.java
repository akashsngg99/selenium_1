package selenium_day_3_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test_1 {

    public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

    WebDriver driver = new EdgeDriver();
    driver.get("https://the-internet.herokuapp.com/upload");
    
    WebElement uploads= driver.findElement(By.xpath("//input[@id='file-upload']"));
    String fname= "D:\\\\aadhar_back.jpg";
    uploads.sendKeys(fname);
    WebElement submit= driver.findElement(By.xpath("//input[@value='Upload']"));
    submit.click();
    System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).getText());
    


}
}

