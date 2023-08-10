import java.util.Arrays;
import java.util.Scanner;

public class ZeroTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first size of array");
        int sizeFirst = scanner.nextInt();
        System.out.println("Enter the first size of array");
        int sizeSecond = scanner.nextInt();
        System.out.println("Enter the first size of array");
        int sizeThird = scanner.nextInt();
        int[][][] array = new int[sizeFirst][sizeSecond][sizeThird];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k =0; k < array[i][j].length; k++){
                    array[i][j][k] = (int)(Math.random()*15);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k =0; k < array[i][j].length; k++){
                    array[i][j][k] += num;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
