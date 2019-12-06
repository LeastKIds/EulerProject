import java.util.ArrayList;

class Problem21
{
  public static void main(String[] args)
  {
    ArrayList<Integer> amicable=new ArrayList<>();
    int sum1=0;
    int sum2=0;

    for(int i=2; i<=1000; i++)
    {
      sum1=0;
      sum2=0;

      if(amicable.contains(i))
        continue;

      for(int j=1; j<i; j++)
      {

        if(j==1)
          sum1+=j;
        else if(i%j==0)
        {
          sum1+=j;
          sum1+=(i/j);
        }

      }

      if(i!=sum1 && sum1<=1000)
      {

        for(int j=1; j<sum1; j++)
        {
          if(j==1)
            sum2+=j;
          else if(sum1%j==0)
          {
            sum2+=j;
          }
        }


        if(i==sum2)
        {
          amicable.add(sum1);
          amicable.add(sum2);
        }

      }


    }

    int sum=0;
    final int amicableSize=amicable.size();
    for(int i=0; i<amicableSize; i++)
    {
      sum+=amicable.get(i);
      System.out.println(amicable.get(i));
    }

    System.out.println(sum);
  }
}
