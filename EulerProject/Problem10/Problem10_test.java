import java.util.ArrayList;

class Problem10_test
{
  public static void main(String[] args)
  {
    long start=System.currentTimeMillis();


    long sum=2;
    ArrayList<Integer> prime=new ArrayList<>();
    prime.add(2);
    for(int i=3; i<2000000; i++)
    {
      for(int j=0; j<prime.size(); j++ )
      {
        if(i%prime.get(j)==0)
          break;
        else if(prime.get(j)>Math.sqrt(i))
        {
          prime.add(i);
          sum+=(long)i;
          break;
        }
      }
    }

    System.out.println(sum);

    long end=System.currentTimeMillis();
    System.out.println((end-start)/1000);
  }
}
