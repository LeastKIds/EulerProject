class Problem16
{
  public static void main(String[] args)
  {
    long pow=1;
    for(int i=0; i<1000; i++)
    {
      pow*=2L;
      System.out.println(pow);
    }
    System.out.println(pow);
  }
}
