package PageObjectModels;

import Base.CommenToAllPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage_PageFactory extends CommenToAllPages {


    public LoginPage_PageFactory(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //Page Locators
    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id="js-login-btn")
    private WebElement signButton;

    @FindBy(id="js-notification-box-msg")
    private WebElement errorText;

    //Page Actions

    public String vwoInvalid(String name, String pwd){
        enterInput(username, name);
        enterInput(password, pwd);
        clickElement(signButton);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return errorText.getText();

    }
}
