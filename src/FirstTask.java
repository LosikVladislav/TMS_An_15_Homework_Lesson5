import java.util.Arrays;
/**
 * 1. Шахматная доска.
 * Создать программу для раскраски шахматной доски с помощью цикла.
 * Создать двумерный массив String-ов 8х8. С помощью циклов задать
 * элементам циклам значения B(Black) и W(White)
 */
public class FirstTask {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for(int i = 0; i < array.length; i++){
            System.out.println();
            for(int j = 0; j < array[i].length; j++){
                if((i+j)%2==0){
                array[i][j] = "W";
                    System.out.print(array[i][j] + "\t");
                }else {
                    array[i][j] = "B";
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
    }
}
