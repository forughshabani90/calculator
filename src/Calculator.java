import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, num3;
        String opt;
        long a = 5;

        int b = (int) a;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        opt = scanner.next();
        if (opt.equals("+")) {
            System.out.println(num3 = num1 + num2);
        } else if (opt.equals("-")) {
            System.out.println(num3 = num1 - num2);
        } else if (opt.equals("*")) {
            System.out.println(num3 = num1 * num2);
        } else if (opt.equals("/")) {
            System.out.println(num3 = num1 / num2);
        }


    }


}
