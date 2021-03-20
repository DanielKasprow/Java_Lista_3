package zad2;

import java.util.Scanner;

public class podslowo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String myStr = "ntrdhtt";
		String underStr = "rd";
		int lenghtUnderStr = underStr.length();
		int checkingLenght=0;
		boolean underStrIsTrue = false;
		for(int x=0;x<myStr.length();x++)
		{
			char myStrCharacter = myStr.charAt(x);//przypisanie znaku
			char underStrCharacter = underStr.charAt(checkingLenght);
			if(myStrCharacter == underStrCharacter)//sprzawdzanie czy dany znak slowa jest taki sam znak podslowa
				checkingLenght++;
			else
				checkingLenght=0;
			if(checkingLenght==lenghtUnderStr)//sprawdzanie czy znaleziono podslowo
			{
				underStrIsTrue = true;
				break;
			}
		}
		System.out.println(underStrIsTrue);
		sc.close();
	}
}

