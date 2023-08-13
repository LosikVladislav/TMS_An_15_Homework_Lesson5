package com.teachmeskills.lesson5; /**
 * Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму всех элементов массива
 */
import java.util.Arrays;
import java.util.Scanner;
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row number");
        int row = scanner.nextInt();
        System.out.println("Enter colum number");
        int colum = scanner.nextInt();
        int [][] array = new int[row][colum];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum +=array[i][j];
            }
        }
        System.out.println("sum of all arrays elements " + sum);
    }
}
