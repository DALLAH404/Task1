package scenario2;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.goToCartPage;

import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;

public class scenario2Tests extends BaseTests {

    @Test
    public void testScenario2(){

        homePage.Wait(30);
        homePage.pressDontChange();
        var deals = homePage.pressTodayDeals();
        deals.checkOnGrocery();
        deals.checkOnHeadphones();
        deals.checkOnDiscount();
        deals.moveToFour();
        homePage.Wait(30);
        var itemPage = deals.chooseAnItem(deals.returnXpath(deals.incrementIndex()));
        try {
            homePage.Wait(30);
            var goToCartPage =itemPage.pressAddToCart();
            homePage.Wait(30);
            assertEquals(goToCartPage.addedToCartString(),"Added to Cart","No item is added");
        }
        catch (NoSuchElementException e){
            var deals2 = itemPage.goBack();
            var item2Page = deals2.chooseAnItem(deals.returnXpath(deals.incrementIndex()));
            try {
                var goToCartPage2 =item2Page.pressAddToCart();
                homePage.Wait(30);
                assertEquals(goToCartPage.addedToCartString(),"Added to Cart","No item is added");
            }
            catch (NoSuchElementException e2) {
                var deals3 = itemPage.goBack();
                var item3Page = deals2.chooseAnItem(deals.returnXpath(deals.incrementIndex()));
                var goToCartPage3 = item3Page.pressAddToCart();
                assertEquals(goToCartPage.addedToCartString(),"Added to Cart","No item is added");
            }
        }
    }
}
