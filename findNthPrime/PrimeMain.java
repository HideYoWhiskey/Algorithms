package findNthPrime;

public class PrimeMain {
	static boolean isPrime(int n){
		for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		int primeNeeded=10001;
		int count=0;
		//massive number below is two numbers below the max number for ints in java 
		for(int i=3;i<=2147483645;i++){
			if(isPrime(i)){
				count++;
			}
			if(count==primeNeeded){
				System.out.println(i);
				return;
			}
		}
	}

}
