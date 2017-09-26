
public class Rcarre extends Expr {
	private Expr val;

	public Rcarre(Expr val){
		this.val = val;
	}
	
	public double eval(){
		return Math.sqrt(val.eval());
	}
	
	public String toString(){
		return "\u221a"+val.eval()+" = "+Math.sqrt(val.eval());
	}
}

