package Java;

public class NoOfWordsinString {
	
	public static void main(String args[]) {
	
	String n="Anand Kalaashri Pranav Arjun";
	int len=n.length();
	System.out.println(len);
	int count =1;
	for(int i=0;i<len;i++)
	{
		if((n.charAt(i)==' ')&&(n.charAt(i+1)!=' '))
		{
			count++;
		}
		else
			continue;
	}

	System.out.println(count);
}}
