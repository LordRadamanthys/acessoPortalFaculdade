package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    private WebDriver driver;
    private String user;
    private String password;
    private WebDriverWait wait;

    public Login(WebDriver driver) {
        this.driver = driver;
        this.user = System.getenv("user");
        this.password = System.getenv("password");
        this.wait = new WebDriverWait(driver, 60);
    }

    public void areaAluno() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary"))).click();
    }

    public void blackBoard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn btn-black btn-sm no-margin"))).click();
    }
}
