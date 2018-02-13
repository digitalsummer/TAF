package Elements;

import org.openqa.selenium.*;

import java.util.List;
import java.util.NoSuchElementException;

public class todo implements WebElement{
    public WebElement element;

    todo(WebElement element) {
        this.element = (isExisting(element))? element: null;
    }

    public Dimension getSize() {
        return element.getSize();
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return element.getScreenshotAs(outputType);
    }

    public Point getLocation() {
        return element.getLocation();
    }

    private boolean isExisting(WebElement element) {
        try {
            element.isDisplayed();
            return  true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }

    public void submit(){
        element.submit();
    }

    public void click() {
        element.click();
    }

    public void sendKeys(CharSequence... charSequence){
        element.sendKeys(charSequence);
    }

    public String getCssValue(String s){
        return element.getCssValue(s);
    }

    public Rectangle getRect() {
        return element.getRect();
    }

    public boolean isDisplayed(){
        return element.isDisplayed();
    }


    public WebElement findElement(By by) {
        return element.findElement(by);
    }


    public List<WebElement> findElements(By by) {
        return element.findElements(by);
    }

    public boolean isSelected() {
        return element.isSelected();
    }

    public boolean isEnabled() {
        return element.isEnabled();
    }

    public String getText() {
        return element.getText();
    }

    public void clear() { element.clear(); }

    public String getTagName() {
        return element.getTagName();
    }

    public String getAttribute(String s) {
        return element.getAttribute(s);
    }

}


