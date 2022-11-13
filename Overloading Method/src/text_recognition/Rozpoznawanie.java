package zad5;

public class Rozpoznawanie {
	public static void main(String[] args) {
		
		String dane ="01.10.1996";
		
		int ifNameDate[] = {0,0};
		ifNameDate=Przeciazanie.Dane(dane,ifNameDate);
		
		if(ifNameDate[0] == 0)
		{
			if(ifNameDate[1]==0)
			{
				if(dane.length() == 11)
				{
					Przeciazanie.Dane(dane);//wypisanie danych z pesela
				}
				else
				{
					long wiek = Long.parseLong(dane); //przekonwertowanie wieku na long
					Przeciazanie.Dane(wiek);//wypisanie roku urodzenia
				}
			}
			else
			{
				Przeciazanie.Dane(dane, "a");//wypisanie daty urodzenia
			}
		}
		else
		{
			Przeciazanie.Dane(dane, ifNameDate[0]);//Wypisanie imienia i nazwiska
		}
	}
}
