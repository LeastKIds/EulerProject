

class Problem6
{
  public static void main(String[] args)
  {
    int addSum=0;
    int mulSum=0;

    for(int i=1; i<=100; i++)
      addSum+=Math.pow(i,2);

    for(int i=1; i<=100; i++)
      mulSum+=i;

      System.out.println(Math.pow(mulSum,2)-addSum);
  }
}
