package argent;

public class Billet extends Argent {
	public Billet(int n, String s){
		super(n,s);
	}
	public Billet(int n){
		super(n,Integer.toString(n));
	}
	@Override
	public String toString() {
		return "Billet "+super.toString();
	}
}
