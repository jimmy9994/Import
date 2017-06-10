
import java.util.Scanner;
import java.util.Random;

public class aaa {

	public static void main(String[] args) 
	{
		Scanner wczytaj = new Scanner(System.in);
		int min, max, ileZnaleziono;
		int licznosc = 0;
		System.out.print("Podaj dolna wartosc przedzia³u: ");
		min = wczytaj.nextInt();
		System.out.print("Podaj gorna wartosc przedzia³u: ");
		max = wczytaj.nextInt();
		int tab[] = new int[10];
		int wyniki[] = new int[10];
		
		/*
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Podaj liczbe nr." + (i+1) +": ");
			tab[i] = wczytaj.nextInt();
		}
		*/
		Random losowanie = new Random();
		for (int i = 0; i < 10; i++)
		{
			tab[i] = losowanie.nextInt(100);
		}
		
		for (int i = 0; i < 10;i++)
		{
			if (tab[i] >= min && tab[i] <= max)
			{
				wyniki[licznosc] = tab[i];
				licznosc++;
			} 
		}
		
		System.out.println("Znaleziono " + licznosc + " liczby pasujacych do podanego przedzialu");
		
		for (int i = 0; i < licznosc;i++)
		{
			System.out.print(wyniki[i] + ", ");
		}
	}

}
