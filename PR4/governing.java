package Laboratory4;

public class governing extends Army {

    private String dogovor; // ������ �������
    private String datadog; // ���� �������
    private int nomerprot; // ����� ���������
    private int sumzp; // ����� ��������

    public governing(String rote, String famili, String zvanie, String DR, String Data, String chast, String dogovor,String datadog,int nomerprot, int sumzp) {
        super(rote, famili, zvanie, DR, Data, chast);
        this.dogovor = dogovor;
        this.datadog = datadog;
        this.nomerprot = nomerprot;
        this.sumzp = sumzp ;
        
    }
        

//����� ��� ��������� �������� ��������
    public String getDogovor() {
		return dogovor;
	}
//����� ��� ��������� �������� ��������
	public void setDogovor(String dogovor) {
		this.dogovor = dogovor;
	}
//����� ��� ��������� �������� ��������
	public String getDatadog() {
		return datadog;
	}
//����� ��� ��������� �������� ��������
	public void setDatadog(String datadog) {
		this.datadog = datadog;
	}
//����� ��� ��������� �������� ��������
	public int getNomerprot() {
		return nomerprot;
	}
//����� ��� ��������� �������� ��������
	public void setNomerprot(int nomerprot) {
		this.nomerprot = nomerprot;
	}
//����� ��� ��������� �������� ��������
	public int getSumzp() {
		return sumzp;
	}
//����� ��� ��������� �������� ��������
	public void setSumzp(int sumzp) {
		this.sumzp = sumzp;
	}
//���������������� ����������� ����� ��� ������������� ������� � ���� ������ � ����� ��������� �����������
	public String toString() {
        return "\n" + super.toString() +
                "\n������ ��������: " + dogovor +
                "\n���� �������: " + datadog +
                "\n����� ���������:" +nomerprot+
                "\n����� ��������:" +sumzp;
    }

}
