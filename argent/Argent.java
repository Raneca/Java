package argent;

public abstract class Argent {
	private double valeur;
	private String nom;
	public double getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Argent(double valeur, String nom) {
		super();
		this.valeur = valeur;
		this.nom = nom;
	}
	
	public Argent(double valeur) {
		super();
		this.valeur = valeur;
		this.nom=Double.toString(valeur);
	}
	@Override
	public  String toString() {
		return ("["+this.getNom()+":"+this.getValeur()+"] ");
	}
}
