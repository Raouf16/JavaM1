import java.util.Objects;

public class Car {
	private final String brand;
	private final String licencePlate;
	private long value;
	private int vetuste;
	
	public Car(String brand, String licencePlate, long value){
		this.brand = Objects.requireNonNull(brand);
		this.licencePlate = Objects.requireNonNull(licencePlate);
		if(value < 0) throw new IllegalArgumentException("Pas de valeur négative SVP");
		this.value = Objects.requireNonNull(value);
	}
	
	public Car(String brand, String licencePlate, long value, int vetuste){
		this(brand, licencePlate, value);
		this.vetuste = vetuste;
		this.value -= (1000*vetuste);
	}

	public String getBrand() {
		return brand;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public long getValue() {
		return value;
	}
	
	public int getVetuste() {
		return vetuste;
	}

	public void setVetuste(int vetuste) {
		this.vetuste = vetuste;
		this.value -= (1000*vetuste);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", licencePlate=" + licencePlate + ", value=" + value + "] \n";
	}
	
	
}
