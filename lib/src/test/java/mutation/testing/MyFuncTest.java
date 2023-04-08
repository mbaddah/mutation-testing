package mutation.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyFuncTest {
    @Test void testFoo() {
        MyFunc myFunc = new MyFunc();
        assertEquals(myFunc.dummyCalc(-1,2),1);
        assertEquals(myFunc.dummyCalc(1,-2),1);
        assertEquals(myFunc.dummyCalc(0,0),2);
        assertEquals(myFunc.dummyCalc(2,1),3);
        assertEquals(myFunc.dummyCalc(1,2),4);
        assertEquals(myFunc.dummyCalc(2,2),5);
    }
}
