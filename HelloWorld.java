public class HelloWorld {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println( sub (a, b) + "  " + "please enter Hello World");
        System.out.println( add (a, b) + "  " + "please enter Hello World");
        System.out.println( mul (a, b) + "  " + "please enter Hello World");
        System.out.println( del (a, b) + "  " + "please enter Hello World");
    }
    public static int add (int a, int b){
        return a + b;
    }
    public static int sub (int a, int b){
        return a - b;
    }
    public static int mul (int a, int b){
        return a * b;
    }
    public static int del (int a, int b){
        return a / b;
    }

}
