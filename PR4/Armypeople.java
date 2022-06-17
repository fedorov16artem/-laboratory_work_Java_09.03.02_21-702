package laba4;

public class Armypeople extends Army {
	private String title;// награды
    private int amount;// сумма надбавки
    private int prize;// премия

    public Armypeople(int rote, String famili, String zvanie, String DR,  String Data, String chast, String title, int amount,int prize) {
        super(rote, famili, zvanie, DR, Data, chast);
        this.title = title;
        this.amount = amount;
        this.prize = prize;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
    }

    public int getprize() {
        return prize;
    }

    public void setpize(int prize) {
        this.prize = prize;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\nнаграды: " + title +
                "\nсумма надбавки: " + amount+
                "\nпремия: " + prize;
    }

}


