package simplifyRads;

public class simplifyRads {

    public static void main(String[] args) {

    double n = 50; //radicand to be simplified
    double nSqrt = Math.sqrt(n); //find actual square root of radicand
    if (nSqrt % 1 ==0) { 
        System.out.print(nSqrt); //check if n is a perfect square and print answer if so
    }
/*since the number outside the radical cannot be greater than the square root of
the original radicand, we can limit our bruteforce of the outside number to an
integer between 1 and nSqrt*/

    for (int i = (int)nSqrt; i>1; i--) {   
      if (n % Math.pow(i,2)==0){ //if n/i^2 has no remainder, we are at the correct value
          int a = (int)Math.pow(i,2);
    System.out.print(i+"√"+n/a);
      }
    }
  }
}
