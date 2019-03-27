package no.itfakultetet.no;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filer {

	public static void main(String[] args) {

		try {
			FileWriter utfil = new FileWriter("fil.txt");
			utfil.write("Dette er en fil med litt tekst.\n");
			utfil.append("Og her er litt tekst til.\n");
			utfil.append("Og her er litt tekst til ...");

			utfil.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// les filen og skriv linje for linje til skjerm
		try (FileReader innfil = new FileReader("fil.txt")) {

			Scanner sc = new Scanner(innfil);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
