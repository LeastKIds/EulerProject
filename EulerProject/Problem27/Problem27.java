//  b>0 && prime
import java.util.ArrayList;

class Problem27
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
      for(int j=0; j<primeBSize; j++)
        if(i%primeB.get(j)==0)
          break;
        else if(primeB.get(j)>Math.sqrt(i))
        {
          primeB.add(i);
          break;
        }
    }

    ArrayList<Integer> primeA=new ArrayList<>();
    for(int i=(-MAXINT)+1; i<MAXINT; i++)
      primeA.add(i);


    int n=1;
    int maxAB=0;
    int result=0;
    int primeASize;
    loop: while(true)
    {
      primeASize=primeA.size();
      primeBSize=primeB.size();
      for(int a=0; a<primeASize; a++)
      {
        for(int b=0; b<primeBSize; b++)
        {
          result=n*n+n*primeA.get(a)+primeB.get(b);
          System.out.println("primeA : " + primeA.get(a));
          System.out.println("primeB : " + primeB.get(b));
          System.out.println("result : " + result);
          System.out.println("n : " + n);
          if(result<=0)
          {
            primeA.remove(a);
            break;
          }
          else if (!primeCheck(result))
          {
            primeA.remove(a);
            break;
          }

          if(primeA.size()==1)
          {
            maxAB=primeA.get(a)*primeB.get(b);
            break loop;
          }
        }
      }

      n++;
    }

    System.out.println(maxAB);

  }

  public static boolean primeCheck(int result)
  {
    boolean check=false;
    ArrayList<Integer> primeCheck=new ArrayList<>();
    primeCheck.add(2);
    int primeCheckSize;
    for(int i=3; i<result; i++)
    {
      primeCheckSize=primeCheck.size();
      for(int j=0; j<primeCheckSize; j++)
      {
        if(i%primeCheck.get(j)==0)
        {
          check=false;
          break;
        }
        else if(primeCheck.get(j)>Math.sqrt(i))
        {
          check=true;
          break;
        }
      }
    }

    return check;

  }

}
