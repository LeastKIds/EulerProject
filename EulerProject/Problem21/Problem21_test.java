class Problem21_test
{
  public static void main(String[] args)
  {
    int saveNum1=0;
    int saveNum2=0;
    int sum=0;

    for(int i=1; i<=10000; i++)
    {
      saveNum1=0;
      saveNum2=0;

      saveNum1=amicable(i);
      if(saveNum1<=10000 && saveNum1!=i)
        saveNum2=amicable(saveNum1);
      if(i==saveNum2)
        sum+=i;

      //System.out.println(i);
      //System.out.println(saveNum1);
      //System.out.println(saveNum2);
      //System.out.println();

    }

    System.out.println(sum);
  }

  static int amicable(int num)
  {
    int sum=0;
    for(int i=1; i<=Math.sqrt(num); i++)
    {
      if(i==1)
        sum+=1;
      else if(num%i==0)
      {
        sum+=i;
        sum+=(num/i);
      }
    }

    return sum;
  }
}
