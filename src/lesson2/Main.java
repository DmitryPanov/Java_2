package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        System.out.println(Arrays.deepToString(changeString(s)));
        System.out.println("Sum " + sumArray(changeString(s)));

    }

    public static String[][] changeString(String s) {
        int count = 0;
        int length = 4;
        String[] str = s.replace("\n", " ").split(" ");
        String[][] arr = new String[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = str[count];
                count++;
            }
        }
        return arr;
    }

    public static float sumArray(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum * 1.0f / 2;
    }

}
