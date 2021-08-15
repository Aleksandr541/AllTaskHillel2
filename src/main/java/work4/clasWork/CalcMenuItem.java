package work4.clasWork;

import java.util.Scanner;

public class CalcMenuItem implements MenuItem {
   private Scanner sc;

    public CalcMenuItem(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public String getName() {
        return "calculate sum";
    }

    @Override
    public void run() {
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.printf("sum is %d\n", a+b);
    }
}
