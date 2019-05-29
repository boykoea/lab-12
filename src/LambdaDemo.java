public class LambdaDemo {
    public void func() {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Fixed value: " + myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println("Random value: " + myNum.getValue());
        System.out.println("One more random value: " + myNum.getValue());
    }
}
