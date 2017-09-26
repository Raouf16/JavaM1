
public abstract class Expr {
	
	public abstract double eval();
	
	public static void main (String[] args){
		Expr val = new Val(1337.0);
		System.out.println(val); 
		Expr add = new Add(new Val(327.0), val);
		System.out.println(add); 
		Expr e = new Add (new Val(350.0), add);
		System.out.println(e);  
		Expr m = new Mult(e, new Val(2));
		System.out.println(m);
		Expr c = new Rcarre(m);
		System.out.println(c);
	}
}

