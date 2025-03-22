package Tests.VwoTests.PF;

import Basic.CommanToAllTestCases;
import Driver.DriverManager;
import PageObjectModels.LoginPage_PageFactory;
import Utilities.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Driver.DriverManager.driver;
import static org.testng.Assert.*;

import java.io.IOException;

public class PF_LoginPage extends CommanToAllTestCases {

    @Test
    public void pfLogin() throws IOException {

        driver.get(PropertyReader.readKey("vwo_url"));
        LoginPage_PageFactory loginPagePageFactory = new LoginPage_PageFactory(DriverManager.getDriver());
        String errorMeg = loginPagePageFactory.vwoInvalid(PropertyReader.readKey("email"), PropertyReader.readKey("password"));
        System.out.println(errorMeg);
        assertEquals(errorMeg, PropertyReader.readKey("error"));


    }
}
