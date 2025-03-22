
package Tests.VwoTests.POM;

import Basic.CommanToAllTestCases;
import DDT.GetDataFromXlsx;
import Driver.DriverManager;
import Listeners.RetryAnyliser;
import PageObjectModels.LoginPom;
import Utilities.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;


import static Driver.DriverManager.driver;

public class LoginTestCase extends CommanToAllTestCases {


    private static  Logger logger = LogManager.getLogger(LoginTestCase.class);

    //@Test(dataProvider = "getData", dataProviderClass = GetDataFromXlsx.class)
    @Test(retryAnalyzer = RetryAnyliser.class)
    public void vwoLoginTestCase(/*String name, String password*/) throws IOException {

        logger.info("Starting of the Test Case");
        driver.get(PropertyReader.readKey("vwo_url"));
        LoginPom loginPom = new LoginPom(DriverManager.getDriver());
        String err = loginPom.vwoLoginInvalid(PropertyReader.readKey("email"), PropertyReader.readKey("password"));
        logger.info("End of test Case");
        logger.info("Assertion started");
        Assert.assertEquals(err, PropertyReader.readKey("error"));
        driver.quit();

    }
}


