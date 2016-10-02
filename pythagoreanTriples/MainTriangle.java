package pythagoreanTriples;

public class MainTriangle {

	public static void main(String[] args) {
		/*
		 * This program will find the value inputed in the Triangle Class, "perimtr" (perimeter of all the 
		 * sides of the triangle object) and run it through a method of the triangle class to find the a,b,c 
		 * values. 
		 */
		Triangle tri1= new Triangle(3,4);
		tri1.findABC();
	}

}
