package zad5;

public class Przeciazanie {
	
	public static void Dane(String pesel) {
	System.out.println("Twoja data urodzenia to 19" + pesel.substring(0, 2) +"." + pesel.substring(2, 4) +"."+pesel.substring(4, 6));
	}
	
	public static void Dane(long wiek) {
	long r = 2021-wiek;
	System.out.println("Urodziles sie w	" + r +	" roku");
	}
}
