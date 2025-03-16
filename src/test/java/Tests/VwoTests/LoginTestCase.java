package Tests.VwoTests;

import Basic.CommanToAllTestCases;
import PageObjectModels.LoginPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Driver.DriverManager.driver;

public class LoginTestCase extends CommanToAllTestCases {

    @Test(description = "login test case")
    public void vwoLoginTestCase(){

        //WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        LoginPom loginPom = new LoginPom(driver);
        String err = loginPom.vwoLoginInvalid("jitendrapunnam@gamil.com", "kajsbchjabc");
        Assert.assertEquals(err, "Your email, password, IP address or location did not match");
        driver.quit();

    }
}
