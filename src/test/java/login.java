import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

    WebDriver driver = new ChromeDriver();

    @Test
    public void openWebsite(){
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void tryLogin(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
    }
}
