package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Driver.DriverManager.getDriver;

public class CommenToAllPages {

    //If you want the call a code befors the page you can code here

    public void clickElement(By by){

        getDriver().findElement(by).click();
    }

    public void enterInput(By by, String key){

        getDriver().findElement(by).sendKeys(key);
    }

    public String getErrorText(By by ){

        return getDriver().findElement(by).getText();
    }
    //For Page Factory
    public void enterInput(WebElement by, String key){

        by.sendKeys(key);
    }
    //Page Factory Method
    public void clickElement(WebElement by){

        by.click();
    }
    //Page Factory Method
    public String getErrorText(WebElement by ){

        return by.getText();
    }

    public void visibilityOfElement(By by){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void implicitWait(){

        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
