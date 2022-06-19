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
        this.famili = famili; // Фамилия
        this.rote = rote; // Рота
        this.zvanie = zvanie; // Звание
        this.DR = DR; // Дата РОждения
        this.Data = Data; // Дата прибытие на службу
        this.chast = chast; // Часть
    }
//Метод для получения значения атрибута
    public int getRote(){
        return rote;
    }
//Метод для изменения значения атрибута
    public void setRote(int rote) {	   	
        this.rote = rote;
    }
//Метод для получения значения атрибута
    public String getDR() {
        return DR;
    }
//Метод для изменения значения атрибута
    public void setDR(String DR) {
        this.DR = DR;
    }
//Метод для получения значения атрибута
    public String getFamili() {
        return famili;
    }
//Метод для изменения значения атрибута
    public void setFamili(String famili) {
        this.famili = famili;
    }
//Метод для получения значения атрибута
    public String getData() {
        return Data;
    }
//Метод для изменения значения атрибута
    public void setData(String data) {
        Data = data;
    }
//Метод для получения значения атрибута
    public String getZvan() {
        return zvanie;
    }
//Метод для изменения значения атрибута
    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }
//Метод для получения значения атрибута
    public String getChast() {
        return chast;
    }
//Метод для измения значения атрибута
    public void setChast(String chast) {
        this.chast = chast;
    }
//Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией
    public String toString() {
    	return " Familia: " + famili + ";\n Rota: " + rote + ";\n Zvanie: "+zvanie+";\n Data rozhdenia: "+DR+";\n Data poctyplenia na clyzhby: "+Data+";\n Chact: "+chast+"."; 
    }
}
