import java.util.Arrays;
import java.util.Scanner;
/**
 * Создайте двумерный массив целых чисел.
 * Выведите на консоль диагонали массива
 */
public class FourthTask {
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
        // main diagonal
        System.out.println("Main diagonal ");
        for(int i =0; i < array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(i==j){
                    System.out.print(" " + array[i][j]);
                }
            }
        }
        System.out.println("\n");
        //secondary diagonal
        System.out.println("Secondary diagonal ");
        int maxIdx = array.length - 1;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i + j == maxIdx){
                    System.out.print(" " + array[i][j]);
                }
            }
        }
    }
}
