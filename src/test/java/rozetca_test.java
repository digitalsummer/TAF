import Context.FilterPage;
import PageObgect.RozetcaFiltersPage;
import Weiters.Weiters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rozetca_test {

    static WebDriver driver;
    public static final String Search_page_rozetka = "https://rozetka.com.ua/beskarkasnaya-mebel/c154006/";

    @Before
    public void setUp(){
        String exePath = "/home/nina/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
    }
    @Test()
    public void aTest() throws InterruptedException {
        final String MinPrice = "200";
        final String MaxPrice = "1000";
        final String Name = "Tomas Edison";
        final String Phone = "0688141231";
        final String Mail = "kursuch.proga@gmail.com";

        driver.get(Search_page_rozetka);

        RozetcaFiltersPage rr = new RozetcaFiltersPage(driver);

        System.out.println("OK2");
        FilterPage.filterByRange( rr,200, 1000);
        System.out.println("OK2");
        Weiters.Wait(3000);

//        searchPage.min_max_price_filter_page(MinPrice, MaxPrice);
//        searchPage.Ukranian_made(Made_country);
//        searchPage.Choose_Prodact(choose_prodact);
//
//        RozetkaBuyPage buyPage = new RozetkaBuyPage(driver);
//        buyPage.Add_to_basket();
//        buyPage.Create_checkout();
//        buyPage.contacts_form(Name, Phone, Mail);
//
//        Assert.assertTrue(buyPage.valid_order());

    }

    @After
    public void tearDown()  {
        driver.quit();
    }
}