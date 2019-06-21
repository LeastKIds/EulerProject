import java.util.ArrayList;

class Problem3
{
	public static void main(String[] args)
	{
		long n=600851475143L;
		boolean check=false;
		
		
		for(long i=2; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				n/=i;
				
			}
		}
			
			
		
	}
}