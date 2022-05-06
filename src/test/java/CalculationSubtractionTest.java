import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculationSubtractionTest {

    Calculation calculation;

    @BeforeMethod(groups = "justATest")
    public void setUpSubtractionTests() {
        calculation = new Calculation();
    }

    @Test(groups = "justATest")
    public void testSubtraction() {
        int nr1 = 3;
        int nr2 = 2;
        int exceptedResult = 1;

        assertEquals(exceptedResult, calculation.subtraction(nr1, nr2));
    }

    @Test(groups = "justATest" , priority = -1)
    public void testVeryImportantTest() {
        int result1 = calculation.subtraction(0, 0);
        int result2 = calculation.subtraction(0, 0);

        assertTrue(result1 == result2);
    }

    @Test(groups = "justATest" , priority = 10)
    public void testNotImportantTest() {
        int result1 = calculation.subtraction(15, 3);
        int result2 = calculation.subtraction(15, 4);

        assertTrue(result1 > result2);
    }

    @Test
    public void iAmNotInAGroup() {
        System.out.println("I am not in a group");
    }
}