/*
* Номер зачентой кнжки: 21-702
* Выполинл: Федоров Артем Андреевич
* Вариант:9
* Задание:Военный состав
* 			-Фамилия
*			-Рота
*			-Звание
*			-Дата Рождения
*			-Дата поступления на службу
*			-Часть
*/
package command;

public class lab3 {
	private String famili;
    private int rote;
    private String zvanie;
    private String DR;
    private String Data;
    private String chast;
    public lab3(String famili, int rote, String zvanie, String DR, String Data, String chast) {
        this.famili = famili;
        this.rote = rote;
        this.zvanie = zvanie;
        this.DR = DR;
        this.Data = Data;
        this.chast = chast;
    }

    public int getRote() {
        return rote;
    }

    public void setRote(int rote) {
        this.rote = rote;
    }

    public String getDR() {
        return DR;
    }

    public void setDR(String DR) {
        this.DR = DR;
    }

    public String getFamili() {
        return famili;
    }

    public void setFamili(String famili) {
        this.famili = famili;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getZvan() {
        return zvanie;
    }

    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }

    public String getChast() {
        return chast;
    }

    public void setChast(String chast) {
        this.chast = chast;
    }

    public String toString() {
    	return " Familia: " + famili + ";\n Rota: " + rote + ";\n Zvanie: "+zvanie+";\n Data rozhdenia: "+DR+";\n Data poctyplenia na clyzhby: "+Data+";\n Chact: "+chast+"."; 
    }
}
