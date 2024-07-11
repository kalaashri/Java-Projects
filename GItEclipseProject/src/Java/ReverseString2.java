package Java;

public class ReverseString2 {
	
	public static void main (String[] args)
	{
		
		//char array
		String s1="Anand";
		char c[]=s1.toCharArray();
		int len=c.length;
	String rev="";
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+c[i];
	}
	System.out.println(rev);
	}
}
