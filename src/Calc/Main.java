package Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int resul = num1/num2;
        System.out.println(resul);
    }
}