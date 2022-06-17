package laba4;

public class Army {
	private String famili;
    private int rote;
    private String zvanie;
    private String DR;
    private String Data;
    private String chast;
    public Army(int rote, String famili, String zvanie, String DR, String data, String chast)
    {
        this.famili = famili; // Фамилия
        this.rote = rote; // Рота
        this.zvanie = zvanie; // Звание
        this.DR = DR; // Дата РОждения
        this.Data = Data; // Дата прибытие на службу
        this.chast = chast; // Часть
    }

	//Метод для получения значения атрибута
    public int getRote(){
//Метод для получения значения атрибута
        return rote;
    }
//Метод для получения значения атрибута
    public void setRote(int rote) {	
//Метод для получения значения атрибута    	
        this.rote = rote;
    }
//Метод для получения значения атрибута
    public String getDR() {
//Метод для получения значения атрибута
        return DR;
    }
//Метод для получения значения атрибута
    public void setDR(String DR) {
//Метод для получения значения атрибута
        this.DR = DR;
    }
//Метод для получения значения атрибута
    public String getFamili() {
//Метод для получения значения атрибута
        return famili;
    }
//Метод для получения значения атрибута
    public void setFamili(String famili) {
//Метод для получения значения атрибута
        this.famili = famili;
    }
//Метод для получения значения атрибута
    public String getData() {
//Метод для получения значения атрибута
        return Data;
    }
//Метод для получения значения атрибута
    public void setData(String data) {
//Метод для получения значения атрибута
        Data = data;
    }
//Метод для получения значения атрибута
    public String getZvan() {
//Метод для получения значения атрибута
        return zvanie;
    }
//Метод для получения значения атрибута
    public void setZvanie(String zvanie) {
//Метод для получения значения атрибута
        this.zvanie = zvanie;
    }
//Метод для получения значения атрибута
    public String getChast() {
//Метод для получения значения атрибута
        return chast;
    }
//Метод для получения значения атрибута
    public void setChast(String chast) {
//Метод для получения значения атрибута
        this.chast = chast;
    }
//Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией
    public String toString() {
    	return " Familia: " + famili + ";\n Rota: " + rote + ";\n Zvanie: "+zvanie+";\n Data rozhdenia: "+DR+";\n Data poctyplenia na clyzhby: "+Data+";\n Chact: "+chast+"."; 
    }
}