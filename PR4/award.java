package Laboratory4;

public class award extends Army {
	private String title;// �������
    private int Amount;// ����� ��������
    private int prize;// ������

    public award(String rote, String famili, String zvanie, String DR,  String Data, String chast, String title, int amount,int prize) {
        super(rote, famili, zvanie, DR, Data, chast);
        this.title = title;
        this.Amount = amount;
        this.prize = prize;
    }
//����� ��� ��������� �������� ��������
    public String gettitle() {
        return title;
    }
//����� ��� ��������� �������� ��������
    public void settitle(String title) {
        this.title = title;
    }
//����� ��� ��������� �������� ��������
    public int getamount() {
        return Amount;
    }
//����� ��� ��������� �������� ��������
    public void setamount(int amount) {
        this.Amount = amount;
    }
//����� ��� ��������� �������� ��������
    public int getprize() {
        return prize;
    }
//����� ��� ��������� �������� ��������
    public void setpize(int prize) {
        this.prize = prize;
    }
// ���������������� ����������� ����� ��� ������������� ������� � ���� ������ � ����� ��������� ����������� 
    public String toString() {
        return "\n" + super.toString() +
                "\n�������: " + title +
                "\n����� ��������: " + Amount+
                "\n������: " + prize;
    }

}


