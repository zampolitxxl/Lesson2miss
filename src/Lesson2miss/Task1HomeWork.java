package Lesson2miss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5HomeWork {

    public static void main(String[] args) {
        float number = floatInputOutput();


    }
     //метод запроса и возврата числа float
     public static float floatInputOutput() {
         Scanner scanner = new Scanner(System.in);
         float number = 0;
         System.out.println(
                 "Введите  дробное число");
         try {
             number = scanner.nextFloat();
             System.out.println("введено число "+ number);
         } catch (InputMismatchException e) {
             System.out.println(
                     "Попробуйте снова ввести  дробное число");
             float number2 = floatInputOutput();
         }

         return number;
     }



}
