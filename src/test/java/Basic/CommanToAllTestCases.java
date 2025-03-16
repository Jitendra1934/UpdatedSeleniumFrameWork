package Basic;

import Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class CommanToAllTestCases {

    public CommanToAllTestCases() {
    }

    @BeforeMethod
    public void setUp() throws IOException {
        DriverManager.init();
    }

    @AfterMethod
    public void down(){
        DriverManager.down();
    }
}
