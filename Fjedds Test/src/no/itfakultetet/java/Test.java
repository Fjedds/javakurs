package no.itfakultetet.java;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Hallo verden!");
		
		ArrayList<String> navn = new ArrayList<>();
		navn.add("ola");
		navn.add("Kari");
		navn.add("Petter");
		
		for (String person : navn) {
			System.out.println("navn: "+person);
			
		}
		System.out.println("------------------");
		
		List<String> navn2 = List.of("Ola", "Kari","Petter"); // lager en liste
		navn2.forEach(System.out::println); // skriver ut listren til skjerm
		//Java 11 - mer konsis kode
		
		
		
		
		

		
		
		
		
	}
}
