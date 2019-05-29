public class BlockLambdaDemo2 {
    public void func() {
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() -  1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("lambda becomes " + reverse.func("lambda"));
        System.out.println("expression becomes " + reverse.func("expression"));
    }
}
