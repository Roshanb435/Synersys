package instantiation;

public class Driver {
		public static void main(String[] args) {
			Car c = new Car(new Engine(12345,"hello","petrol"),"skoda", null);
			System.out.println(c);
		}

}
