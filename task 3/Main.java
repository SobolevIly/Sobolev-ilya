package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"8",  "2",    "12",      "123456" },
                {"4",  "23",    "621126",  "1"     },
                { "33", "1",     "6",      "1221"    },
                {"621135",  "24626", "12", "123321"    }
        };
        try {
            if (check(array)) System.out.println("Результат: " + sum);
        } catch (MyarraySizeException | MyArrayDateException e) {
            e.printStackTrace();
        }
    }
    static int s = 0;
    static int sum = 0;

    public static boolean check(String[][] array) throws MyarraySizeException, MyArrayDateException, MyHappyExceptioin {
        boolean tmp = true;

        if (array.length != 4)  throw new MyarraySizeException("Массив не 4x4");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4)  throw new MyarraySizeException("Массив не 4x4");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    if (!(array[i][j].matches("(?ui:[0-9]+)")))
                        s = Integer.valueOf(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDateException(i, j, array[i][j]);
                }
            }
        }
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.valueOf(array[i][j]);
                    if (array[i][j].length() == 6) {
                        for (int n = 0; n < 6; n++) {
                            if (n < 3) {
                                sumLeft += Character.getNumericValue(array[i][j].charAt(n));
                            } else {
                                sumRight += Character.getNumericValue(array[i][j].charAt(n));
                            }
                            if (sumLeft == sumRight) throw new MyHappyExceptioin(i, j, array[i][j]);
                        }
                    }
                } catch (MyHappyExceptioin e) {
                    e.printStackTrace();
                }
            }
        }
        return tmp;
    }
}


