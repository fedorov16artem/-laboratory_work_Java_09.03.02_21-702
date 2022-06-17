/*
 * Номер зачетной книжки:21-702
 * Выполнил:Федоров Артем Андреевич 
 * Варинат:9
 * Задание:Дан двумерный массив А,размером (nxn)(или квадратная матрица А.
 * Найти минимальный эдемент среди положительный элементов параллели главной 
 * диогонали, расположенной выше над диогональю.
 */
import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner (System.in);
    	int n = scanner.nextInt();
    	int m = scanner.nextInt();
    	System.out.print("");
        int rar[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                rar[i][j] = (int)((Math.random() * 20)	- 10);
                System.out.print(rar[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++){
            if (rar[i][i+1] < m && rar[i][i+1] >= 0){
                m = rar[i][i+1];
            }
        }
        System.out.println(m);
    }
}
	
