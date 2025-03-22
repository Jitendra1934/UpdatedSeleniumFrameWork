package PageObjectModels;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPom extends CommenToAllPages {

    static WebDriver driver;

    public LoginPom(WebDriver driver) {
    this.driver=driver;
    }

    //PAGE LOCATORS
    private By username = By.id("login-username");
    private By password =By.id("login-password");
    private By signInButton = By.id("js-login-btn");
    private By errorTest = By.id("js-notification-box-msg");


    //PAGE ACTIONs


    public String vwoLoginInvalid(String name, String pwd){

      //  driver.findElement(username).sendKeys(name);
        enterInput(username, name);
        //driver.findElement(password).sendKeys(pwd);
        enterInput(password, pwd);
        //driver.findElement(signInButton).click();
        clickElement(signInButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(errorTest));
        //visibilityOfElement(errorTest);
        String errorMsg = getErrorText(errorTest);
        System.out.println(errorMsg);
        return errorMsg;
    }

    public void vwoLoginValid(String name, String pwd) {
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signInButton).click();
    }

}
