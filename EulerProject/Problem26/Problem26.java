import java.util.ArrayList;

class Problem26
{
  public static void main(String[] args)
  {
    final int MAX=1000;
    int digit=0;
    int divideResult=0;
    int count=0;
    int maxCycle=0;
    int cycle=0;
    int maxI=0;
    for(int i=2; i<=MAX; i++)
    {
      ArrayList<Integer> reminder=new ArrayList<>();
      digit=Integer.toString(i).length();
      divideResult=(int)Math.pow(10,digit);
      count=0;
      while(divideResult%i!=0)
      {
        if(reminder.contains(divideResult))
        {
          cycle=count-reminder.indexOf(divideResult);
          if(maxCycle<cycle)
          {
            maxCycle=cycle;
            maxI=i;
          }
          break;
        }
        reminder.add(divideResult);
        divideResult%=i;
        divideResult*=10;
        count++;
      }

    }
    System.out.println();
    System.out.println("maxI : " + maxI);
    System.out.println("maxCycle : " + maxCycle);
  }
}
