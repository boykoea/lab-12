public class LambdaDemo3 {
    public void func() {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2))
            System.out.println("Number 2 is a factor of number 10");
        if (!isFactor.test(10, 3))
            System.out.println("Number 3 is not a factor of number 10");
    }
}
