package PageObgect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RozetcaSearchPage {

    @FindBy(css = ".over-wraper .g-i-tile-i-box-desc >div:first-child > div>a")
    private List<WebElement> results;

    public void chouse_the_result(int index){
        results.get(index).click();
    }

}
