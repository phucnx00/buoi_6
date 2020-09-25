package practice;

public abstract class  GeometricObject implements Comparable<GeometricObject> {
	
	private int area;
	
	public int getArea() {
		return 0;
	}
	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return  (this.getArea() > o.area) ? this.getArea() : o.area;
	}
	
	
}
