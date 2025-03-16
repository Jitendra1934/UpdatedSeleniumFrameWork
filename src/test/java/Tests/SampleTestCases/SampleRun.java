package Tests.SampleTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SampleRun {

    @Test
    public void sampleRun(){

        WebDriver driver = new ChromeDriver();
        //driver.get("https//:www.google.com");

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();



    }
}
