/* 
 * ����� �������� ������:21-702
 * ��������:������� ����� ��������� 
 * �������:9
 * �������: ��� ������ �(n). ���������� � ������ x(n) ��� ������� �������� ������� ���������� �� 4.
 * (�� �������., ��� ������ �������� ������).����� ����������� ������ "������ � ������������" ����������� ����� ������.
 * 
 */

public class zadanie2 {
	public static void main (String[] args) {
		int n= 10;
		int c[] = new int [n];
		int x[] = new int [n];
		for (int i = 0; i < n; i++) {
			c[i] = (int) (Math.random() * 10);
			System.out.print(c[i] + " ");
		}
		System.out.println();
			for (int i=0; i<n; i++) {
				if (c[i] !=0) {
					x[i] = c[i] *4;
					
				}
			}
			for(int i= 0; i < 10; i++)
				System.out.print(x[i] + " ");
	}

}