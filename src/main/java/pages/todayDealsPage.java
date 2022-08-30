package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class todayDealsPage {
    private WebDriver driver;
    private By grocery = By.xpath("//span[@class='CheckboxFilter-module__checkboxLabel_21MUk0e7QdlZKH5Xcwap-F'][normalize-space()='Grocery']");
    //span[@class='CheckboxFilter-module__checkboxLabel_21MUk0e7QdlZKH5Xcwap-F'][normalize-space()='Grocery']
    private By headphone = By.xpath("//span[normalize-space()='Headphones']");
    private By discountLink = By.xpath("//span[normalize-space()='10% off or more']");
    private By nextBtn = By.xpath("//li[@class='a-last']//a[@href='#']");
    private int index = 1;
    //private By firstItem = By.xpath("//body/div/div/div/div/div[@data-testid='grid-widget']/div[@aria-live='polite']/div[@aria-label='Deals grid']/div[@data-testid='grid-deals-container']/div[1]");

    public String choosedItemText ;


    //*[@id="grid-main-container"]/div[2]/span[3]/span
    public todayDealsPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkOnGrocery(){
        driver.findElement(grocery).click();
    }
    public void checkOnHeadphones(){
        driver.findElement(headphone).click();
    }
    public void checkOnDiscount(){
        driver.findElement(discountLink).click();
    }
    public void moveToFour(){
        driver.findElement(By.xpath("//a[normalize-space()='3']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[normalize-space()='4']")).click();
    }

    public void moveToNextPage(){
        driver.findElement(nextBtn).click();
    }

    public itemPage chooseAnItem(String xpath){
        WebElement item = driver.findElement(By.xpath(xpath));
        choosedItemText = item.getText();
        item.click();
        return new itemPage(driver);
    }
    public String returnXpath(int index){
        String xpath = "//body/div/div/div/div/div[@data-testid='grid-widget']/div[@aria-live='polite']/div[@aria-label='Deals grid']/div[@data-testid='grid-deals-container']/div["+index+"]";
        return xpath;
    }
    public int incrementIndex(){
        return ++index;
    }
//*[@id="grid-main-container"]/div[3]/div/div[1]/div/div/a[3]/div
//div[@class='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN'])[1]


}
