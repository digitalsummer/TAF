package Context;

import Elements.html;
import PageObgect.RozetcaFiltersPage;
import org.openqa.selenium.WebDriver;

public class FilterPage {

     WebDriver driver;



    public static RozetcaFiltersPage  priceFilter(RozetcaFiltersPage page, Integer min, Integer max){
        //RozetcaFiltersPage page = new RozetcaFiltersPage();
        System.out.println(" OK 1");
        page.max_price_filter(max);
        System.out.println(" OK 1");
        page.min_price_filter(min);

        return page;
    }

    public static void submit_price_Filter(RozetcaFiltersPage page) {
        page.submit_price_filter();
    }

    public static void filterByRange(RozetcaFiltersPage page, Integer min, Integer max){
        submit_price_Filter(priceFilter(page, min, max));
    }

    public static void filterByCountry(RozetcaFiltersPage page, String country){
        for(html iter: page.getProducers()) {
            if (iter.getText().contains(country) && (!isChecked(iter))) {
                iter.click();
                break;
            }
        }
    }

    private static boolean isChecked(html label){
        return true;
    }

    public static boolean producerIsChecked(RozetcaFiltersPage page) {
        for(html iter : page.getProducers()) {
            if (isChecked(iter))
                return true;
        }
        return false;
    }
}

