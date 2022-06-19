package Laboratory4;

public class governing extends Army {

    private String dogovor; // период договра
    private String datadog; // дата договра
    private int nomerprot; // номер протокола
    private int sumzp; // сумма зарплаты

    public governing(String rote, String famili, String zvanie, String DR, String Data, String chast, String dogovor,String datadog,int nomerprot, int sumzp) {
        super(rote, famili, zvanie, DR, Data, chast);
        this.dogovor = dogovor;
        this.datadog = datadog;
        this.nomerprot = nomerprot;
        this.sumzp = sumzp ;
        
    }
        

//Метод для получения значения атрибута
    public String getDogovor() {
		return dogovor;
	}
//Метод для изменения значения атрибута
	public void setDogovor(String dogovor) {
		this.dogovor = dogovor;
	}
//Метод для получения значения атрибута
	public String getDatadog() {
		return datadog;
	}
//Метод для изменения значения атрибута
	public void setDatadog(String datadog) {
		this.datadog = datadog;
	}
//Метод для получения значения атрибута
	public int getNomerprot() {
		return nomerprot;
	}
//Метод для изменения значения атрибута
	public void setNomerprot(int nomerprot) {
		this.nomerprot = nomerprot;
	}
//Метод для получения значения атрибута
	public int getSumzp() {
		return sumzp;
	}
//Метод для изменения значения атрибута
	public void setSumzp(int sumzp) {
		this.sumzp = sumzp;
	}
//Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией
	public String toString() {
        return "\n" + super.toString() +
                "\nПериод договора: " + dogovor +
                "\nДата договра: " + datadog +
                "\nНомер протокола:" +nomerprot+
                "\nСумма зарплаты:" +sumzp;
    }

}
