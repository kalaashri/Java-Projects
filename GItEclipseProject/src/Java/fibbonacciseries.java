package Java;

public class fibbonacciseries {

	public static void main(String[] args) {
		int n=20;
		int a=0;
		int b=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}

	}

}
