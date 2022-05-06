import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CalculationListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(("Test start " + iTestResult.getMethod()));
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test passed " + iTestResult.getMethod());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed " + iTestResult.getMethod());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test skipped " + iTestResult.getMethod());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}