package com.company;

import java.util.Scanner;

public class Calculator {

    static void Scanner(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String xxx = sc.nextLine();
        Scanner sc2 = new Scanner(xxx);
        String number1 = sc2.next();

        String symb = sc2.next();
        String number2 = sc2.next();
        Arabic ar1 = null;
        Arabic ar2 = null;
        Roman r1 = null;
        Roman r2 = null;
        String we;

        if (Character.isDigit(number1.charAt(0))) {
            ar1 = new Arabic(number1);
            ar2 = new Arabic(number2);
            we = "arab";
        } else {
            r1 = new Roman(number1);
            r2 = new Roman(number2);
            we = "rom";
        }

        int result;
        if (we.equals("arab")) {
            switch (symb) {
                case "+":
                    result = ar1.arab + ar2.arab;
                    break;
                case "-":
                    result = ar1.arab - ar2.arab;
                    break;
                case "*":
                    result = ar1.arab * ar2.arab;
                    break;
                case "/":
                    result = ar1.arab / ar2.arab;
                    break;
                default:
                    throw new Exception("ERROR3");
            }
            System.out.println(result);
        } else {
            switch (symb) {
                case "+":
                    result = r1.rom + r2.rom;
                    break;
                case "-":
                    result = r1.rom - r2.rom;
                    break;
                case "*":
                    result = r1.rom * r2.rom;
                    break;
                case "/":
                    result = r1.rom / r2.rom;
                    break;
                default:
                    throw new Exception("ERROR3");
            }
            System.out.println(Roman.toRom(result));
        }
    }
}












