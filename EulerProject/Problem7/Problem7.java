import java.util.ArrayList;

class Problem7
{
  public static void main(String[] args)
  {
    final int result=10001;
    ArrayList<Integer> prime=new ArrayList<>();
    prime.add(2);
    for(int i=3; prime.size()<=result; i++)
    {
      for(int j=0; j<prime.size();j++)
      {
        if(i%(prime.get(j))==0)
            break;
        else  if((j+1)==prime.size())
          prime.add(i);
      }
    }
    System.out.println(prime.get(result-1));
  }
}
