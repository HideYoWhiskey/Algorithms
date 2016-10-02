package pythagoreanTriples;

public class Triangle {
	double perimtr=1000;
	double startA, startB;
	public Triangle(double aMagnitude, double bMagnitude){
		startA = aMagnitude;
		startB = bMagnitude;
	}

	public void findABC(){
		for(double a1=startA;a1<=(perimtr/2);a1++){
			for(double b1=startB;b1<=(perimtr/2);b1++){
				for(double c1=(1+b1);c1<=perimtr;c1++){
					if(a1+b1+c1==perimtr && (a1*a1)+(b1*b1)==(c1*c1)){
						double a=a1;
						double b=b1;
						double c=c1;
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
						//Following line is for a Project Euler Problem(Problem 9)
						System.out.println("Product of a, b, and c: " + (a*b*c));
						return;
						}
				}
			}
		}
	}
}
