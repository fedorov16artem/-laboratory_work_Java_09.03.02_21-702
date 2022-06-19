package Laboratory4;

public class Army {
	private String famili; // фамилия
    private String rote; //рота
    private String zvanie; // звание
    private String DR; // дата рождения
    private String Data; // дата поступления на службу
    private String chast; // часть
    public Army(String famili, String rote, String zvanie, String DR, String Data, String chast)
    {
        this.famili = famili; // Фамилия
        this.rote = rote; // Рота
        this.zvanie = zvanie; // Звание
        this.DR = DR; // Дата РОждения
        this.Data = Data; // Дата прибытие на службу
        this.chast = chast; // Часть
    }

//Метод для получения значения атрибута
    public String getRote(){
        return rote;
    }
//Метод для изменения значения атрибута
    public void setRote(String rote) {	   	
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
//Метод для изменеия значения атрибута
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
//Метод для изменения значения атрибута
    public void setChast(String chast) {
        this.chast = chast;
    }
//Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией
    public String toString() {
    	return "Фамилия:" + famili + ";\nРота: " + rote + ";\nЗвание: "+zvanie+";\nДата рождения: "+DR+";\nДата поступления на службу: "+Data+";\nЧасть: "+chast+"."; 
    }
}