package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;
    private By searchBar = By.id("twotabsearchtextbox");
    private By todaysDeals = By.cssSelector("#nav-xshop > a:nth-child(2)");
    private By dontChangeBtn = By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input");





    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public carAccessories MakeSearch(String item){
        driver.findElement(searchBar).sendKeys(item + Keys.ENTER);
        return new carAccessories(driver);
    }
    public todayDealsPage pressTodayDeals(){
        driver.findElement(todaysDeals).click();
        return new todayDealsPage(driver);
    }
    public void pressDontChange(){
        driver.findElement(dontChangeBtn).click();
    }


    public void Wait(int secs) {
        driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
    }


}
