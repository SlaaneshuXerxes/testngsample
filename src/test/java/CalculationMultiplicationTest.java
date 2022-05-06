import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculationMultiplicationTest {

    Calculation calculation;

    @BeforeMethod(groups = "justATest")
    public void setUpMultiplicationTests() {
        calculation = new Calculation();
    }

    @Test(groups = "justATest")
    public void testMultiplication() {
        int nr1 = 4;
        int nr2 = 3;
        int expectedResult = 12;

        assertEquals(expectedResult, calculation.multiplication(nr1, nr2));
    }

    @Test(groups = "someGroup")
    public void inAGroupThatWontBeRun() {
        System.out.println("I wont be run");
    }

    @Test(dataProvider = "calculationDataProvider", groups = "justATest")
    public void testDataProviderTimesItself(String number, String expectedResult) {

        int convertedNr = Integer.parseInt(number);
        int convertedExpectedResult = Integer.parseInt(expectedResult);
        int multiplicationResult = calculation.multiplication(convertedNr, convertedNr );

        assertEquals(convertedExpectedResult, multiplicationResult);
    }

    @DataProvider(name = "calculationDataProvider")
    public Object[][]getData() {
        Object[][] data = { {"3", "9"}, {"2", "4"}, {"5", "25"} };
        return data;
    }

}