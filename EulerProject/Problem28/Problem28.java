class Problem28
{
  public static void main(String[] args)
  {
    long sum=1;
    final int MAXNUM=1001-1;
    int n=1;
    for(int plusNum=2; plusNum<=MAXNUM; plusNum+=2)
    {
      for(int count=0; count<4; count++)
      {
        n+=plusNum;
        System.out.println("n : " + n);
        sum+=n;
      }
    }

    System.out.println("sum : " + sum);
  }
}
