/*
 * ����� �������� ������:21-702
 * ��������:������� ����� ���������
 * �������:9
 * �������:��������� � ������� �� ����� ������ ������� ��������� ��������� ������,������������� ���� ���.
 */
public class zadanie1 {
	public static void main(String[] args) {
		int n=10;
		int arr[] = new int [n];
		System.out.println(n);
		byte a= 10 , b = 0;
		int d = 0;
		for (int i=0; i<n; i++) {
			arr [i] = (int) ((Math.random() *10)+1);
			System.out.print(arr[i]+ "");
		}
		System.out.println();
		for(int k = 1; k <= a;k++) {
			for(int i = 0; i < n; i++) {
				if (k== arr[i]) {
					b++;
					d = i + 1;
				}
			}
			if ( b== 1) {
				 System.out.println(k + " ����� " + d + " �������");
			}
			d = 0;
			b = 0;
		}
	}

}
