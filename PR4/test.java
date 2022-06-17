package laba4;

public class test extends Army {

    private int dogovor;
    private int datadog;
    private int nomerprot;
    private int sumzp;

    public test(int rote, String famili, String zvanie, String DR, String Data, String chast, int dogovor, int datadog, int nomerprot, int sumzp) {
        super(rote, famili, zvanie, DR, Data, chast);
        this.dogovor = dogovor;
        this.datadog = datadog;
        this.nomerprot = nomerprot;
        this.sumzp = sumzp ;
        
    }
        


    public int getDogovor() {
		return dogovor;
	}
	public void setDogovor(int dogovor) {
		this.dogovor = dogovor;
	}
	public int getDatadog() {
		return datadog;
	}
	public void setDatadog(int datadog) {
		this.datadog = datadog;
	}
	public int getNomerprot() {
		return nomerprot;
	}
	public void setNomerprot(int nomerprot) {
		this.nomerprot = nomerprot;
	}
	public int getSumzp() {
		return sumzp;
	}
	public void setSumzp(int sumzp) {
		this.sumzp = sumzp;
	}
	public String toString() {
        return "\n" + super.toString() +
                "\nпериод договора: " + dogovor +
                "\nдата договра: " + datadog +
                "\nномер протокола:" +nomerprot+
                "\nсумма зарплаты:" +sumzp;
    }

}
