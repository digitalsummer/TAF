package Elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class textfields extends todo {

    public  textfields(WebElement element){

        super(element);
    }

    public void clear(){
        sendKeys(Keys.CONTROL + "a");
        sendKeys(Keys.DELETE);
    }

    public void setValue(String value){
        System.out.println(" OK -1");
        clear();
        System.out.println(" OK -1");
        sendKeys(value);
        System.out.println(" OK -1");
    }

    public String getValue(){
        if(getText() == null){
            return getAttribute("value");
        }
        else{
            return getText();
        }
    }
}
