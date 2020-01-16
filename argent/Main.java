package argent;

import caisse.Caisse;
import caisse.Compartiment;
import caisse.FondDeCaisse;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Caisse caisse1=new Caisse();
			
			System.out.println("Caisse 1 ");
			caisse1.afficherContenu();
			caisse1.getContient();
			System.out.println(caisse1.calculerTotal());
			System.out.println(caisse1.verifierCoherence());
			caisse1.getChange(caisse1.rendreMonnaie(25.4,50));
			System.out.println();
			caisse1.afficherContenu();
	}
	
}
