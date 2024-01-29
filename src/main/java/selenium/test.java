package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

        // Create a new instance of the EdgeDriver
        WebDriver driver = new EdgeDriver();

        
        driver.get("https://www.google.com");
        
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        // Navigate to the website
        driver.get("https://www.saucedemo.com");
        //driver.get("https://mail.google.com/");
        // Login
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys("problem_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

        // Add items to cart
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();
        
        WebElement orderButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

        orderButton.click();
        // Close the browser window
//        driver.quit();
	}

}
