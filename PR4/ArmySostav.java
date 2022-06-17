package laba4;

public class ArmySostav extends Army {
	private String okrug; //название округа
	private int visluga; // выслыга лет
	private String dolznost; // должность
	private int amount; //сумма надбавки

	public ArmySostav(int rote, String famili, String zvanie, String DR, String Data, String chast, String okrug,
			int visluga, String Dolznost, int amount, String dolznost) {
		super(rote, famili, zvanie, DR, Data, chast);
		this.okrug = okrug;
		this.visluga = visluga;
		this.dolznost = dolznost;
		this.amount = amount;
	}

	public String getokrug() {
		return okrug;
	}

	public void setokrug(String okrug) {
		this.okrug = okrug;
	}

	public Integer getvilugas() {
		return visluga;
	}

	public void setvisluga(Integer visluga) {
		this.visluga = visluga;
	}
	

	public String getDolznost() {
		return dolznost;
	}

	public void setDolznost(String dolznost) {
		this.dolznost = dolznost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String toString() {
		 return "\n" + super.toString() +
	                "\nназвание округа: " + okrug +
	                "\nсумма надбавки: " + amount+
	                "\nвыслуга лет: " + visluga+
	                "\nдолжность:" + dolznost;
	    }
	}




