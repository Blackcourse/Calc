package Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Input 2 values");
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        System.out.println("Input operation +, -, *, /");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String op1 = reader.readLine();
        switch (op1) {
            case "+":
                System.out.println(num1 + num2);
            case "-":
                System.out.println(num1 - num2);
            case "*":
                System.out.println(num1 * num2);
            case "/":
                System.out.println(num1 /= num2);
        }

    }
}