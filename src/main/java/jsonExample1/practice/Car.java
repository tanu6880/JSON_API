package jsonExample1.practice;

public class Car {

	String color;
	String type;
	@Override
	public String toString() {
		return "Car [color=" + color + ", type=" + type + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
}
