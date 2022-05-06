import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculationAdditionTest {

    Calculation calculation;

    @BeforeMethod(groups = "justATest")
    public void setUpAdditionTests() {
        calculation = new Calculation();
    }

    @Test(groups = "justATest")
    public void testAddition() {
        int nr1 = 5;
        int nr2 = 10;
        int expectedResult = 15;

        assertEquals(expectedResult, calculation.addition(nr1, nr2));
    }

    @Test(groups = "failingAdditionTest")
    public void testAdditionWillfail() {
        int nr1 = 7;
        int nr2 = 2;
        int expectedResultTypo = 8;

        assertEquals(expectedResultTypo, calculation.addition(nr1, nr2));
    }

    @Test(dependsOnMethods = "testAdditionWillfail", groups = "justATest")
    public void testAdditionWillBeIgnored() {
        System.out.println("I will be ignored");
        int nr1 = 4;
        int nr2 = 2;
        int expectedResultTypo = 6;

        assertEquals(expectedResultTypo, calculation.addition(nr1, nr2));
    }
}