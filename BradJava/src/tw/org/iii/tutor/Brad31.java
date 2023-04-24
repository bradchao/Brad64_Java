package tw.org.iii.tutor;

public class Brad31 {
	public static void main(String[] args) {
		RecShape s1 = new RecShape(10, 3);
		Circle s2 = new Circle(4);
		System.out.println(m1(s1));
		System.out.println(m1(s2));
	}
	static String m1(Shape shape) {
		if (shape instanceof RecShape) {
			System.out.println(((RecShape)shape).isSquare()?"OK":"XX");
		}else if (shape instanceof Circle) {
			System.out.println(((Circle)shape).getDiameter());
		}
		return shape.length() + ":" + shape.area();
	}
}
interface Shape {
	double length();	// public abstract
	double area();
}
class RecShape implements Shape {
	int w, h;
	public RecShape(int w, int h) {
		this.w = w; this.h = h;
	}
	public double length() {return (w + h)*2;}
	public double area() { return w * h;}
	public boolean isSquare() {return w == h;}
}
class Circle implements Shape {
	double r;
	Circle(double r){this.r = r;}
	public double length() {return r * 2 * Math.PI;}
	public double area() { return r * r * Math.PI;}
	public double getDiameter() {return 2*r;}
}