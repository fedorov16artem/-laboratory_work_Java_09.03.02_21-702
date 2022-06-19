package Laboratory4;

public class award extends Army {
	private String title;// награды
    private int Amount;// сумма надбавки
    private int prize;// премия

    public award(String rote, String famili, String zvanie, String DR,  String Data, String chast, String title, int amount,int prize) {
        super(rote, famili, zvanie, DR, Data, chast);
        this.title = title;
        this.Amount = amount;
        this.prize = prize;
    }
//Метод для получения значения атрибута
    public String gettitle() {
        return title;
    }
//Метод для изменения значения атрибута
    public void settitle(String title) {
        this.title = title;
    }
//Метод для получения значения атрибута
    public int getamount() {
        return Amount;
    }
//Метод для изменения значения атрибута
    public void setamount(int amount) {
        this.Amount = amount;
    }
//Метод для получения значения атрибута
    public int getprize() {
        return prize;
    }
//Метод для изменения значения атрибута
    public void setpize(int prize) {
        this.prize = prize;
    }
// Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией 
    public String toString() {
        return "\n" + super.toString() +
                "\nНаграды: " + title +
                "\nСумма надбавки: " + Amount+
                "\nПремия: " + prize;
    }

}


