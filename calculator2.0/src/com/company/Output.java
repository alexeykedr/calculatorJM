package com.company;

import static java.lang.Integer.parseInt;

public class Output {

    public int Calculate(String a, String b, String c) {
        int d = 0;

        try {

            int a1 = parseInt(a);
            int c1 = parseInt(c);

                if (b.equals("+")) {
                    d = a1 + c1;
                    System.out.println("Ваш результат:\n" + d);
                } else if (b.equals("-")) {
                    d = a1 - c1;
                    System.out.println("Ваш результат:\n" + d);
                } else if (b.equals("*")) {
                    d = a1 * c1;
                    System.out.println("Ваш результат:\n" + d);
                } else if (b.equals("/") && c1 != 0) {
                    d = a1 / c1;
                    System.out.println("Ваш результат:\n" + d);
                }

            return 0;


        } catch (Exception e) {
            Converting conv = new Converting();


            int a2 = conv.romanToArabian(a);
            int c2 = conv.romanToArabian(c);

            if (b.equals("+")) {
                d = a2 + c2;
                System.out.println("Ваш результат:\n" + conv.arabianToRoman(d));
            } else if (b.equals("-")) {
                d = a2 - c2;
                System.out.println("Ваш результат:\n" + conv.arabianToRoman(d));
            } else if (b.equals("*")) {
                d = a2 * c2;
                System.out.println("Ваш результат:\n" + conv.arabianToRoman(d));
            } else if (b.equals("/") && c2 != 0) {
                d = a2 / c2;
                System.out.println("Ваш результат:\n" + conv.arabianToRoman(d));
            } else {
                System.out.println("ошибка ввода римские");
            }
            return d;
        }
    }
}




