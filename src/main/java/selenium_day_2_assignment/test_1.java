package selenium_day_2_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com");
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys("problem_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();
        
        
        WebDriverWait wait = new WebDriverWait(driver, 100);
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"shopping_cart_container\\\"]/a")));
        checkoutButton.click();

        
        //WebElement orderButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        
        //orderButton.click();

	}


}
