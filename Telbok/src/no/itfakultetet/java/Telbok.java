package no.itfakultetet.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Telbok {

	public static void main(String[] args) throws IOException {
		
		
		String navn, nummer;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		Properties bok = new Properties();
		
		try {
            FileInputStream fil = new FileInputStream("telefonbok.dat");
            bok.loadFromXML(fil);
        } catch (Exception e) {
            // do nothing
        }
		
		do {

            System.out.println("Legg inn navn:");
            // navn = sc.netxtLine();
            navn = br.readLine();
            if (navn.equals("q"))
                continue;
            System.out.println("Legg inn telefonnummer:");
            // nummer = sc.netxtLine();
            nummer = br.readLine();
            bok.put(navn, nummer);
        } while (!navn.equals("q"));
		
		try {

            FileOutputStream utfil = new FileOutputStream("telefonbok.dat");
            bok.storeToXML(utfil, "Telefonbok", "utf8");
            br.close();

        } catch (Exception e) {
            System.out.println("Kunne ikke lagre boken fordi: " + e);
        }

        
        
        
        
		
	}

}
