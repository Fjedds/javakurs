package no.itfakultet.java;

public class Strenger {

	public static void main(String[] args) {

		String tekst = "Dette er en tekst";
		String tekst2 = (tekst + " pluss litt til").toUpperCase();
		System.out.println(tekst2);

		System.out.println(tekst.replace("er", "var"));
		
		System.out.println(tekst+" "+tekst2);
		
		StringBuilder sb = new StringBuilder("Dette er starten på teksten. ");
		sb.append("Dette er en tekst som kan endres");
		
		System.out.println("lengden på bufferen: "+sb.length());
		System.out.println("lengden på bufferen: "+sb.capacity());
		
		sb.append("Her legger jeg til litt mer tekst.");
		
		System.out.println("lengden på bufferen: "+sb.length());
		System.out.println("lengden på bufferen: "+sb.capacity());
		
		String cd = "abcdef".substring(2,4);
		System.out.println(cd);


	}

}
