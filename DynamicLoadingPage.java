package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By link_Example1 = By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By link_Example2 = By.xpath("//*[@id=\"content\"]/div/a[2]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page openExample2InNewTab() {
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(driver.findElement(link_Example2)).keyUp(Keys.CONTROL).build().perform();
        return new DynamicLoadingExample2Page(driver);
    }

}
