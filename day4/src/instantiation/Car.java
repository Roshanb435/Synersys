package instantiation;

import java.util.Objects;

public class Car {
	Engine e;
	private String brand;
	private String color;
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car(Engine e, String brand, String color) {
		super();
		this.e = e;
		this.brand = brand;
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, e);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && Objects.equals(e, other.e);
	}
	@Override
	public String toString() {
		return "Car [e=" + e + ", brand=" + brand + ", color=" + color + ", getE()=" + getE() + ", getBrand()="
				+ getBrand() + ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
