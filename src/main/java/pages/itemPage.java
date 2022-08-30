package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class itemPage {
    private WebDriver driver;
    private By addToCartBtn = By.id("add-to-cart-button");

    public itemPage(WebDriver driver) {
        this.driver = driver;
    }

    public goToCartPage pressAddToCart() {
        driver.findElement(addToCartBtn).click();
        return new goToCartPage(driver);
    }
    public todayDealsPage goBack(){
        driver.navigate().back();
        return new todayDealsPage(driver);
    }
}
