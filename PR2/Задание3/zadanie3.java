/*
 * ����� �������� ������:21-702
 * ��������:������� ����� ���������
 * �������:9
 * �������:���������� ������� (��������� ������) � �� ��������� ���������� ����������.
 */

public class zadanie3 {
	  public static void main(String[] args) {
		  /*Scanner scanner =new Scanner (System.in);
		  int n = scanner.nextInt();
		  System.out.print("");*/
	        int  n = 6,h = 3; // ������ �������
	        boolean f = false;
	        int masiv[][] = new int[n][n]; // ��������� ���������� ������ ����� �����
	        for (int i = 0; i < n; i++){ // ���� �� �������
	            for (int j = 0; j < n; j++){ // ���� �� ��������
	            	masiv[i][j] = (int)((Math.random() * 9) + 1);
	            	System.out.print(masiv[i][j] + "\t "); // ����� ��������� ������ 
	            }
	            System.out.println();
	        }

	        for(int i = 1; i < n; i++){
	            if(masiv[h][i] > masiv[h][i-1])
	                f = true;
	            else{
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

