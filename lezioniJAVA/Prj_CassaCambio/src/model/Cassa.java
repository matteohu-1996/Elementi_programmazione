package model;

public class Cassa {
	
	public String nome;
	public double fondoIniziale;
	public double saldo;
	public Cassa(String nome, double fondoIniziale) {
		this.nome = nome;
		this.fondoIniziale = fondoIniziale;
	}
	
	public void addFondi (double fondi) {
		this.fondoIniziale += fondi;
	}
	
	public void eseguiCambio(double importoEuro) {
		double tassoCambio = 0.85;
		double cambioE_D = importoEuro / tassoCambio; // dollari che escono
		// da fare controllo sul cambio se può venire o no
		if (cambioE_D < fondoIniziale) {
			fondoIniziale -= cambioE_D;
			saldo += importoEuro;
			System.out.println("Euro iniziali: " + importoEuro + "= Dollari: " + cambioE_D);
			
		} else {
			System.out.println("Mi spiace, non puoi ottenre un cambio, fondi mancanti");
			//Prevedere la possibilità di aggiungere fondi
		}
		
 	}
	public double[] calcolaRestante() {
		System.out.println("Saldo in €: " + this.saldo);
		System.out.println("Fondo in €: " + this.fondoIniziale);
		double[] restante = new double[2];
		restante[0] = this.saldo;
		restante[1] = this.fondoIniziale;
		return restante;
	}
	
	
}
