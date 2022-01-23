package myPackage.exam.recursion;

public class Task1 {

    public static String line(int numberOfDigitals) {
        if (numberOfDigitals == 1) {
            return "3";
        }
        return "3" + line(numberOfDigitals - 1);
    }

    public static void printNumberPyramid(int numberOfPyramidLevels) {

        for (int i = 1; i <= numberOfPyramidLevels; i++) {
            System.out.println(line(i));

        }
    }
}