package tw.org.iii.myclasses;

public class Bike extends Object{
	protected double speed;
	private String color;
	
	public Bike() {
		System.out.println("Bike()");
		setColor();
	}
	
	private void setColor() {
		color = "yellow";
	}
	
	public String getColor() {
		return color;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}
	
	public double getSpeed() {
		return speed;
	}
}
