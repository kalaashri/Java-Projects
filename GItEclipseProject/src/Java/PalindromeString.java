package Java;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="madam madam";
		int lengt=s1.length();
		String rev="";
	
		for(int i=lengt-1;i>=0;i--) {
			
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		
		if(s1.equals(rev))
			System.out.println("same");
		else
			System.out.println("no");
			
		
	}

}
