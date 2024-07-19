package Classes_And_Objects;

public class Car {
	private double price;
	private int year;
	private String brand;
	private String owner;
	
	public Car (String owner, String brand, double price, int year) {
		this.owner = owner;
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	
	double scrapMetal() {
		return this.price - this.year;
	}
	
	double discountPrice() {
		double age = 2023 - this.year;
		double result = this.price - (age/100 * this.price);
		return result;
	}
	
	double getPrice() {
		return this.price;
	}
	
	public String toString() {
		int age = 2023 - this.year;
		String year = "year";
		if (age > 1) {
			year = "years";
		}
		return "This " + age + " "+ year +" old " + this.brand + " belongs to " + this.owner + " and it costs " + this.price + " euros.";
	}
	
	boolean isItNew() {
		return this.year > 2019;
	}
	
	String getName() {
		return this.owner;
	}
	
	void loteryTicket(int a, int b) {
		if (a == b) {
			this.brand = "Opel";
			this.year = 1995;
			this.price = 500;
		}
	}
}
