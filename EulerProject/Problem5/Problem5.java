class Problem5
{
	public static void main(String[] args)
	{
		int result=1;
		
		for(int i=2; i<=19; i++)
		{
			result=gcd(result,i);
		}
		
		System.out.println(result);
	}
	
	public static int gcd(int i, int j)
	{
		int temp1=i , temp2=j;
		int r=1;
		int LCM;
		
		if(i<j)
		{
			i=temp2;
			j=temp1;
		}
		
		while(r>0)
		{
			r=i%j;
			i=j;
			j=r;
		}
		LCM=temp1*temp2/i;
		return LCM;
	}
}