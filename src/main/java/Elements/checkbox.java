package Elements;

import org.openqa.selenium.WebElement;

public class checkbox extends todo {

    public checkbox(WebElement element){
        super(element);
    }

    public void checked(){
        if(!isSelected()){
            click();
        }
    }
}
