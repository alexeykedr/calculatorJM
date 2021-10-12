package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Input {
    private String a;
    private String b;
    private String c;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public void input() {
        System.out.println("Введите 2 целых числа через пробел от 0 до 10 арабские \n"
                + "или от I до X римские, плюс знак операции, доступны: + - / *\n"
                + "например: 1 + 1 или V + II");


        Scanner scanner = new Scanner(System.in);
        try {
            String[] arrayInput = scanner.nextLine().split(" ");
            a = arrayInput[0];
            b = arrayInput[1];
            c = arrayInput[2];

            System.out.println("вы ввели:\n" + a + " " + b + " " + c);
            switch (b) {
                case "+":
                case "-":
                case "*":
                case "/":
                    break;
                default:
                    System.err.println("ошибка ввода");
                    break;
            }

        } catch (Exception e) {
            System.err.println("ошибка ввода");
        }
    }
}