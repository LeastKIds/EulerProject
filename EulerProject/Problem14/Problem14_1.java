import java.util.ArrayList;
import java.util.List;

class Problem14_1
{
  public static void main(String[] args)
  {
    List<Object> Num=new ArrayList<Object>();

    int i=1;
    while(i<=(1000000-1)*3+1)
    {
      if(Num.contains(i))
        continue;
      Num.add(i);

      if(i%2!=0)
        i*=2;
      else
      {
        if((i-1)%3==0 && (i-1)/3!=1)
          i=(i-1)/3;
        else
          i*=2;
      }
      System.out.println(i);
    }

    System.out.println(i);
  }
}
