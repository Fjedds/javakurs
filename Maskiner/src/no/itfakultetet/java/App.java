package no.itfakultetet.java;

public class App {

	public static void main(String[] args) {

		Maskin laptop1 = new Maskin("Lenovo ThinkPad");
		laptop1.setPris(17000.0);
		laptop1.setVekt(2.7);

		Maskin laptop2 = new Maskin("Lenovo IdeaPad", 8500.0);

		Maskin desktop1 = new Maskin();
		desktop1.setType("Lenovo DeskTop");

		System.out.println(
				"Type: " + laptop1.getType() + "\nPris: " + laptop1.getPris() + "\nVekt: " + laptop1.getVekt()); 

		System.out.println(laptop1.toString());

		DataMaskin server1 = new DataMaskin();
		DataMaskin server2 = new DataMaskin("i7", 46);

		server1.setPris(23000.0);
		server1.setRamGB(32);
		server1.setType("Centos Server");

		server1.start();
		server2.start();

		System.out.println("server1: " + server1);
		System.out.println("server2: " + server2);

	}

}
