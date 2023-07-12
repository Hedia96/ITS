import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends MainPage{
    HomePage(WebDriver driver)
    {
        super(driver);
    }
    //@FindBy(xpath = "//a[contains(@class,'has-submenu')and text()=\"Products\"]")
    WebElement productBtn=driver.findElement(By.xpath("//a[text()=\"Products\"]"));
  //  WebElement strategyBtn =driver.findElement(By.xpath("//a[contains(@class,'has-submenu')and text()=\"Games\"]/following-sibling::ul/child::li/a[text()='Strategy']"));
    WebElement strategyBtn;
    @FindBy(xpath = "//a[contains(@class,'has-submenu')  and text()=\"Games\"]/following-sibling::ul/li")
List<WebElement> gamesubBtns;

    WebElement gameBtn=driver.findElement(By.xpath("//a[@href=\"SelectCat.action?catId=2\"]/.."));
//@FindBy(xpath = "//a[contains(@class,'has-submenu')and text()=\"Games\"]/following-sibling::ul/child::li/a[text()='Strategy']")
//WebElement strategyBtn;

// list of options sbelow game Btn
    //*[@id="sm-16891066419015928-5"]/following-sibling::ul/child::li/a
    // could determine it by text

    public void nagivgateToGameCategory()  {
    //strategyBtn.click();
    //strategyBtn =driver.findElement(By.xpath("//a[contains(@class,'has-submenu')and text()=\"Games\"]/following-sibling::ul/child::li/a[text()='Strategy']"));
    productBtn.click();
    System.out.println("I amin navigggggate");
    Actions actions= new Actions(driver);
    actions.moveToElement(productBtn).build().perform();
    actions.moveToElement(gameBtn).build().perform();

    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(gameBtn));
    //gameBtn.click();
    actions.moveToElement(strategyBtn).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(driver.getCurrentUrl());
        /*
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
driver.findElement(By.id("Login")).click();
1
2
3
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
driver.findElement(By.id("Login")).click();*/

}
}
