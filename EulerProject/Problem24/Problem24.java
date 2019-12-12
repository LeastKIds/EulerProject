import java.util.ArrayList;

class Problem24
{
  public static void main(String[] args)
  {
    //String[] num=new String[] {"0","1","2","3","4","5","6","7","8","9"};
    //int[] num=new int[] {0,1,2,3,4,5,6,7,8,9};
    ArrayList<Integer> num=new ArrayList<>();
    for(int i=0; i<10; i++)
      num.add(i);

    int max=999999;
    int count=0;
    String result="";
    int sum=1;
    int saveI=0;

    for(int i=10; i>0; i--)
    {
      for(int j=1; j<i; j++)
        sum*=j;

      if(max>sum)
      {
        count=max/sum;
        max-=count*sum;
        if(max==0)
        {
          saveI=i;
          break;
        }
        sum=1;
        result+=num.get(count);
        num.remove(count);
      }
      else
      {
        saveI=i;
        break;
      }

    }
    System.out.println(saveI);
    System.out.println(max);
    System.out.println(result);
    System.out.println(num);




  }
}
