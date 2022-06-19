package Laboratory4;

public class Contractors extends Army {
	private String okrug; //название округа
	private int visluga; // выслыга лет
	private String dolznost; // должность
	private int amount; //сумма надбавки

	public Contractors(String rote, String famili, String zvanie, String DR, String Data, String chast, String okrug,
			int visluga, String dolznost, int amount) {
		super(rote, famili, zvanie, DR, Data, chast);
		this.okrug = okrug;
		this.visluga = visluga;
		this.dolznost = dolznost;
		this.amount = amount;
	}

	//Метод для получения значения атрибута
	public String getokrug() {
		return okrug;
	}
//Метод для изменения значения атрибута
	public void setokrug(String okrug) {
		this.okrug = okrug;
	}
//Метод для получения значения атрибута
	public Integer getvilugas() {
		return visluga;
	}
//Метод для изменения значения атрибута
	public void setvisluga(Integer visluga) {
		this.visluga = visluga;
	}
	
//Метод для получения значения атрибута
	public String getDolznost() {
		return dolznost;
	}
//Метод для изменения значения атрибута
	public void setDolznost(String dolznost) {
		this.dolznost = dolznost;
	}
//Метод для получения значения атрибута
	public int getAmount() {
		return amount;
	}
//Метод для изменения значения атрибута
	public void setAmount(int amount) {
		this.amount = amount;
	}
//Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией
	public String toString() {
		 return "\n" + super.toString() +
	                "\nНазвание округа: " + okrug +
	                "\nСумма надбавки: " + amount+
	                "\nВыслуга лет: " + visluga+
	                "\nДолжность:" + dolznost;
	    }
	}




