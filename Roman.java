package com.company;

public class Roman extends Number {

    int rom;

    public Roman(String val) throws Exception {
        super(val);
        this.rom = toNum(val);
        if (rom < 1 || rom > 10) {
            throw new Exception("ERROR2");
        }
    }

    public static String toRom(int arabic) {

        String result = "";

        if (arabic == 0) {
            result = "O";
        }

        if (arabic < 0) {
            result += "-";
            arabic = Math.abs(arabic);
        }

        while (arabic == 100) {
            result += "C";
            arabic -= 100;
        }
        while (arabic >= 90) {
            result += "XC";
            arabic -= 90;
        }
        while (arabic >= 50) {
            result += "L";
            arabic -= 50;
        }
        while (arabic >= 40) {
            result += "XL";
            arabic -= 40;
        }
        while (arabic >= 10) {
            result += "X";
            arabic -= 10;
        }
        while (arabic >= 9) {
            result += "IX";
            arabic -= 9;
        }
        while (arabic >= 5) {
            result += "V";
            arabic -= 5;
        }
        while (arabic >= 4) {
            result += "IV";
            arabic -= 4;
        }
        while (arabic >= 1) {
            result += "I";
            arabic -= 1;
        }
        return result;

    }

    public int checkRom(char rom) {
        if (rom == 'I') {
            return 1;
        }
        if (rom == 'V') {
            return 5;
        }
        if (rom == 'X') {
            return 10;
        }
        return -1;
    }

    public int toNum(String number) {

        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            int sym1 = checkRom(number.charAt(i));
            if (i + 1 < number.length()) {
                int sym2 = checkRom(number.charAt(i + 1));
                if (sym2 > sym1) {
                    result += sym2 - sym1;
                    i++;
                } else {
                    result += sym1;
                }
            } else {
                result += sym1;
            }
        }
        return result;
    }
}

