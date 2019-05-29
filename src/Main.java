public class Main {
    public static void main(String args[]) {
        System.out.println("Example 1:");
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.func();

        System.out.println("\nExample 2:");
        LambdaDemo2 lambdaDemo2 = new LambdaDemo2();
        lambdaDemo2.func();

        System.out.println("\nExample 3:");
        LambdaDemo3 lambdaDemo3 = new LambdaDemo3();
        lambdaDemo3.func();

        System.out.println("\nExample 4:");
        BlockLambdaDemo blockLambdaDemo = new BlockLambdaDemo();
        blockLambdaDemo.func();

        System.out.println("\nExample 5:");
        BlockLambdaDemo2 blockLambdaDemo2 = new BlockLambdaDemo2();
        blockLambdaDemo2.func();

        System.out.println("\nTask 1:");
        Tasks task = new Tasks();
        task.task1();

        System.out.println("\nTask 2:");
        task.task2();

        System.out.println("\nTask 3:");
        task.task3();

        System.out.println("\nTask 4");
        task.task4();

    }
}
