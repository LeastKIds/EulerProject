class test
{
  public static void main(String[] args)
  {
    int j=3;
    while(j!=1)
    {
      if(j%2==0)
        j/=2;
      else
        j=j*3+1;

      System.out.println(j);
    }
  }
}
