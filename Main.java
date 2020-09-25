package practice;
//use GeometricObject as abstract class
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject circle = new Circle(4);
		GeometricObject rectangle = new Rectangle(1,2);
		
		int max = circle.compareTo(rectangle);
		
		System.out.println(max);
	
		
	}

}
