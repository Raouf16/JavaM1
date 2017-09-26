

import static org.junit.Assert.*;

import org.junit.Test;

public class ExprTest {

	@Test
	public void evalValue() {
		Expr val = new Val(1337.0);
		assertEquals(1337.0, val.eval(), 0.1);
	}
	
	@Test
	public void evalAdd1() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		assertEquals(1664.0, add.eval(), 0.1);
	}
	
	@Test
	public void evalAdd2() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		Expr e = new Add(new Val(352.0), add);
		assertEquals(2016.0, e.eval(), 0.1);
	}
	
	@Test
	public void evalAdd3() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		Expr e = new Add(new Val(352.0), add);
		Expr e2 = new Add(val, e);
		assertEquals(3353.0, e2.eval(), 0.1);
	}
	
	@Test
	public void evalMult1() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		Expr mult = new Mult(new Val(10.0), add);
		assertEquals(16640.0, mult.eval(), 0.1);
	}
	
	@Test
	public void sysoMult1() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		Expr mult = new Mult(new Val(10.0), add);
		assertEquals("(10.0)*(327.0+1337.0)", mult.toString());
	}
	
	
	@Test
	public void sysoValue() {
		Expr val = new Val(1337.0);
		assertEquals("1337.0", val.toString());
	}
	
	@Test
	public void sysoAdd1() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		assertEquals("327.0+1337.0", add.toString());
	}
	
	@Test
	public void sysoAdd2() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		Expr e = new Add(new Val(352.0), add);
		assertEquals("352.0+327.0+1337.0", e.toString());
	}
	
	@Test
	public void sysoAdd3() {
		Expr val = new Val(1337.0);
		Expr add = new Add(new Val(327.0), val);
		Expr e = new Add(new Val(352.0), add);
		Expr e2 = new Add(val, e);
		assertEquals("1337.0+352.0+327.0+1337.0", e2.toString());
	}
	
	

}
