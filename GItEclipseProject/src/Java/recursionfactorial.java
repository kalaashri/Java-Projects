package Java;

public class recursionfactorial {

	 
		
	
		
		public static int fact(int j) 
		{
			if(j<=1)
				return 1;
			else
				{int f=j*(fact(j-1));
				
		
			return f;
				}
		}
		public static void main(String args[])
		{
			int n=4;
			int g=fact(n);
			System.out.println(g);
		}
		
		

	}


