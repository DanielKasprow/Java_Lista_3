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
		
	}
	
	public static void Dane(String dane,int ifDate, int ifName)
	{
		for(int x=0;x<dane.length();x++)
		{
			char myStrCharacter = dane.charAt(x);//przypisanie znaku
			if(myStrCharacter == ' ')//sprzawdzanie czy dany znak slowa jest taki sam znak podslowa
				ifName++;
			if(myStrCharacter == '.')//sprzawdzanie czy dany znak slowa jest taki sam znak podslowa
				ifDate++;
		}
	}
}
