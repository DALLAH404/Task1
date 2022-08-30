package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    //private By cartDiv = By.xpath("sc-active-cart");
    private By productName = By.className("a-truncate-cut");
    //*[@id="sc-item-C664c5678-3224-4d07-80cf-2006d858348f"]
    //*[@id="sc-item-Cb18c8855-beff-4a1b-84bd-68e1b6129f11"]

    //*[@id="activeCartViewForm"]/div[2]
    //*[@id="activeCartViewForm"]/div[2]


    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }
}
