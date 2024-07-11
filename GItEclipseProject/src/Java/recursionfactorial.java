package Java;

public class recursionfactorial {

	 
		
	
		
		public  int fact(int j) 
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
			recursionfactorial rf=new recursionfactorial();
			
			int g=rf.fact(n);
			System.out.println(g);
		}
		
		

	}


