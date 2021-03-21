package zad5;

public class Rozpoznawanie {
	public static void main(String[] args) {
		
		String dane ="61110512143";
		int ifDate = 0;
		int ifName = 0;
		Przeciazanie.Dane(dane,ifDate , ifName);
		
		if(ifName == 0)
		{
			if(ifDate==0)
			{
				if(dane.length() == 11)
				{
					Przeciazanie.Dane(dane);
				}
				else
				{
					long wiek = Long.parseLong(dane); 
					Przeciazanie.Dane(wiek);
				}
			}
			else
			{
				
			}
		}
		else
		{
			
		}
	}
}
