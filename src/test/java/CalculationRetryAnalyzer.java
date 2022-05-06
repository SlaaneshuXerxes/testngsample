import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CalculationRetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int maxRetries = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < maxRetries) {
            counter++;
            return true;
        }
        else {
            return false;
        }
    }
}