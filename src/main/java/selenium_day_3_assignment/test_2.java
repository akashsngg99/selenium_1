package selenium_day_3_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

	    WebDriver driver = new EdgeDriver();
	    driver.get("https://seleniumbase.io/demo_page");
	    WebElement button= driver.findElement(By.xpath("//div[@class='dropdown']"));
	    Actions builder =new Actions(driver);
	    Action hover= builder.moveToElement(button).build();
	    hover.perform();
	    
	    

	}

}
