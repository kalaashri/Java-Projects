package Java;

public class Prime {

	public static void main(String[] args) {
	int n=23;
	boolean isPrime=true;
	for(int i=2;i<n;i++)
	{
		if((n%i==0))
		{
			isPrime=false;
			
		break;
		}
	}
	if(isPrime)
	{
		System.out.println(n +"is prime");
		
	}
	else
		System.out.println(n +"not a prime");
			
			
			
			
	}

	}


