package practice;

public class Circle extends GeometricObject  {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public int getArea() {
		return (int) (this.radius * this.radius *3.14);
	}

	
}
