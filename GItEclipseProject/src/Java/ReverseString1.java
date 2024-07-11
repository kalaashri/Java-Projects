package Java;

public class ReverseString1 {
	//String concatenation operator +
	public static void main (String[] args) {
		String s1="Kalaashri";
		int lengt=s1.length();
		String rev="";
	
		for(int i=lengt-1;i>=0;i--) {
			
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	
	//Also can use String buffer class which has reverse method.
	
	
	

}
