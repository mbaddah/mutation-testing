package mutation.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorExampleTest {
    private CalculatorExample c;

    @BeforeEach
    public void setup() {
        c = new CalculatorExample();
    }

    @Test
    public void testSimpleAdd() {
        assertEquals(c.add(1,1),2);
    }

    @Test
    public void testSimpleSubtract() {
        assertEquals(c.subtract(0,0),0);
    }

    @Test
    public void testSimpleMultiply() {
        assertEquals(c.multiply(0,0),0);
    }

    @Test
    public void testSimpleDivision() {
        assertEquals(c.divide(0,100),0);
        assertEquals(c.divide(105,10),10);
    }

    @Test
    public void testSummation() {
        assertEquals(c.summation(2),3);
        assertEquals(c.summation(1),1);
        assertEquals(c.summation(0),0);
    }

    @Test
    public void testCompare() {
        assertEquals(c.compare(1,1),0);
        assertEquals(c.compare(2,1),1);
        assertEquals(c.compare(1,2),-1);
    }


}
