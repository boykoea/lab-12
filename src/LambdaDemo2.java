public class LambdaDemo2 {
    public void func() {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("10 is even number");
        if (!isEven.test(9)) System.out.println("9 is odd number");

        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("1 is not negative");
        if (!isNonNeg.test(-1)) System.out.println("-1 is negative");
    }
}
