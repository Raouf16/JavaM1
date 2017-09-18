import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class PrimeCollection {
	private ArrayList<Integer> s = new ArrayList<Integer>();
	Random rd = new Random();
	
	private void initRandom(int n, int m){
		for(int i = 0 ; i < n ; i++){
			s.add(rd.nextInt(m));
		}
	}
	
	private boolean isPrime(int p){
		if(p == 0 || p == 1) return false;
		for(int i = 2 ; i <= Math.sqrt(p); i++){
			if(p%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		PrimeCollection collection = new PrimeCollection();
		collection.initRandom(100, 100);
		for(int x : collection.s){
			if(collection.isPrime(x)) System.out.println(x);
		}
	}
}
