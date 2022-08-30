package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class goToCartPage {
    private static WebDriver driver;
    private By goToCartBtn = By.cssSelector("#sw-gtc > span > a");

    public goToCartPage(WebDriver driver){
        this.driver = driver;
    }

    public CartPage pressGoToCart(){
        driver.findElement(goToCartBtn).click();
        return new CartPage(driver);
    }
    public static String addedToCartString(){
        return driver.findElement(By.xpath("//span[normalize-space()='Added to Cart']")).getText();
    }
}
