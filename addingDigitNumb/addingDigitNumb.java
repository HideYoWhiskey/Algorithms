package addingDigitNumb;

public class addingDigitNumb {

	public static void main(String[] args) {
		/*
		 * Numbers must be entered into the arrays a[] and b[]
		 * in the opposite order. For example, if one wants the 
		 * array a[] to represent the number 123, said user must
		 * enter {3,2,1}.
		 */
		int[] a = {1,4,9};
		int[] b = {0,2,9};
		int m = a.length;
		//c[] has the m+1 references because carry must be added on to the end.
		int[] c = new int[m+1];
		int carry = 0;
		for(int i=0;i<=(m-1);i++){
			carry+=(a[i]+b[i]);
			c[i]=carry;
			if(c[i]>=10){
				c[i]=(c[i]-10);
				carry = 1;
				for(int k = m;k>=0;k--){
					System.out.print(c[k]);
					if(k==0){
						System.out.print("\n");
					}
				}
			}
			else{
				carry=0;
				for(int l = m;l>=0;l--){
					System.out.print(c[l]);
					if(l==0){
						System.out.print("\n");
					}
				}
			}
		}
		c[m]=carry;
		for(int j = m;j>=0;j--){
			System.out.print(c[j]);
		}
	}
}
