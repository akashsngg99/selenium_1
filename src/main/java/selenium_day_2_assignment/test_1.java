package selenium_day_2_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");
        
       
        driver.get("https://www.saucedemo.com");

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys("problem_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();
        
        
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        
        WebElement orderButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

        orderButton.click();

	}


}
