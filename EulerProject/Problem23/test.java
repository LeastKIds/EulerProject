import java.util.ArrayList;

class test
{
  public static void main(String[] args)
  {
    long sum=0;
    final int MAX=28123;
    for(int i=1; i<=MAX; i++)
      sum+=i;

    ArrayList<Integer> exceedNum=new ArrayList<>();
    int exceedNumber=0;
    double ruteNumber=0;
    for(int i=2; i<=MAX; i++)
    {
      exceedNumber=0;
      ruteNumber=Math.sqrt(i);
      for(int j=1; j<=ruteNumber; j++)
      {
        if(j==1)
          exceedNumber+=1;
        else if(j==ruteNumber)
          exceedNumber+=j;
        else if(i%j==0)
        {
          exceedNumber+=j;
          exceedNumber+=(i/j);
        }
      }

      if(exceedNumber>i)
        exceedNum.add(i);
    }

    long exceedSum=0;
    int exceedSize=exceedNum.size();
    for(int i=0; i<exceedSize; i++)
      exceedSum+=(exceedNum.get(0)+exceedNum.get(i));

    for(int i=1; i<exceedSize; i++)
      exceedSum+=(exceedNum.get(i)+exceedNum.get(exceedSize-1));

    System.out.println(sum-exceedSum);
  }
}
