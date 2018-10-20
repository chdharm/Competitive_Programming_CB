package Week_1;
import java.util.*;
public class FastPower {
	//Brute-Force Method ---------> O(b)
	public static int power1(int a,int b){
		int res=1;
		for(int i=0;i<b;i++){
			res*=a;
		}
		return res;
	}
	//Divide and Conquer -----------> TIME- O(log(b)) SPACE- O(log(b))
	public static int power2(int a,int b){
		if(b==0){
			return 1;
		}
		if(b==1){
			return a;
		}
		if(b%2==0){
			int smallValue=power2(a,b/2);
			return smallValue*smallValue;
		}else{
			int smallValue=power2(a,b/2);
			return a*smallValue*smallValue;
		}
	}
	//With Bit Masking -----------> TIME- O(log(b)) SPACE- O(1)
	public static int power3(int a,int b){
		int res=1;
		while(b>0){
			if((b&1)==1)
				res*=a;
			a*=a;
			b=b>>1;
		}
		return res;
	}
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(power1(a,b));
		System.out.println(power2(a,b));
		System.out.println(power3(a,b));
	}
}

//NOTE- Complexity of recursion: (Max. depth of call stack)*(extra space consumed in each call stack) 
