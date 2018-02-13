package PageObgect;

import Elements.button;
import Elements.textfields;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RozetcaBuyPage {
    public WebDriver driver;

    @FindBy(id = "popup-checkout")
    private button createCheckout;

    @FindBy(xpath = ".//*[@id='detail_buy_label']/div[4]/div[1]/div/form/span/span/button")
    private button addToBasket;

    @FindBy(xpath = ".//*[@id='reciever_name']")
    private textfields Name;

    @FindBy(xpath = ".//*[@id='reciever_name']")
    private textfields Phone;

    @FindBy(xpath = ".//*[@id='reciever_email']")
    private textfields Mail;

    @FindBy(xpath = ".//*[@id='step_contacts']/div/div[1]/div[2]/div/span/button")
    private button OK;

    @FindBy(xpath = ".//*[@id='make-order']")
    private button makeOrder;

    public RozetcaResultPage setCreateCheckout(){
        createCheckout.click();
        return new RozetcaResultPage(driver);
    }

    public RozetcaResultPage setAddToBasket(){
        addToBasket.click();
        return new RozetcaResultPage(driver);
    }

    public void setName(String name){
        Name.sendKeys(name);
    }

    public void setPhone(String phone){
        Phone.sendKeys(phone);
    }

    public void setMail(String mail){
        Mail.sendKeys(mail);
    }

    public RozetcaResultPage setOK(){
        OK.click();
        return new RozetcaResultPage(driver);
    }

    public boolean setMakeOrder(){
        if(makeOrder.isEnabled())
            return true;
        else
            return false;
    }

}
