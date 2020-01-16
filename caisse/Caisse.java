package caisse;
import java.util.ArrayList;
import java.util.Collections;

import argent.Argent;
import argent.Billet;
import argent.Pieces;

public class Caisse implements eCaisse,Administrable {
	ArrayList<Compartiment>  contient=new ArrayList<Compartiment>();
	private double valeur=0.0;
	public Caisse() {
		for(int i=0;i<FondDeCaisse.getBillets().length;i++) {
			contient.add(new Compartiment());
			for(int j=0;j<FondDeCaisse.getNbbillets()[i];j++) {
				contient.get(i).addBillet(new Billet(FondDeCaisse.getBillets()[i]));
			}
		}
//		Collections.sort(contient);
		int tailleBillets=contient.size();
		for(int k=0;k<FondDeCaisse.getPieces().length;k++) {
			contient.add(new Compartiment());
			for(int l=0;l<FondDeCaisse.getNbpieces()[k];l++) {
				contient.get(tailleBillets+k).addPieces(new Pieces(FondDeCaisse.getPieces()[k]));
			}
		}
	}
		
	public double calculerTotal() {
		double total=0;
			for (Compartiment compartiment : contient) {
				total+=compartiment.getValeur();
			}
			valeur=total;
			return total;
	}
	public double rendreMonnaie(double prix,double montant) {
		if(montant-prix<0) {System.out.println("pas donner assez");return 0;}
		else return montant-prix;
	}
	
	public boolean verifierCoherence() {
		double sommeComp=0;
		double sommeArgent=0;
		for(int i=0;i<contient.size()-1;i++) {
			sommeComp+=contient.get(i).getValeur();
				for(int j=0;j<contient.get(i).getContenu().size();j++){
					sommeArgent+=contient.get(i).getArgent(j).getValeur();
				}
		}
		sommeComp=Math.round(sommeComp* 100.0)/100.0;
		sommeArgent=Math.round(sommeArgent*100.0)/100.0;
		if(Double.compare(sommeComp, valeur)!=0) {System.err.println(sommeComp+ "!= "+valeur+" Compartiment error");return false;}
		else 
			if(Double.compare(sommeArgent, valeur)!=0) {System.err.println(sommeArgent+ "!= "+valeur+" Argent error");return false;}
			else return true;
	}
	
	public void addCompartiment(Compartiment comp) {
		this.contient.add(comp);
	}
	public void  afficherContenu() {
		for (Compartiment compartiment : contient) {
			compartiment.afficherContenu();
		}
	}
	public ArrayList<Compartiment> getContient() {
		return contient;
	}
	public Compartiment getCompartiment(int i) {
			return contient.get(i);
	}
	 public void getChange(double d){
		  System.out.println("A rendre "+d);
	  for(int i=0;i<this.contient.size();i++) {
		  ArrayList <Argent> actuel=this.contient.get(i).getContenu();//prendre l'array de Argent de l'element i

		  for(int j=0;j<actuel.size();j++) {

			  if((int)(d/actuel.get(j).getValeur())>0) {
				  d-=actuel.get(j).getValeur();
				  System.out.print(" "+actuel.get(j).getValeur()+" ");
				  actuel.remove(j);
			  }

		  }
	  };
	}


	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
}
	 
