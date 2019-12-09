import java.util.ArrayList;

class Problem23
{
  public static void main(String[] args)
  {
    int sum=0;
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

    ArrayList<Integer> overlap=new ArrayList<>();
    int exceedSize=exceedNum.size();
    int exceedSum=0;
    for(int i=0; i<exceedSize; i++)
      for(int j=i; j<exceedSize; j++)
      {
        exceedSum=exceedNum.get(i)+exceedNum.get(j);
        if(exceedSum>MAX)
          break;
        else if(overlap.contains(exceedSum))
          continue;
        else
          overlap.add(exceedSum);


          sum-=exceedSum;
          System.out.println(exceedSum);
          System.out.println(sum);
          System.out.println(i);
        }

    System.out.println(sum);

  }
}
