package zad5;

public class Rozpoznawanie {
	public static void main(String[] args) {
		
		String pesel ="25";
		long wiek = Long.parseLong(pesel); 
		
		if(pesel.length() == 11)
			Przeciazanie.Dane(pesel);
		else
			Przeciazanie.Dane(wiek);
		}
}
