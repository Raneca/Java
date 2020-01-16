package argent;

public class Pieces extends Argent {
	public Pieces(double n, String s) {
		super(n,s);
	}
	
	public Pieces(Double n){
		super(n,Double.toString(n));
	}
	
	@Override
	public String toString() {
		return "Pieces "+super.toString();
	}
}
