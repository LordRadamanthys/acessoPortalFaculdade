package pages;

import model.FinancasHistoric;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.SomeTools;

import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    private WebDriver driver;
    private WebDriverWait wait;


    public Dashboard(WebDriver drive) {
        this.driver = drive;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void finaceiro() throws InterruptedException {
        List<FinancasHistoric> list = new ArrayList();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Financeiro"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='Demonstrativo']"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("mask-loading")));
        List<WebElement> elements = driver.findElements(By.xpath("//tr//following-sibling:: tr//td//parent::tr"));

        for (WebElement element : elements) {
            List<WebElement> td = element.findElements(By.tagName("td"));
            list.add(new FinancasHistoric(
                    td.get(0).getText().trim(),
                    td.get(2).getText().trim(),
                    td.get(3).getText().trim(),
                    td.get(5).getText().trim(),
                    td.get(6).getText().trim(),
                    td.get(7).getText().trim()
            ));
        }

        SomeTools.gerarJson(list);
    }


}
