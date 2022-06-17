/*
 * Номер зачетной книжки:21-702
 * Выполнил:Федоров Артем Андреевич
 * Вариант:9
 * Задание:Составить и вывести на экран массив номеров элементов исходного масива,встречающихся один раз.
 */
public class zadanie1 {
	public static void main(String[] args) {
		int n=10; // размер масиива
		int arr[] = new int [n];//объявление
		byte a= 10 , b = 0;
		int d = 0;
		for (int i=0; i<n; i++) {
			arr [i] = (int) ((Math.random() *10)+1); // заполенение массива 
			System.out.print(arr[i]+ " "); // вывод массива
		}
		System.out.println(); // перенос на другую строку 
		for(int k = 1; k <= a;k++) {
			for(int i = 0; i < n; i++) {
				if (k== arr[i]) {
					b++;
					d = i + 1;
				}
			}
			if ( b== 1) {
				 System.out.println(k + " Номер " + d + " матрица");
			}
			d = 0;
			b = 0;
		}
	}

}
