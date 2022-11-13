package zad1;

import java.util.Scanner;

public class rozdzielanie_stringu {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj Dane: ");
		String dane = sc.next();
		sc.close();
		//dane = "Daniel Kasprow";
		String[] divineDane = dane.split("\\s+");

		for (String x: divineDane)
			System.out.println(x);
	}
}
