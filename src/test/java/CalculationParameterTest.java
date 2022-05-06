import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculationParameterTest {

    Calculation calculation;

    @BeforeMethod(groups = "parameterTest")
    public void setUpParameterTest() {
        calculation = new Calculation();
    }

    @Test(groups = "parameterTest")
    @Parameters({"addPar1", "addPar2", "addParExpRes"})
    public void testAdditionParameter(String addPar1, String addPar2, String addParExpRes) {
        int nrToInt1 = Integer.parseInt(addPar1);
        int nrToInt2 = Integer.parseInt(addPar2);
        int nrToIntExpRes = Integer.parseInt(addParExpRes);

        assertEquals(nrToIntExpRes, calculation.addition(nrToInt1, nrToInt2));
    }

    @Test(groups = "parameterTest")
    @Parameters( { "mulPar1", "mulPar2", "mulParExpRes" } )
    public void testMultiplicationParameter(String mulPar1, String mulPar2, String mulParExpRes) {
        int nrToInt1 = Integer.parseInt(mulPar1);
        int nrToInt2 = Integer.parseInt(mulPar2);
        int nrToIntExpRes = Integer.parseInt(mulParExpRes);

        assertEquals(nrToIntExpRes, calculation.multiplication(nrToInt1, nrToInt2));
    }
}
