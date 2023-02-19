package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String str = new Scanner(System.in).nextLine();

        System.out.println(calc(str));
    }

    public static String calc(String input) throws Exception {

        String[] arr = input.split(" ");

        exceptionMathOperation(arr);

        String[] arrRome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String[] arrArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String result = "";

        Map<String, String> map = new HashMap<>();
        map.put("1", "I");
        map.put("2", "II");
        map.put("3", "III");
        map.put("4", "IV");
        map.put("5", "V");
        map.put("6", "VI");
        map.put("7", "VII");
        map.put("8", "VIII");
        map.put("9", "IX");
        map.put("10", "X");

        map.put("11", "XI");
        map.put("12", "XII");
        map.put("13", "XIII");
        map.put("14", "XIV");
        map.put("15", "XV");
        map.put("16", "XVI");
        map.put("17", "XVII");
        map.put("18", "XVIII");
        map.put("19", "XIX");
        map.put("20", "XX");

        map.put("21", "XXI");
        map.put("22", "XXII");
        map.put("23", "XXIII");
        map.put("24", "XXIV");
        map.put("25", "XXV");
        map.put("26", "XXVI");
        map.put("27", "XXVII");
        map.put("28", "XXVIII");
        map.put("29", "XXIX");
        map.put("30", "XXX");

        map.put("31", "XXXI");
        map.put("32", "XXXII");
        map.put("33", "XXXIII");
        map.put("34", "XXXIV");
        map.put("35", "XXXV");
        map.put("36", "XXXVI");
        map.put("37", "XXXVII");
        map.put("38", "XXXVIII");
        map.put("39", "XXXIX");
        map.put("40", "XL");

        map.put("41", "XLI");
        map.put("42", "XLII");
        map.put("43", "XLIII");
        map.put("44", "XLIV");
        map.put("45", "XLV");
        map.put("46", "XLVI");
        map.put("47", "XLVII");
        map.put("48", "XLVIII");
        map.put("49", "XLIX");
        map.put("50", "L");

        map.put("51", "LI");
        map.put("52", "LII");
        map.put("53", "LIII");
        map.put("54", "LIV");
        map.put("55", "LV");
        map.put("56", "LVI");
        map.put("57", "LVII");
        map.put("58", "LVIII");
        map.put("59", "LIX");
        map.put("60", "LX");

        map.put("61", "LXI");
        map.put("62", "LXII");
        map.put("63", "LXIII");
        map.put("64", "LXIV");
        map.put("65", "LXV");
        map.put("66", "LXVI");
        map.put("67", "LXVII");
        map.put("68", "LXVIII");
        map.put("69", "LXIX");
        map.put("70", "LXX");

        map.put("71", "LXXI");
        map.put("72", "LXXII");
        map.put("73", "LXXIII");
        map.put("74", "LXXIV");
        map.put("75", "LXXV");
        map.put("76", "LXXVI");
        map.put("77", "LXXVII");
        map.put("78", "LXXVIII");
        map.put("79", "LXXIX");
        map.put("80", "LXXX");

        map.put("81", "LXXXI");
        map.put("82", "LXXXII");
        map.put("83", "LXXXIII");
        map.put("84", "LXXXIV");
        map.put("85", "LXXXV");
        map.put("86", "LXXXVI");
        map.put("87", "LXXXVII");
        map.put("88", "LXXXVIII");
        map.put("89", "LXXXIX");
        map.put("90", "XC");

        map.put("91", "XCI");
        map.put("92", "XCII");
        map.put("93", "XCIII");
        map.put("94", "XCIV");
        map.put("95", "XCV");
        map.put("96", "XCVI");
        map.put("97", "XCVII");
        map.put("98", "XCVIII");
        map.put("99", "XCIX");
        map.put("100", "C");

        //Проверка чисел
        for (int i = 0; i < 10; i++) {

            exceptionUseOfDifferentNumberSystem(arrRome, arrArab, arr, i);

            if (arrRome[i].equals(arr[0])) {
                for (int j = 0; j < 10; j++) {
                    if (arrRome[j].equals(arr[2])) {
                        int romeNumber1 = changeRomeNumber(arr[0]);
                        int romeNumber2 = changeRomeNumber(arr[2]);
                        exceptionRomeNegativeNumbers(arr[1], romeNumber1, romeNumber2);
                        result = map.get(arithmeticAction(romeNumber1, arr[1], romeNumber2));
                    }
                }
            }
            if (arrArab[i].equals(arr[0])) {
                for (int j = 0; j < 10; j++) {
                    if (arrArab[j].equals(arr[2])) {
                        int arabNumber1 = Integer.parseInt(arr[0]);
                        int arabNumber2 = Integer.parseInt(arr[2]);

                        result = arithmeticAction(arabNumber1, arr[1], arabNumber2);
                    }
                }
            }
        }
        return result;
    }

    static Integer changeRomeNumber(String romeNumber) {

        int number = 0;
        switch (romeNumber) {
            case "I":
                number = 1;
                break;
            case "II":
                number = 2;
                break;
            case "III":
                number = 3;
                break;
            case "IV":
                number = 4;
                break;
            case "V":
                number = 5;
                break;
            case "VI":
                number = 6;
                break;
            case "VII":
                number = 7;
                break;
            case "VIII":
                number = 8;
                break;
            case "IX":
                number = 9;
                break;
            case "X":
                number = 10;
                break;
            default:
                break;
        }
        return number;
    }

    static String arithmeticAction(Integer number1, String action, Integer number2) throws Exception {
        exceptionNumbers(number1, number2);
        String answer = "";

        if (action.equals("+")) {
            int a3 = number1 + number2;
            answer = String.valueOf(a3);
        }
        //subtraction
        if (action.equals("-")) {
            int a3 = number1 - number2;
            answer = String.valueOf(a3);
        }
        //multiplication
        if (action.equals("*")) {
            int a3 = number1 * number2;
            answer = String.valueOf(a3);
        }
        //division
        if (action.equals("/")) {
            int a3 = number1 / number2;
            answer = String.valueOf(a3);
        }
        return answer;
    }

    static void exceptionMathOperation(String[] arr) throws Exception {
        if (arr.length < 3) {
            throw new Exception("Строка не является математической операцией");
        }

        if (arr.length > 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию");
        }
    }

    static void exceptionNumbers(int number1, int number2) throws Exception {
        if (number1 > 10 || number2 > 10) {
            throw new Exception("Неподходящие число");
        }
        if (number1 < 1 || number2 < 1) {
            throw new Exception("Неподходящие число");
        }
    }

    static void exceptionRomeNegativeNumbers(String symbol, int number1, int number2) throws Exception {
        if (symbol.equals("-")) {
            if (number1 <= number2) {
                throw new Exception("В римской системе нет отрицательных чисел");
            }
        }
    }

    static void exceptionUseOfDifferentNumberSystem(String[] arr1, String[] arr2, String[] mainArr, int count) throws Exception {

        if (arr1[count].equals(mainArr[0])) {
            for (int j = 0; j < 10; j++) {
                if (arr2[j].equals(mainArr[2])) {
                    throw new Exception("Используются одновременно разные системы счисления");
                }
            }
        }

        if (arr2[count].equals(mainArr[0])) {
            for (int j = 0; j < 10; j++) {
                if (arr1[j].equals(mainArr[2])) {
                    throw new Exception("Используются одновременно разные системы счисления");
                }
            }
        }

    }

}