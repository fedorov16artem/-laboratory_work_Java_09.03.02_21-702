package Laboratory4;

import java.util.ArrayList;//Класс для работы со списками (динамическими массивами) 

public class accounting {
	private ArrayList<Army> listOfArmy;

//Метод хранения списка Военнослужащих 
	public accounting(ArrayList<Army> listOfArmy) {
		this.listOfArmy = listOfArmy;
	}
	
//Метод добавления нового Военногослужащего 
	public void addArmy(Army Laboratory4, ArrayList<Army> listOfArmys) {
		listOfArmys.add(Laboratory4);
	}
	
//Метод печати списка Военослужащих 
	public ArrayList<Army> printArmy() {
		return listOfArmy;
	}
	
	public static void main(String[] args) {
		ArrayList<Army> listOfArmy = new ArrayList<>();
		accounting accounting = new accounting(listOfArmy);
		
		String famili = "Федоров"; // фамилия
		String rote = "РС(КО)"; //рота
	    String zvanie = "Младший Сержант"; // звание
	    String DR = "21.02.2000"; // дата рождения
	  	String Data = "06.07.2020"; // дата поступления на службу
	  	String chast = "25801"; // часть
	    
	    String okrug = "Западный военный округ";//Округ
		int visluga = 2; //Выслуга лет
		String dolznost= "Командир отделения"; //Должность военослужащего
		int amount = 10000; //Сумма надбавки
		Contractors contractors = new Contractors(famili,rote,zvanie,DR,Data,chast,okrug,visluga,dolznost,amount);//объект класса
		accounting.addArmy(contractors, listOfArmy);//Метод добавления
		
		String  title= "За безупречную службу"; //Название награды
		int Amount = 15000; //Премия
		int prize = 10000; //Сумма надбавки
		award award = new award(famili,rote ,zvanie ,DR ,Data ,chast,title,Amount,prize);//Объект класса			
		accounting.addArmy(award, listOfArmy);//Метод добавления
		
		String  dogovor = "20.07.2020-21.07.2023";//Пероид договор
		String datadog = "19.07.2020";//Дата договора
		int  nomerprot = 234124;//Номер протокола
		int  sumzp = 32702;//Сумма зарплаты
		governing governing = new governing(famili,rote ,zvanie ,DR ,Data,chast,dogovor,datadog, nomerprot,sumzp);// объект класса
			
		accounting.addArmy(governing, listOfArmy);// метод добавления
		
		System.out.print(accounting.printArmy());
	}
}