package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class carAccessories {
    private WebDriver driver;
    public String firstItemText;

    //    WebElement webelement = new WebDriverWait(driver, 25)
//            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='RESULTS']")));
    public carAccessories(WebDriver driver){
        this.driver = driver;
    }
    public void Wait(int secs) {
        driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
    }


    public productPage clickOnfirstItem(){
        List<WebElement> resultsList = driver.findElements(By.xpath(".//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        firstItemText = resultsList.get(1).getText();
        resultsList.get(1).click();
        return new productPage(driver);
    }



}
