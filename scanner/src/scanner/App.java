package scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		if (args.length==2) {
		String filnavn = args[0];
		String tekst = args[1];
		
		
		try {
			FileWriter utfil = new FileWriter(filnavn);
			utfil.write(tekst);
			utfil.close();
			System.out.println("Filen "+filnavn+" ble laget med innhold "+ tekst);
		} catch (IOException e) {
			System.out.println("Filen "+filnavn+" ble ikke laget med innhold "+ tekst);
			e.printStackTrace();
		}		
				
		System.out.println("Du ba om filen: "+filnavn);
		} else {
			System.out.println("Bruk: Send med filnavn og tekst.. ");
		}
		
//		System.out.println("Skriv navnet ditt: ");
//		Scanner sc = new Scanner(System.in);
//		String navn = sc.nextLine();
//		System.out.println("Hei, "+navn+"!");
//		sc.close();
		
		
//		System.out.println("Du ba om filen: "+filavn);
		
	}

}
