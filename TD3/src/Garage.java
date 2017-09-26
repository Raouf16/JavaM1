import java.util.ArrayList;
import java.util.Objects;

public class Garage {
	private ArrayList<Car> listCar = new ArrayList<>();
	private static int numeroGarage = 0;
	private final int id;
	
	public Garage(){
		numeroGarage++;
		id = numeroGarage;
	}
	
	public void add(Car c){
		listCar.add(Objects.requireNonNull(c));
	}

	public int getId() {
		return id;
	}
	
	public int getValue(){
		int Somme = 0;
		for (Car x : listCar){
			Somme += x.getValue();
		}
		return Somme;
	}
	
	public Car firstCarByBrand(String marque){
		for (Car z : listCar){
			if(z.getBrand().equals(marque)) return z;
		}
		return null;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("id du garage");
		builder.append(id);
		for (Car c : listCar){
			builder.append(c);
		}
		return builder.toString();
	}
}
