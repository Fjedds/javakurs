package no.itfakultetet.java;

public class Maskin {
	private String kategori;
	private String type;
	private Double pris;
	private Double vekt;

	public Maskin() {
		System.out.println("Konstruktør1 ble kalt opp");
		this.kategori = "Maskin";
	}

	public Maskin(String type) {
		this();
		this.type = type;
	}

	public Maskin(String type, Double pris) {
		this();
		this.type = type;
		this.pris = pris;
	}

	public String getKategori() {
		return kategori;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPris() {
		return pris;
	}

	public void setPris(Double pris) {
		this.pris = pris;
	}

	public Double getVekt() {
		return vekt;
	}

	public void setVekt(Double vekt) {
		this.vekt = vekt;
	}

	@Override
	public String toString() {
		return "Maskin [type=" + type + ", pris=" + pris + ", vekt=" + vekt + "]";
	}

}
