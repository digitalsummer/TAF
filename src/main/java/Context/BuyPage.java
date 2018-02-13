package Context;

import PageObgect.RozetcaBuyPage;
import PageObgect.RozetcaSearchPage;

public class BuyPage {

    public void chouse_the_prodact(int index){
        RozetcaSearchPage page = new RozetcaSearchPage();
        page.chouse_the_result(index);
    }

    public void submit_checkout(){
        RozetcaBuyPage page = new RozetcaBuyPage();
        page.setAddToBasket();
        page.setCreateCheckout();
    }

    public void create_order(String name, String mail, String  phone){
        RozetcaBuyPage page = new RozetcaBuyPage();
        page.setName(name);
        page.setMail(mail);
        page.setPhone(phone);
        page.setOK();
    }

    public boolean valid_make_order_button(){
        RozetcaBuyPage page = new RozetcaBuyPage();
        return page.setMakeOrder();
    }
}
