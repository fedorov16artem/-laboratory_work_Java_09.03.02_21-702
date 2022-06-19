package Laboratory4;

public class Contractors extends Army {
	private String okrug; //�������� ������
	private int visluga; // ������� ���
	private String dolznost; // ���������
	private int amount; //����� ��������

	public Contractors(String rote, String famili, String zvanie, String DR, String Data, String chast, String okrug,
			int visluga, String dolznost, int amount) {
		super(rote, famili, zvanie, DR, Data, chast);
		this.okrug = okrug;
		this.visluga = visluga;
		this.dolznost = dolznost;
		this.amount = amount;
	}

	//����� ��� ��������� �������� ��������
	public String getokrug() {
		return okrug;
	}
//����� ��� ��������� �������� ��������
	public void setokrug(String okrug) {
		this.okrug = okrug;
	}
//����� ��� ��������� �������� ��������
	public Integer getvilugas() {
		return visluga;
	}
//����� ��� ��������� �������� ��������
	public void setvisluga(Integer visluga) {
		this.visluga = visluga;
	}
	
//����� ��� ��������� �������� ��������
	public String getDolznost() {
		return dolznost;
	}
//����� ��� ��������� �������� ��������
	public void setDolznost(String dolznost) {
		this.dolznost = dolznost;
	}
//����� ��� ��������� �������� ��������
	public int getAmount() {
		return amount;
	}
//����� ��� ��������� �������� ��������
	public void setAmount(int amount) {
		this.amount = amount;
	}
//���������������� ����������� ����� ��� ������������� ������� � ���� ������ � ����� ��������� �����������
	public String toString() {
		 return "\n" + super.toString() +
	                "\n�������� ������: " + okrug +
	                "\n����� ��������: " + amount+
	                "\n������� ���: " + visluga+
	                "\n���������:" + dolznost;
	    }
	}




