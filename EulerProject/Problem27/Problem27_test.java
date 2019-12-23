import java.util.ArrayList;

class Problem27_test
{
  public static void main(String[] args)
  {
    final int MAXINT=1000;
    ArrayList<Integer> primeB=new ArrayList<>();
    primeB.add(2);
    int primeBSize;
    for(int i=3; i<MAXINT; i++)
    {
      primeBSize=primeB.size();
      int j=0;
      while(true)
      {
        if(i%primeB.get(j)==0)
          break;
        else if(primeB.get(j)>Math.sqrt(i))
        {
          primeB.add(i);
          break;
        }
        j++;
      }
    }


    ArrayList<Integer> primeA=new ArrayList<>();
    for(int i=(-MAXINT)+1; i<MAXINT; i++)
      primeA.add(i);

    int primeASize=primeA.size();
    primeBSize=primeB.size();
    int[][] result=new int[primeASize][primeBSize];
    for(int a=0; a<primeASize; a++)
      for(int b=0; b<primeBSize; b++)
        result[a][b]=1;

    ArrayList<Integer> prime=new ArrayList<>();
    prime.add(2);
    int sum;
    int n=1;
    int count=primeASize*primeBSize;
    loof: while(true)
    {
      for(int a=0; a<primeASize; a++)
      {
        for(int b=0; b<primeBSize; b++)
        {
          if(count==1)
            break loof;
          if(result[a][b]==0)
            continue;

          sum=n*n + n*primeA.get(a) + primeB.get(b);
          if(sum<0 || prime.contains(sum))
          {
            System.out.println("sum<0 or sum is prime/ sum : " + sum);
            System.out.println("remove primeA : " + primeA.get(a));
            System.out.println("remove primeB : " + primeB.get(b));
            System.out.println("n : " + n);
            System.out.println("count : " + count);
            System.out.println();
            result[a][b]=0;
            count--;
            continue;
          }
          else
          {
            int ruteSum=(int)Math.sqrt(sum);
            for(int i=2; i<sum; i++)
            {
              if(sum%i==0)
              {
                result[a][b]=0;
                count--;
              }
              else if(i>ruteSum)
              {
                prime.add(sum);
                break;
              }

            }
          }
        }
      }
      n++;

    }

  }
}
