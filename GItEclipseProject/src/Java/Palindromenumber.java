package Java;

public class Palindromenumber {

	public static void main(String[] args) {
		int num=1000000002;
		int y=num;
		int rev=0;
		if(num<0)
			System.out.println("Not Palindrome");
		while(num!=0)
		{
			
			
			 rev=rev*10+num%10;
			 num=num/10;
			
			
		}
		
		if(y==rev)
		{
			System.out.println("Palindrome" +rev);
		}
		else
			
			System.out.println("Not"+rev);
	}

}
