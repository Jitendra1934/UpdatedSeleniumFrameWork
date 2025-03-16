package Driver;

import Utilities.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public  static void init() throws IOException {

        String browser =  PropertyReader.readKey("browser");
        browser = browser.toLowerCase();
        if(driver == null){
            switch(browser){

                case "edge" :{

                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    driver = new EdgeDriver(edgeOptions);
                    break;
                }
                case "chrome": {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                }
                case "firefox": {
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--start-maximized");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;

                }
                default:
                    System.out.println("No browser found");
            }
        }

    }

    public static void down(){
        if(driver!=null){
            driver.quit();
        }
        driver = null;
    }
}
