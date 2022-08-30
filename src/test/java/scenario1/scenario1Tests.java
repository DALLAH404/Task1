package scenario1;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class scenario1Tests extends BaseTests {

    @Test
    public void scenario1(){
        homePage.Wait(30);
        homePage.pressDontChange();
        var carAccessories = homePage.MakeSearch("car accessories");
        carAccessories.Wait(30);
        var productPage =carAccessories.clickOnfirstItem();
        carAccessories.Wait(30);
        var cartPage = productPage.pressAddToCart();
        carAccessories.Wait(30);
        var goToCartPage = cartPage.pressGoToCart();
        carAccessories.Wait(30);
        assertEquals(goToCartPage.getProductName().substring(0,10), carAccessories.firstItemText.substring(0,10),"Wrong item is added");
    }
}
