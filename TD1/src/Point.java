
public class Point {
	private int x,y;
	private static int count; 
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	public Point(int px, int py){
		this.x = px;
		this.y = py;
		count++;
	}
	
	public static void main(String[] args){
		int x = 1;
		int y = 1;
		Point p=new Point(x,y);
		System.out.println(p.x+" "+p.y);
	}
}