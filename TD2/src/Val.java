
public class Val extends Expr{
	
	private double val;
	
	public Val( double val){
		this.val = val;
	}

	public double getVal() {
		return val;
	}
	
	public double eval(){
		return val;
	}
	
	public String toString(){
		return ""+val;
	}
}
