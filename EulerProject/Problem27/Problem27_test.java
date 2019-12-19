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

    ArrayList<Integer> prime=new ArrayList<>();
    prime=primeB;

    ArrayList<Integer> primeA=new ArrayList<>();
    for(int i=(-MAXINT)+1; i<MAXINT; i++)
      primeA.add(i);

    int bPlusOne;
    primeBSize=primeB.size();
    for(int i=0; i<primeBSize; i++)
    {
      bPlusOne=1+primeB.get(i);
      if(primeA.contains(bPlusOne))
        primeA.remove(primeA.indexOf(bPlusOne));
      if(primeA.contains(-bPlusOne))
        primeA.remove(primeA.indexOf(-bPlusOne));
    }

    int n=1;
    int result;
    int primeBSave=primeB.get(0);
    for(int i=0; i<primeA.size(); i++)
    {
      result=1+primeA.get(i)+primeBSave;
      if(result<=0)
      {
        primeA.remove(i);
        i--;
      }
    }


    n=1;
    primeBSize=primeB.size();
    while(primeA.size()!=1)
    {
      for(int b=0; b<primeBSize; b++)
        for(int a=0; a<primeA.size(); a++)
        {
          result=(n*n) + (n*primeA.get(a)) + primeB.get(b);
          
        }
    }
  }
}
