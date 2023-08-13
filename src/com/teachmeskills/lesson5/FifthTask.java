/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в
 * строках двумерного массива по возрастанию.
 */
package com.teachmeskills.lesson5;
import java.util.Arrays;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
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
        int[][] sortArr = new int[row][colum];
        for (int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
            sortArr[i] = array[i];
        }
        System.out.println("sorted array " + Arrays.deepToString(sortArr));
    }
}
