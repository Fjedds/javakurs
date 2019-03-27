package no.itfakultetet.java;

public class DataMaskin extends Maskin {

	
	private String prosessor;
	private int ramGB;
	
		
	public DataMaskin() {
		super();
			
	}


	public DataMaskin(String prosessor, int ramGB) {
		super();
		this.prosessor = prosessor;
		this.ramGB = ramGB;
	}

	
	public void start() {
	System.out.println("Datamaskin startet");
		
	}

	public void stopp() {
		System.out.println("Datamaskin stoppet");
	}
		
	public String getProsessor() {
		return prosessor;
	}


	public void setProsessor(String prosessor) {
		this.prosessor = prosessor;
	}


	public int getRamGB() {
		return ramGB;
	}


	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}


	@Override
	public String toString() {
		return "DataMaskin [prosessor=" + prosessor + ", ramGB=" + ramGB + ", toString()=" + super.toString() + "]";
	}

	
	
}
