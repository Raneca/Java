package caisse;

public class FondDeCaisse {
	private static int[] billets = {500,200,100,50,20,10,5};
	private static double[] pieces = {2,1,0.5,0.2,0.1,0.05,0.02,0.01} ;
	private static int[] nbbillets= {5,2,1,2,1,10,5};
	private static int[] nbpieces= {2,1,5,2,1,5,2,10} ;
	public static int[] getBillets() {
		return billets;
	}
	public static double[] getPieces() {
		return pieces;
	}
	public static int[] getNbbillets() {
		return nbbillets;
	}
	public static int[] getNbpieces() {
		return nbpieces;
	}
	
	
}
