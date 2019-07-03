class Problem9
{
  public static void main(String[] args)
  {
    int b=1;
    int a=1;
    int c;
    int count=1;
    while(true)
    {
      c=1000-b-a;
      if(Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2))
      {
        System.out.println("check");
        break;
      }
      if(c>b)
        b++;
      else
      {
        count++;
        a=count;
        b=count;
      }
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(a*b*c);
  }
}
