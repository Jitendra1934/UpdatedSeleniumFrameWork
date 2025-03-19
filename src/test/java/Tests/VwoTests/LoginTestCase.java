package Tests.VwoTests;

import Basic.CommanToAllTestCases;
import DDT.GetDataFromXlsx;
import Driver.DriverManager;
import PageObjectModels.LoginPom;
import Utilities.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static Driver.DriverManager.driver;

public class LoginTestCase extends CommanToAllTestCases {

    //@Test(dataProvider = "getData", dataProviderClass = GetDataFromXlsx.class)
    @Test
    public void vwoLoginTestCase(/*String name, String password*/) throws IOException {

        driver.get("https://app.vwo.com/#/login");
        LoginPom loginPom = new LoginPom(DriverManager.getDriver());
        String err = loginPom.vwoLoginInvalid(PropertyReader.readKey("email"), PropertyReader.readKey("password"));
        Assert.assertEquals(err, "Your email, password, IP address or location did not match");
        driver.quit();

    }
}
