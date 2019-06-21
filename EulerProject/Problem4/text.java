class text
{
	public static void main(String[] args)
	{
		String s="11211";
		StringBuffer strBuf=new StringBuffer(s);
		System.out.println(s);
		
		String a=strBuf.toString(strBuf.reverse());
		
		System.out.println(s.equals(a));
		
	}
}