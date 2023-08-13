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
//        System.out.println(Arrays.deepToString(array));
//        int temp = 0;
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                for(int k = 0; k < array.length; k++){
//                    for(int n = 0; n < array[k].length; n++){
//                        if(array[k][n] > array[i][j]){
//                            temp = array[k][n];
//                            array[k][n] = array[i][j];
//                            array[i][j] = temp;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("Sorted array ");
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                System.out.println(" " + array[i][j]);
//            }
//        }
//        System.out.println(Arrays.deepToString(array));
    }
}
