import java.util.ArrayList;

class Problem27
{
  public static void main(String[] args)
  {
    final int MAXINT=1000;
    int primeBSize;
    ArrayList<Integer> primeB=new ArrayList<>();
    primeB.add(2);
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

    ArrayList<Integer> prime=new ArrayList<>();
    primeBSize=primeB.size();
    for(int i=0; i<primeBSize; i++)
      prime.add(primeB.get(i));

    System.out.println(prime);

    ArrayList<Integer> primeA=new ArrayList<>();
    for(int i=(-MAXINT)+1; i<MAXINT; i++)
      primeA.add(i);

    primeBSize=primeB.size();
    int bPlusOne;
    for(int i=0; i<primeBSize; i++)
    {
      bPlusOne=primeB.get(i)+1;
      if(primeA.contains(bPlusOne))
        primeA.remove(primeA.indexOf(bPlusOne));
      else if(primeA.contains(-bPlusOne))
        primeA.remove(primeA.indexOf(-bPlusOne));
    }

    //System.out.println(primeA);

    int n=1;
    int result;
    int lastSize=0;
    loof1: while(true)
    {
      for(int i=0; i<primeB.size(); i++)
      {
        for(int j=0; j<primeA.size(); j++)
        {
          result=n*n + n*primeA.get(j) + primeB.get(i);
          if(result<=0)
          {
            //System.out.println(primeA.get(j));
            primeA.remove(j);
            j--;
          }

          if(lastSize==primeA.size())
            break loof1;

          lastSize=primeA.size();
        }
      }
      n++;
    }

    n=1;
    loof2: while(true)
    {
      for(int b=0; b<primeB.size(); b++)
      {
        for(int a=0; a<primeA.size(); a++)
        {
          result=n*n + n*primeA.get(a) + primeB.get(b);
          if(prime.contains(result))
            continue;
          else if(result<MAXINT)
          {
            primeA.remove(a);
            a--;
          }
          else
          {
            for(int i=0; i<prime.size(); i++)
            {
              
            }
          }

        }
      }
    }

  }
}
