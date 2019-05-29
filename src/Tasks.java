public class Tasks {
    public void task1() {
        MyString ex = () -> "Hello World!";
        System.out.println(ex.print());
    }

    public void task2() {
        NumericFunc cube = (n) -> n * n * n;
        System.out.println("Cube of number 3 equals " + cube.func(3));
        System.out.println("Cube of number 5 equals " + cube.func(5));
    }

    public void task3() {
        NumericTest2 isSumGreaterThan100 = (a, b) -> a + b > 100;
        if (isSumGreaterThan100.test(68, 35))
            System.out.println("Sum of 68 and 35 is greater than 100");
        if (!isSumGreaterThan100.test(10, 20))
            System.out.println("Sum of 10 and 20 is less than 100");
    }

    public void task4() {
        NumericFunc2 average = (n) -> {
            int sum = 0;
            for (int elem: n) {
                sum += elem;
            }
            return sum/n.length;
        };
        int[] mas1 = {1, 2, 3, 4, 5, 6};
        int[] mas2 = {0, 10, -5, -10, 5};
        System.out.println("Average of mas1 equals " + average.func(mas1));
        System.out.println("Average of mas2 equals " + average.func(mas2));
    }

}
