//  b>0 && prime
import java.util.ArrayList;

class Problem27
{
  public static void main(String[] args)
  {
    final int MAXINT=100;
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

    ArrayList<Integer> prime=new ArrayList<>();
    prime=primeB;

    ArrayList<Integer> primeA=new ArrayList<>();
    for(int i=(-MAXINT)+1; i<MAXINT; i++)
      primeA.add(i);
    System.out.println(primeA);

    int n=1;
    int maxAB=0;
    int result=0;
    int primeASize;
    loof: while(true)
    {

      for(int b=0; b<primeB.size(); b++)
        for(int a=0; a<primeA.size(); a++)
        {
          result=n*(n+primeA.get(a))+primeB.get(b);
          System.out.println("primeA : " + primeA.get(a));
          System.out.println("primeB : " + primeB.get(b));
          System.out.println("result : " + result);
          System.out.println("n : " + n);
          System.out.println();
          if(result<=0 || prime.contains(result))
            primeA.remove(a);
          else
            prime.add(result);
        }
      break;
    }

    System.out.println(maxAB);

  }


}
