class Problem2
{
	public static void main(String[] args)
	{
		int num1=1;
		int num2=2;
		int num3=0;
		int sum=2;
		
		while(num2<4000000)
		{
			num3=num2;
			num2+=num1;
			num1=num3;
			
			if(num2%2==0)
				sum+=num2;
			
			
			
		}
		
		System.out.println(sum);
	}
}
