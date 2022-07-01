public class Main {

    public static void main(String[] args) {

        int num1 = 5, num2 = 15, sum, a, b;
        sum = num1 + num2;
        System.out.println(" number 1: " + num1);
        System.out.println(" number 2: " + num2);
        System.out.println("Sum of these numbers: " + sum);

        // accepting user input
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        sum = a + b;
        System.out.println("Sum of user input numbers: " + sum);
    }
}