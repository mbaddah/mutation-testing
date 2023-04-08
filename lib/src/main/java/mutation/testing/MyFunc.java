package mutation.testing;

public class MyFunc {
    public int dummyCalc(int a, int b) {
        if (a < 0 || b < 0) {
//            System.out.println("A or B is less then 0");
            return 1;
        } else if (a == 0 && b == 0) {
//            System.out.println("Both A and B are equal to 0");
            return 2;
        } else if (a > b) {
//            System.out.println(" A is greater than B");
            return 3;
        } else if (b > a) {
//            System.out.println("B is greater than A");
            return 4;
        } else {
//            System.out.println ("A and B are equal");
            return 5;
        }

    }
}
