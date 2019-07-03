import java.util.ArrayList;

class Problem10
{
  public static void main(String[] args)
  {
    int sum=2;
    ArrayList<Integer> prime=new ArrayList<>();
    prime.add(2);
    for(int i=3; i<=10; i++)
    {
      for(int j=0; j<prime.size(); j++)
      {
        if(i%prime.get(j)==0)
        {
          break;
        }
        else if((j+1)==prime.size())
        {
          prime.add(i);
          sum+=i;
        }
      }
    }

    System.out.println(sum);
  }
}
