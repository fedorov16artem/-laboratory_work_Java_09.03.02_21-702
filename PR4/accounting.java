package Laboratory4;

import java.util.ArrayList;//����� ��� ������ �� �������� (������������� ���������) 

public class accounting {
	private ArrayList<Army> listOfArmy;

//����� �������� ������ �������������� 
	public accounting(ArrayList<Army> listOfArmy) {
		this.listOfArmy = listOfArmy;
	}
	
//����� ���������� ������ ����������������� 
	public void addArmy(Army Laboratory4, ArrayList<Army> listOfArmys) {
		listOfArmys.add(Laboratory4);
	}
	
//����� ������ ������ ������������� 
	public ArrayList<Army> printArmy() {
		return listOfArmy;
	}
	
	public static void main(String[] args) {
		ArrayList<Army> listOfArmy = new ArrayList<>();
		accounting accounting = new accounting(listOfArmy);
		
		String famili = "�������"; // �������
		String rote = "��(��)"; //����
	    String zvanie = "������� �������"; // ������
	    String DR = "21.02.2000"; // ���� ��������
	  	String Data = "06.07.2020"; // ���� ����������� �� ������
	  	String chast = "25801"; // �����
	    
	    String okrug = "�������� ������� �����";//�����
		int visluga = 2; //������� ���
		String dolznost= "�������� ���������"; //��������� ��������������
		int amount = 10000; //����� ��������
		Contractors contractors = new Contractors(famili,rote,zvanie,DR,Data,chast,okrug,visluga,dolznost,amount);//������ ������
		accounting.addArmy(contractors, listOfArmy);//����� ����������
		
		String  title= "�� ����������� ������"; //�������� �������
		int Amount = 15000; //������
		int prize = 10000; //����� ��������
		award award = new award(famili,rote ,zvanie ,DR ,Data ,chast,title,Amount,prize);//������ ������			
		accounting.addArmy(award, listOfArmy);//����� ����������
		
		String  dogovor = "20.07.2020-21.07.2023";//������ �������
		String datadog = "19.07.2020";//���� ��������
		int  nomerprot = 234124;//����� ���������
		int  sumzp = 32702;//����� ��������
		governing governing = new governing(famili,rote ,zvanie ,DR ,Data,chast,dogovor,datadog, nomerprot,sumzp);// ������ ������
			
		accounting.addArmy(governing, listOfArmy);// ����� ����������
		
		System.out.print(accounting.printArmy());
	}
}