package zad5;

public class Przeciazanie {
	
	public static void Dane(String pesel) {
	System.out.println("Twoja data urodzenia to 19" + pesel.substring(0, 2) +"." + pesel.substring(2, 4) +"."+pesel.substring(4, 6));
	if(pesel.charAt(9)%2==0) 
		System.out.println("Plec: Kobieta");
	else
		System.out.println("Plec: Mezczyzna");
	}
	
	public static void Dane(long wiek) {
	long r = 2021-wiek;
	System.out.println("Urodziles sie w	" + r +	" roku");
	}
	
	public static void Dane(String dane,int ifName)
	{
		String[] divineDane = dane.split(" ");
		if(ifName==1)
		{
			System.out.println("Imie: " + divineDane[0]);
			System.out.println("Nazwisko: " + divineDane[1]);

		}
		else if(ifName==2)
		{
			System.out.println("Pierwsze Imie: " + divineDane[0]);
			System.out.println("Drugie Imie: " + divineDane[1]);
			System.out.println("Nazwisko: " + divineDane[2]);
		}
	}
	
	public static void Dane(String dane, String a)
	{
		String[] divineDate = dane.split("\\.");
		int day=0,month=0;
		day=Integer.parseInt(divineDate[0]);
		month=Integer.parseInt(divineDate[1]);
		String months[]= {"Styczen","Luty","Marzec","Kwiecen","Maj","Czerwiec","Lipiec","Sierpien","Wrzesien","Paxdziernik","Listopad","Grudzien"};
		System.out.println("Urodziles sie " + day + " " + months[month] + " " + divineDate[2] + " roku");
	}
	
	public static int[] Dane(String dane,int[] ifNameDate)
	{
		for(int x=0;x<dane.length();x++)
		{
			char myStrCharacter = dane.charAt(x);//przypisanie znaku
			if(myStrCharacter == ' ')//sprzawdzanie czy dany znak slowa jest taki sam znak podslowa
				ifNameDate[0]++;
			if(myStrCharacter == '.')//sprzawdzanie czy dany znak slowa jest taki sam znak podslowa
				ifNameDate[1]++;
		}
		return ifNameDate;
	}
}
