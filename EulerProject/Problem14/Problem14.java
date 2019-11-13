import java.util.ArrayList;
import java.util.List;

class Problem14
{
  public static void main(String[] args)
  {
    List<Object> Num=new ArrayList<Object>();
    Num.add(1);

    int maxCount=0, maxNum=0;

    for(int i=2; i<=1000000; i++)
    {
      if(Num.contains(i))
        continue;

      int count=0;
      int j=i;
      while(j!=1)
      {
        if(j%2==0)
          j/=2;
        else
          j=j*3+1;

        count++;
      }

      Num.add(i);
      if(maxCount<count)
      {
        maxCount=count;
        maxNum=i;
      }
      System.out.println(i);

    }

    System.out.println(maxNum);
    System.out.println(maxCount);
  }
}
