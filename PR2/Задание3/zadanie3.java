/*
 * Номер зачтеной книжки:21-702
 * Выполнил:Федоров Артем Андреевич
 * Вариант:9
 * Задание:Определить Матрицу (двумерный массив) и ее заполнить случайными значениями.
 */

public class zadanie3 {
	  public static void main(String[] args) {
		  /*Scanner scanner =new Scanner (System.in);
		  int n = scanner.nextInt();
		  System.out.print("");*/
	        int  n = 6,h = 3; // размер матрицы
	        boolean f = false;
	        int masiv[][] = new int[n][n]; // объявляем двухмерных массив целых чисел
	        for (int i = 0; i < n; i++){ // идем по строкам
	            for (int j = 0; j < n; j++){ // идем по столбцам
	            	masiv[i][j] = (int)((Math.random() * 9) + 1);
	            	System.out.print(masiv[i][j] + "\t "); // вывод элементов масива 
	            }
	            System.out.println();
	        }

	        for(int i = 1; i < n; i++){
	          if(masiv[h][i] > masiv[h][i-1])
	                f = true;
	            else{// иначе
	                f = false;
	                System.out.println("0");
	                break;
	            }
	        }
	        if (f){
	            System.out.print("1");
	        }
	    }
	}

