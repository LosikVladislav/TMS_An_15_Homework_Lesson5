/**
 * 2. Умножение двух матриц
 * Создайти два массива целых чисел размером (3х3).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив {{1,2,3}{1,1,1}{0,0,0}{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */
import java.util.Arrays;
public class SecondTask {
    public static void main(String[] args) {
        int [][] arrayFirst = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int [][] arraySecond = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int row1 = arrayFirst.length;
        int colum1 = arrayFirst[0].length;
        int colum2 = arraySecond[0].length;
        if (row1!=colum2){
            System.out.println("arrays can not be myltiplied");
        }else{
            System.out.println("arrays can be myltiplied");
        }
        int[][] arrayThird = new int[row1][colum2];
        for (int i = 0; i < row1; i++){
            for(int j = 0; j < colum2; j++){
                int sum = 0;
                for(int k = 0; k < colum1; k++){
                    sum+=arrayFirst[i][k]*arraySecond[k][j];
                }
                arrayThird[i][j]=sum;
            }
        }
        System.out.println(Arrays.deepToString(arrayThird));
    }
}


