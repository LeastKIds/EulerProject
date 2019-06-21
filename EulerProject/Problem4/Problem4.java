class Problem4
{
	public static void main(String[] args)
	{
		int max=0;
		int min=0;
		
		forout:
		for(int i=999; i>=100; i--)
		{
			for(int j=999; j>=100; j--)
			{
				int mul_int=i*j;
				String mul_str=Integer.toString(mul_int);
				StringBuffer strBuffer=new StringBuffer(mul_str);
				strBuffer.reverse();
				
				if(mul_str.equals(strBuffer.toString()))
				{
					min=mul_int;
					if(max<min)
						max=min;	
				}
			
			}
			
		}
		System.out.println(max);
	}
}
					