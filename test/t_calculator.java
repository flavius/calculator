import org.junit.Assert;
import org.junit.Test;

/**
 * Created by codeamend on 9/20/15.
 */
public class t_calculator {

    @Test
    public void simpleCalculatorInput() {

        Calculator calc = new Calculator();

        Assert.assertEquals(calc.calculate("1+2"), "3");

    }

}
