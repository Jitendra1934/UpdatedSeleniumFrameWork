package Base;

import org.openqa.selenium.By;

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
}
