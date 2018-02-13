package PageObgect;

import Elements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RozetcaFiltersPage extends RozetcaResultPage{

    public RozetcaFiltersPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "price[min]")
    private textfields minPrice;

    @FindBy(id = "price[max]")
    private textfields maxPrice;

    @FindBy(xpath = "//*[@param = \"49445\"]//label")
    private List<checkbox> producers;

    @FindBy(id = "submitprice")
    private button submitPriceButton;

    public void min_price_filter(Integer price) {
        System.out.println(" OK ");
        minPrice.setValue(price.toString());
        Weiters.Weiters.Wait(1000);
        System.out.println(" OK ");
    }

    public void max_price_filter(Integer price) {
        maxPrice.setValue(price.toString());
    }

    public void submit_price_filter(){
        submitPriceButton.click();
    }

    public String getMaxPrice(){
        return maxPrice.getValue();
    }

    public String getMinPrice(){
        return minPrice.getValue();
    }

    public List<html> getProducers() {
        return producers;
    }
}
