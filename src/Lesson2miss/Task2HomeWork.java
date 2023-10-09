package Lesson2miss;


import java.util.Scanner;

public class Task2HomeWork {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6,7};

    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
    catch (IndexOutOfBoundsException e) {
        System.out.println("IndexOutOfBoundsException exception: " + e);
    }
    }

}
