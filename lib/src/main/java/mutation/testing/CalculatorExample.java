package mutation.testing;

public class CalculatorExample {

    public int add(int a,int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int summation(int start) {
        int retVal = 0;
        while (start > 0) {
            retVal += start;
            start--;
        }
        return retVal;
    }

    public int compare(int a,int b) {
        int retVal = 0;
        if (a == b) {
            retVal = 0;
        } else if (a >= b) {
            retVal = 1;
        } else {
            retVal = -1;
        }
        return retVal;
    }
}
