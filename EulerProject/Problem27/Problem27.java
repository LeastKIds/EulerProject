import java.util.ArrayList;

class Problem27
{
  public static void main(String[] args)
  {
    long beforeTime=System.currentTimeMillis();


    final int MAXINT=1000;
    int result=0;
    int n=0;
    int maxN=0;
    int maxResult=0;
    ArrayList<Integer> primeB=new ArrayList<>();
    primeB.add(2);
    int primeBSize;
    for(int i=3; i<MAXINT; i++)
    {
      primeBSize=primeB.size();
      for(int j=0; j<primeBSize; j++)
      {
        if(i%primeB.get(j)==0)
          break;
        else if(primeB.get(j)>Math.sqrt(i))
        {
          primeB.add(i);
          break;
        }
      }
    }

    primeBSize=primeB.size();
    for(int a=(-MAXINT)+1; a<MAXINT; a++)
    {
      for(int b=0; b<primeBSize; b++)
      {
        n=0;
        loof: while(true)
        {
          result=n*n + n*a + primeB.get(b);
          if(result<0)
            break;
          else
          {
            for(int i=2; i<Math.sqrt(result); i++)
              if(result%i==0)
                break loof;
          }

          n++;
        }
        if(n>maxN)
        {
          maxN=n;
          maxResult=a*primeB.get(b);
        }
      }
    }
    System.out.println(maxN);
    System.out.println(maxResult);

    long afterTime=System.currentTimeMillis();
    System.out.println("Time : " + (afterTime-beforeTime));
  }
}
