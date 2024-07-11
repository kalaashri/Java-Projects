package Java;

public class countingvowels {

	public static void main(String[] args) {
		String s1="hgfd";
		int len=s1.length();
		int count =0;
		for(int i=0;i<len;i++)
		{
			char c=s1.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
			{
				count++;
			}
		}
				
System.out.println(count);
	}

}
