package caisse;

import java.util.ArrayList;

import argent.Argent;
import argent.Billet;
import argent.Pieces;

public class Compartiment implements Comparable<Compartiment> {
	private ArrayList<Argent> contenu=new ArrayList <Argent>();//list a faire pour différencier les billets des pieces
	private double valeur=0;
	
	public Compartiment(Argent argent) {
		System.out.println(argent.getValeur());
		valeur+=argent.getValeur();
	}

	public Compartiment() {
	}

	public double getValeur() {
		return valeur;
	}
	
	public double calculerValeur() {
		double somme=0.0;
		for (Argent argent : contenu) {
			somme+=argent.getValeur();
		}
		return somme;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public void addBillet(Billet bi){
		this.contenu.add(bi);
		this.valeur+=bi.getValeur();
	}
	public void addPieces(Pieces pi) {
		this.contenu.add(pi);
		this.valeur+=pi.getValeur();
	}
	
	public void afficherContenu() {
		for (Argent argent : contenu) {
			System.out.print(argent.toString());
		}System.out.println(" "+"\t");
	}
	public Argent getArgent(int i) {
		return contenu.get(i);
	}

	public ArrayList<Argent> getContenu() {
		return contenu;
	}
	public void removeArgent(int i) {
		contenu.remove(i);
	}

	public int compareTo(Compartiment comp) {
		if(this.calculerValeur()==comp.calculerValeur()) return 0;
		else if (this.calculerValeur()<comp.calculerValeur()) return 1;
		else return -1;
	}
	
	public String toString() {
	String retour="";
		for (Argent argent : contenu) {
			retour=retour+" "+argent.getValeur();
		}
		return retour;
	}
}
