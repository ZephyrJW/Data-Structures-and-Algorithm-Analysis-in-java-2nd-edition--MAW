//Write a recursive method to return how many ones in N(Binary Digit).
//use this fact: if N is a odd number, then it's number of one is one more than that of N/2

public class numof1inbinary_p19 {
	public static void main(String args[]){
		int m = getnumof1(5);
		System.out.println(m);
	}
	
	public static int getnumof1(int n){
		int i=0;
		if(n%2!=0) i++;
		if(n>0){
			i+=getnumof1(n/2);
		}
		return i;
	}
}
