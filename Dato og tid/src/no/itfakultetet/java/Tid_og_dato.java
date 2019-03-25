package no.itfakultetet.java;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tid_og_dato { // Klasse starter her

	public static void main(String[] args) { // Main starter her

		LocalDate idag = LocalDate.now();
		System.out.println(idag);
		
		LocalDateTime naa = LocalDateTime.now();
		System.out.println(naa);
		
		LocalDate generalforsamling = LocalDate.of(2019, 2, 23);
        LocalDate utsattGeneralforsamling = generalforsamling.plusDays(25);
        
		
		
		
	} // Main slutter her

} //klasse slutter her
