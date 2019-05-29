public class BlockLambdaDemo {
    public void func() {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Factorial of number 3 equals " + factorial.func(3));
        System.out.println("Factorial of number 5 equals " + factorial.func(5));
    }
}
