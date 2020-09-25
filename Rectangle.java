package practice;

public class Rectangle extends GeometricObject {
	private int width;
	private int height;
	
	public Rectangle( int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int getArea() {
		return this.height * this.width;
	}
}
