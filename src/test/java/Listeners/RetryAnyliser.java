package Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnyliser implements IRetryAnalyzer {

    private int retryCount=0;
    private static final int maxCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {

        if(retryCount < maxCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
